package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.SongExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class Program {

	public static void main(String[] args) {
		//readme에 이쪽 부분을 더설명해놨어 모르면 참고하도록!!
		/*스프링에게 지시서르 넘긴다
		 * Exam exam = new SongExam();
		ExamConsole console  = new GridExamConsole();*/
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
	
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print(); //그리드로 출력
		//List<Exam> exams = (List<Exam>) context.getBean("exams");//Exam을 제누릭으로 받는 컬렉션 생성 
		
		//for(Exam e :exams)//리스트 출력
		//	System.out.println(e);
		
	}

}
