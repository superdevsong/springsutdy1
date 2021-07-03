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
		//readme�� ���� �κ��� �������س��� �𸣸� �����ϵ���!!
		/*���������� ���ü��� �ѱ��
		 * Exam exam = new SongExam();
		ExamConsole console  = new GridExamConsole();*/
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
	
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print(); //�׸���� ���
		//List<Exam> exams = (List<Exam>) context.getBean("exams");//Exam�� ���������� �޴� �÷��� ���� 
		
		//for(Exam e :exams)//����Ʈ ���
		//	System.out.println(e);
		
	}

}
