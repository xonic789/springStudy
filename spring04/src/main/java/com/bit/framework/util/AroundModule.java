package com.bit.framework.util;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundModule implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
//		System.out.println("before");
//		Object obj=invocation.proceed();
//		System.out.println("after");
//		return obj;	
//	}
		Object obj=null;
		System.out.println("Around(before)...");
		try {
		obj=invocation.proceed();
		System.out.println("Around(after)...");
		}catch (Exception e) {
			System.out.println("Around(throw)...");
		}
		return obj;
	}

	
}
