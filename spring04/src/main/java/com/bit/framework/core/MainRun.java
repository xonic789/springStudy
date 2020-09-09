package com.bit.framework.core;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.framework.model.entity.DeptVo;
import com.bit.framework.service.ConsoleServiece;
import com.bit.framework.service.DeptService;

public class MainRun {
	ConsoleServiece console;
	

	public static void main(String[] args) throws SQLException {
		
//		Module02 module = new Module02(new EngConsoleService());
//		
//		module.func01();
//		
//		module.func02();
//		
		
		ApplicationContext ac= null;
//		ac=new GenericXmlApplicationContext("classpath:/applicationContext.xml");
		ac=new ClassPathXmlApplicationContext("/applicationContext.xml");
//		ac=new FileSystemXmlApplicationContext("E:\\e-govWorkspace2\\spring04\\src\\main\\resources\\applicationContext.xml");
//		Module02 module=(Module02) ac.getBean("module02");
//		module.func01();
//		module.func02();
		
//		Module03 module = (Module03) ac.getBean("module03");
//		System.out.println(module);
		
//		Module04 module = (Module04)ac.getBean("module");
//		module.arrayShow();
//		module.listShow();
//		module.setShow();
//		module.mapShow();
//		AOP(관점지향 프로그래밍,Aspect Oriented Programming)
//		Module02 module=(Module02)ac.getBean("proxyBean");
//		module.func01();
//		
//		module.func02();
		DeptService deptService = (DeptService) ac.getBean("deptService");
//		for(DeptVo bean : deptService.list()) {
//			System.out.println(bean);
//		}
		deptService.insert(new DeptVo(0,"test10","test11"));
		
//		System.out.println(deptService.detail(1));
		
	}

}
