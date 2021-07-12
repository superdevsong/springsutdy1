package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice{
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
	System.out.println("예외가 발생하였씁니다."+e.getMessage());//SongExam에서 넣은 예외 메시지와 예외발생 메시지 출
	}
}
