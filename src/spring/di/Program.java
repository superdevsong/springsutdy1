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
		//readme�� ���� �κ��� �������س��� �𸣸� �����ϵ���!!
		/*���������� ���ü��� �ѱ��
		 * Exam exam = new SongExam();
		ExamConsole console  = new GridExamConsole();
		console.setExam(exam);-->��setting.xml�� �Űܹ�����!! setting.xml���� Ȯ���϶��!!*/
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		//spring context�ε� �̰ɷ� xml�� ���� ������ �ҷ��� �����ϴ°ž� ���ʿ����� �������⸸ �ϸ�Ǵ°���
		//ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		//�������� �����ص� �ǰ� �Ʒ����� �صεǴµ� �Ʒ����� ĳ���� ���ϰ� ������ xml�� �����߿� class������ �´°� ã�ƿ��� �Լ���
		console.print();
	}

}
