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
	
	public void func01() {
		console.sayHello();
	}
	public void func02() {
		console.sayHi();
	}
}
