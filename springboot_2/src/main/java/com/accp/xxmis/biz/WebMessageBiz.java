package com.accp.xxmis.biz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.xxmis.dao.IWebMessageDao;
import com.accp.xxmis.pojo.Record;
import com.accp.xxmis.pojo.Student;
import com.accp.xxmis.pojo.WebMessage;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class WebMessageBiz {

	@Autowired
	private IWebMessageDao messageDao;

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addMessage(WebMessage message) {
		messageDao.saveMessage(message);
	}

	public PageInfo<WebMessage> findMessageListByPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<WebMessage>(messageDao.queryAllMessage());
	}
	
	/**
	 * 分页查询学生表
	 */
	public PageInfo<Student> findstu(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		return new  PageInfo<Student>(messageDao.queryStu());
	}
	/**
	 * 查询记录
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Record> findrec(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum,pageSize);
		return new PageInfo<Record>(messageDao.queryRec());
	}
	/**
	 * 添加
	 * @param shop
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addPerson(Record record) {
		messageDao.saveRec(record);
	} 
	/**
	 * 修改
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void modshop(Record record) {
		messageDao.modif(record);
	}
	/**
	 * 删除
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void removeId(Integer id) {
		messageDao.del(id);
	}
	/**
	 * 加载修改id
	 */
	public Record gettextById(Integer id) {
		return messageDao.load(id);
	}
}
