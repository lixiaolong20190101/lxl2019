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
		System.out.println("这是before()");
		Object proceed=null;
		try {
			 proceed = jp.proceed();
			 System.out.println("参数"+Arrays.toString(jp.getArgs()).toString());
			 System.out.println("方法"+jp.getSignature().getName());
			 System.out.println("这是after()");
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
