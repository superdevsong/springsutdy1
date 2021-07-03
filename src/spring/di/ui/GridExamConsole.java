package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
	Exam exam;
	public GridExamConsole() {
		// ���Ⱑ ����־ ��Ȳ���������� ���ʿ� ���� �����Ҷ��� �Ʒ����ִ� �����ڷ� �����ؼ� �׷�
	}
	public GridExamConsole(Exam exam) {
		//������ �޴� �κ��̾�
		super();
		this.exam = exam;
	}

	@Override
	public void print() {
		//�������
		System.out.println("������������������������������������������");
		System.out.println("��  total  ��   avg   ��");
		System.out.println("������������������������������������������");
		 System.out.printf("��   %3d   ��  %3.2f   ��\n",exam.total(),exam.avg());
		System.out.println("������������������������������������������");

	}
	@Autowired
	@Qualifier("exam")
	@Override
	public void setExam(Exam exam) {
		/*������ �޴� dependency injection�κ��̾�
		 * �������� ������ ������������ ���Ⱑ �� ȿ��������*/
		this.exam = exam;

		
	}

}
