package com.bit.framework.service;

public class Module01 {
	ConsoleServiece console;
	
	public Module01(ConsoleServiece console) {
		super();
		this.console=console;
	}
	
	public void func01() {
		ConsoleServiece console = new EngConsoleService();
		console.sayHello();
	}
	
	public void func02() {
		ConsoleServiece console = new EngConsoleService();
		for(int i=0;i<5;i++)
		console.sayHi();
	}
}
