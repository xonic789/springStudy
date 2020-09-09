package com.bit.framework.service;

public class Module02 {
	ConsoleServiece console;
	public void setConsole(ConsoleServiece console) {
		this.console = console;
	}
	
	public Module02() {
	}
	public Module02(ConsoleServiece console) {
		super();
		this.console = console;
	}
	
	public int func01() {
		console.sayHello();
		return 1234;
	}
	public void func02() {
		int[] arr= {1,3,5,7,9};
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+":");
			console.sayHi();
		}
	}
}
