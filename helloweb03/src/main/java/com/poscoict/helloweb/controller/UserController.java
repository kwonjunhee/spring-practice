package com.poscoict.helloweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @RequestMapping: 클래스(타입) + 메소드(핸들러)
 * 이 방법을 많이 쓸거임
 * 
 */

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
//	나중에는 @GetMapping 요렇게 바뀜 
//	@RequestMapping("value=/join") value는 생략 가능
//	근데 method같은거 같이 써주려면 써야함
	public String join() {

		// url이 같아도 메소드가 포스트인지 겟인지에 따라 구별 가능
		// 오버로드가 되어서 이름이 같아도 괜찮음
		return "/WEB-INF/views/join.jsp";
	}
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(UserVo vo) {
		System.out.println(vo);
		return "redirect:/";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam("n") String name) {
		// 요청 파라미터가 n으로 넘어오면 그걸 String name으로 처리해라
		System.out.println(name);
		/*
		 * 만일, n이라는 이름의 파라미터가 없는 경우
		 * 400 bad requestr 에러 발생함.
		 */
		return "UserController.update()";
	}
	
	// 추천 방식
	@ResponseBody
	@RequestMapping("/update2")
	public String update2(@RequestParam(value="n", required=true, defaultValue="") String name,
						@RequestParam(value="a", required=true, defaultValue="0") int age) {
		System.out.println("====" + name+ "====");
		System.out.println("====" + age+ "====");
		
		return "UserController.update2()";
	}
}
