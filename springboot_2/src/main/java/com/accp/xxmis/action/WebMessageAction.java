package com.accp.xxmis.action;

import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.xxmis.biz.WebMessageBiz;
import com.accp.xxmis.pojo.Record;
import com.accp.xxmis.pojo.Student;
import com.accp.xxmis.pojo.WebMessage;
import com.accp.xxmis.util.LoggerUtils;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/c")
public class WebMessageAction {

	@Autowired
	private WebMessageBiz messageBiz;

/*	@GetMapping("getList")
	public String getMessageList(Integer p, Integer s, Model model) {
		PageInfo<WebMessage> pageInfo = messageBiz.findMessageListByPage(p, s);
		//pageInfo.getList().clear();
		model.addAttribute("PAGE_INFO", pageInfo);
		return "msg";
	}

	@GetMapping("del1")
	public String removeMessageInfo1(Integer mid) {
		LoggerUtils.debug(WebMessageAction.class, "移除id:" + mid);
		return "redirect:/c/message/getList?p=1&s=3";
	}

	@GetMapping("del2/{mid}")
	@ResponseBody
	public Map<String, Object> removeMessageInfo2(@PathVariable Integer mid) {
		LoggerUtils.debug(WebMessageAction.class, "移除id:" + mid);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		return message;
	}*/
	/**
	 * 学生表
	 */
	@GetMapping("getStu")
	public String getStu(Integer p,Integer s,Model model) {
		PageInfo<Student> pageInfo=messageBiz.findstu(p,s);
		model.addAttribute("PAGE_INFO",pageInfo);
		return "msg";
	}
	/**
	 * 根据学号查询奖惩表
	 */
	@GetMapping("getRec")
	public String getRec(Integer p,Integer s,Model model) {
		PageInfo<Record> pageInfo=messageBiz.findrec(p, s);
		model.addAttribute("PAGE_INFO",pageInfo);
		return "msg";
	}
	/**
	 * 添加text表
	 */
	@RequestMapping(value = "/c/save", method = RequestMethod.POST)
	public Map<String, String> addTextInfo(@RequestBody Record record) {
		Map<String, String> message = new HashMap<String, String>();
		messageBiz.addPerson(record);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	/**
	 * 删除text表
	 */
	@RequestMapping(value = "/c/record/{id}", method = RequestMethod.DELETE)
	public Map<String, String> delTextInfo(@PathVariable Integer id) {
		Map<String, String> message = new HashMap<String, String>();
		messageBiz.removeId(id);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	/**
	 * 修改text表
	 */
	@RequestMapping(value = "/t/record", method = RequestMethod.PUT)
	public Map<String, String> updateTextInfo(@RequestBody Record record) {
		Map<String, String> message = new HashMap<String, String>();
		messageBiz.modshop(record);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	/**
	 * 加载修改id
	 */
	@RequestMapping(value = "/t/load/{id}", method = RequestMethod.GET)
	public Record getTextInfo(@PathVariable Integer id) {
		return messageBiz.gettextById(id);
	}
}
