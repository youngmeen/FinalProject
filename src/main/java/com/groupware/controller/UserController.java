package com.groupware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.groupware.service.BoardService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/user")
@Log4j
public class UserController {

	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() throws Exception{
		
		
		return "user/login";
	}

	//데이터베이스를 긁어오려면 Service를 이용해서 가져오기
	
	@RequestMapping(value = "/regist", method =RequestMethod.GET)
	public String regist() throws Exception {
		
		
		
		return "user/regist";
	}

}
