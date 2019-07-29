package com.accp.xxmis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.xxmis.pojo.Record;
import com.accp.xxmis.pojo.Student;
import com.accp.xxmis.pojo.WebMessage;


public interface IWebMessageDao {

	public void saveMessage(@Param("message") WebMessage message);

	public List<WebMessage> queryAllMessage();
	/**
	 * 查看学生表
	 */
	public List<Student> queryStu();
	/**
	 * 根据学生id查看奖惩表
	 */
	public List<Record> queryRec();
	/**
	 * 删除记录
	 */
	public int del(@Param("id")int id);
	/**
	 * 添加记录
	 */
	public void saveRec(@Param("record")Record record);
	/**
	 * 修改记录
	 */
	public int  modif(@Param("record")Record record);
	/**
	 * 加载要修改的id
	 */
	public Record load(@Param("id")int id);

}
