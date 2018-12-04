package com.yidu.aop;


import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class MyAop {

	/*  @Around(value="execution(* com.yidu.service.StudentService.delete(..))")
	public Object before(ProceedingJoinPoint jp){
		System.out.println("����before()");
		Object proceed=null;
		try {
			 proceed = jp.proceed();
			 System.out.println("����"+Arrays.toString(jp.getArgs()).toString());
			 System.out.println("����"+jp.getSignature().getName());
			 System.out.println("����after()");
		} catch (Throwable e) {
			e.printStackTrace();
		}

		return proceed;
	}*/
	/*  @Pointcut(value="execution(* com.yidu.service.StudentService.delete(..))")
    public void hello() {

    }*/
	@Pointcut("execution(* com.yidu.service.StudentService.*(..))")
	public void hello(){};
	@Before("hello()")
	public void after() {
		System.out.println("after()");
	}
}
