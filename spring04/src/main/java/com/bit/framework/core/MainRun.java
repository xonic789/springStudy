package com.bit.framework.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bit.framework.service.ConsoleServiece;
import com.bit.framework.service.Module04;

public class MainRun {
	ConsoleServiece console;
	

	public static void main(String[] args) {
		
//		Module02 module = new Module02(new EngConsoleService());
//		
//		module.func01();
//		
//		module.func02();
//		
		
		ApplicationContext ac= null;
		ac=new GenericXmlApplicationContext("classpath:/applicationContext.xml");
//		ac=new ClassPathXmlApplicationContext("/applicationContext.xml");
//		ac=new FileSystemXmlApplicationContext("E:\\e-govWorkspace2\\spring04\\src\\main\\resources\\applicationContext.xml");
//		Module02 module=(Module02) ac.getBean("module02");
//		module.func01();
//		module.func02();
		
//		Module03 module = (Module03) ac.getBean("module03");
//		System.out.println(module);
		
		Module04 module = (Module04)ac.getBean("module");
		module.arrayShow();
		module.listShow();
		module.setShow();
		module.mapShow();
	}

}
