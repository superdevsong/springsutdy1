package spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long start = System.currentTimeMillis();//현재 시간 밀리세컨단위로!!
		Object result = invocation.proceed();
		try {
			Thread.sleep(200);//200ms초 쉼 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		
		String message = (end - start) + "ms걸림";
		System.out.println(message);						
		return result;
	}

}
