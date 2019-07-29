package com.accp.xxmis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.accp.xxmis.biz.WebMessageBiz;
import com.accp.xxmis.pojo.WebMessage;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot2ApplicationTests {
	
	@Autowired
	private WebMessageBiz biz;
	
	@Test
	public void contextLoads() {
		biz.addMessage(new WebMessage("aa", "bb"));
	}

}
