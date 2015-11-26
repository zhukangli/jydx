package com.conley.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.conley.pojo.User;
import com.conley.service.IUserService;

@Controller
public class Test {
	@Autowired
	private IUserService userService ;
	@RequestMapping(value="/hello")
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws
	Exception {   
		ModelAndView mv = new ModelAndView();
		List<User>	list=	userService.findAll();
		String message="";
		for(User user:list){
			message=user.getUser_name();
		}
		mv.addObject("message",message);
		mv.setViewName("hello");
		return mv; 
	}	

}
