package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import spring.aop.entity.Exam;
import spring.aop.entity.SongExam;

public class Program {

	public static void main(String[] args) {
		Exam exam = new SongExam(1,1,1,1);//국수영과 각 점수 1인 클래스 생
		
		Exam proxy = (Exam) Proxy.newProxyInstance(SongExam.class.getClassLoader(),
				new Class[] {Exam.class},
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						long start = System.currentTimeMillis();//현재 시간 밀리세컨단위로!!
						Object result = method.invoke(exam, args);
						try {
							Thread.sleep(200);//200ms초 
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						long end = System.currentTimeMillis();
						
						String message = (end - start) + "ms걸림";
						System.out.println(message);						
						return result;
					}
			
		});// Exam 인터페이스를 적용하는 SongExam 클래스의 프록시 생성 
		System.out.println(proxy.total());
		System.out.println(proxy.avg());

	}

}
