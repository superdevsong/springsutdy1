package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.SongExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Program {

	public static void main(String[] args) {
		//readme에 이쪽 부분을 더설명해놨어 모르면 참고하도록!!
		/*스프링에게 지시서르 넘긴다
		 * Exam exam = new SongExam();
		ExamConsole console  = new GridExamConsole();
		console.setExam(exam);-->ㅅsetting.xml로 옮겨버려잇!! setting.xml내용 확인하라고!!*/
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		//spring context인데 이걸로 xml의 빈의 내용을 불러와 구현하는거야 이쪽에서는 가져오기만 하면되는거지
		//ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		//위에껄로 구현해도 되고 아래꺼로 해두되는데 아래꺼가 캐스팅 안하고 편하지 xml의 내용중에 class형식의 맞는걸 찾아오는 함수야
		console.print();
	}

}
