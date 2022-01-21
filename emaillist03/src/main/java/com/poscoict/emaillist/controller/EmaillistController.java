package com.poscoict.emaillist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poscoict.emaillist.repository.EmaillistRepository;


@Controller
public class EmaillistController {
	// 의존성 주입
	@Autowired // 컨테이너가 emaillistRepository 세팅해야함을 알고 DI
	private EmaillistRepository emaillistRepository;
	
	@ResponseBody
	@RequestMapping("")
	public String index() {
		System.out.println(emaillistRepository);
		//	List<EmaillistVo> list = emaillistRepository.findAll();
		return "emaillist";
	}
}
