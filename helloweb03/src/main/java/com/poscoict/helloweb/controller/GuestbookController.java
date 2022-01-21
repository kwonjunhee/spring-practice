package com.poscoict.helloweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @RequestMapping : 클래스(타입) 단독 매핑
 * => 비추 방법
 * 
 */

@Controller
@RequestMapping("/guestbook/*") // => 메소드랑 매핑됨
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping //=> 따로 url 없음
	public String list() {
		return "GuestbookController.list()";
	}

	@ResponseBody
	@RequestMapping //=> 따로 url 없음
	public String delete() {
		return "GuestbookController.delete()";
	}
}
