package com.poscoict.aoptest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	// 메소드에 관한 걸 다 적어줌. 리턴타입, 전체 패키지, 메소드 이름(클래스 이름)
	@Before("execution(public com.poscoict.aoptest.vo.ProductVo com.poscoict.aoptest.service.ProductService.find(String))")
	public void beforeAdvice() {
		// finding 보다 먼저 나옴 
		System.out.println("--Before Advice");
	}
	
	@After("execution(* *..*.ProductService.find(..))")
	public void afterAdvice() {
		
		System.out.println("--After Advice");	
	}
	
	@AfterReturning ("execution(* *..*.ProductService.*(..))")
	public void afterReturningAdvice() {
		System.out.println("--After Returning Advice--");
	}
	
	@AfterThrowing (value="execution(* *..*.*.*(..))", throwing="ex")
	public void afterThrowingAdvice(Throwable ex) {
		System.out.println("--After Throwing Advice" + ex + " --");
	}
	
	@Around("execution(* *..*.ProductService.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		// before
		System.out.println("--Around(Before) Advice--");
		// PointCut method 실행
		// 파라미터 변경
		Object[] params = {"Camera"};
		// PointCut method 실행
		Object result = pjp.proceed(params);
		// after
		System.out.println("--Around(after) Advice--");

		return result;
		// 비포애픛터 쓰지 말고 어라운드에 순서 맞춰 쓰면 됨. 그래서 이걸 많이 쓴다.
	}
}
