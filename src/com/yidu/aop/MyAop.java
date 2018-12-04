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
	/*//ǰ��֪ͨ
		public void before(){
			System.out.println("����ǰ��֪ͨ!!");
		}
		//����֪ͨ
		public void afterReturning(){
			System.out.println("���Ǻ���֪ͨ(��������쳣�������)!!");
		}
		//����֪ͨ
		public Object around(ProceedingJoinPoint pjp) throws Throwable {
			System.out.println("���ǻ���֪֮ͨǰ�Ĳ���!!");
			Object proceed = pjp.proceed();//����Ŀ�귽��
			System.out.println("���ǻ���֪֮ͨ��Ĳ���!!");
			return proceed;
		}
		//�쳣֪ͨ
		public void afterException(){
			System.out.println("������!�����쳣��!!");
		}
		//����֪ͨ
		public void after(){
			System.out.println("���Ǻ���֪ͨ(�����쳣Ҳ�����)!!");
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
		System.out.println("��ʼ��");
		Object result=arg0.proceed();
		System.out.println("��ʼ��");
		return result;
	}*/
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		System.out.println("method="+method.getName()+"\t"+args.length+"\t"+target+"\t"+ex.getMessage());
	}

}
