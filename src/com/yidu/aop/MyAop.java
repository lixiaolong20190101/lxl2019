package com.yidu.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
//AfterReturningAdvice  MethodBeforeAdvice MethodInterceptor  ThrowsAdvice
public class MyAop implements ThrowsAdvice  {
	public MyAop() {
		System.out.println("ok");
	}
	/*//前置通知
		public void before(){
			System.out.println("这是前置通知!!");
		}
		//后置通知
		public void afterReturning(){
			System.out.println("这是后置通知(如果出现异常不会调用)!!");
		}
		//环绕通知
		public Object around(ProceedingJoinPoint pjp) throws Throwable {
			System.out.println("这是环绕通知之前的部分!!");
			Object proceed = pjp.proceed();//调用目标方法
			System.out.println("这是环绕通知之后的部分!!");
			return proceed;
		}
		//异常通知
		public void afterException(){
			System.out.println("出事啦!出现异常了!!");
		}
		//后置通知
		public void after(){
			System.out.println("这是后置通知(出现异常也会调用)!!");
		}*/

/*	@Override
	public void afterReturning(Object arg0, Method method, Object[] arg2, Object arg3) throws Throwable {
		
		for (Object object : arg2) {
			System.out.println(object.toString());
		}
		System.out.println("method="+method.getName()+"\t"+arg0+"\t"+arg2.toString()+"\t"+arg3);
		
	}*/
/*	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		
		for (Object object : arg1) {
			System.out.println(object.toString());
		}
		System.out.println("method="+arg0.getName()+"\t"+arg0+"\t"+arg2.toString());
		
		
	}*/
/*	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("开始！");
		Object result=arg0.proceed();
		System.out.println("开始！");
		return result;
	}*/
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		System.out.println("method="+method.getName()+"\t"+args.length+"\t"+target+"\t"+ex.getMessage());
	}

}
