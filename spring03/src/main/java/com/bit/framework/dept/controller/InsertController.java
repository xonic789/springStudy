package com.bit.framework.dept.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.AbstractController;

public class InsertController extends AbstractCommandController{
	Logger log = Logger.getLogger(this.getClass());
	

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		
		log.debug("dname:"+dname+",loc:"+loc);
		
		return new ModelAndView("redirect:/dept/list.bit");
	}

}
	
