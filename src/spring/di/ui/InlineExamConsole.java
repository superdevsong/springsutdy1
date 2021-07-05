package spring.di.ui;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	private Exam exam;
	public InlineExamConsole() {
		// 여기가 비어있어서 당황스럽겠지만 최초에 내가 구현할때는 아래에있는 생성자로 구현해서 그래
	}
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("total is %d, avg if %f\n",exam.total(),exam.avg());
	}

	@Override
	public void setExam(Exam exam) {
		/*성적을 받는 dependency injection부분이야
		 * 위에꺼도 맞지만 스프링에서는 여기가 더 효율적이지*/
		this.exam = exam;
		
	}

}