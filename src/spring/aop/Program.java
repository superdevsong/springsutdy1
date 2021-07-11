package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.SongExam;
import spring.di.SongDiConfig;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context =
				//new AnnotationConfigApplicationContext(SongDiConfig.class);
				new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		Exam exam =(Exam) context.getBean("exam"); //프록시 빈가져옴 
		
		System.out.println(exam.total());//뒤에설정한프록시 값들이 나옴 
		System.out.println(exam.avg());
		
		
		
	
//		Exam exam = new SongExam(1,1,1,1);//국수영과 각 점수 1인 클래스 생
//		
//		Exam proxy = (Exam) Proxy.newProxyInstance(SongExam.class.getClassLoader(),
//				new Class[] {Exam.class},
//				new InvocationHandler() {
//
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						long start = System.currentTimeMillis();//현재 시간 밀리세컨단위로!!
//						Object result = method.invoke(exam, args);
//						try {
//							Thread.sleep(200);//200ms초 쉼 
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//						long end = System.currentTimeMillis();
//						
//						String message = (end - start) + "ms걸림";
//						System.out.println(message);						
//						return result;
//					}
//			
//		});// Exam 인터페이스를 적용하는 SongExam 클래스의 프록시 생성 
		

	}

}
