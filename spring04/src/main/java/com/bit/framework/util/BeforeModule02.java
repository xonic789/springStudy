package com.bit.framework.util;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeModule02 implements MethodBeforeAdvice{

	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("module02 동작 전 작동");
	}
	
}
