package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
	Exam exam;
	public GridExamConsole() {
		// 여기가 비어있어서 당황스럽겠지만 최초에 내가 구현할때는 아래에있는 생성자로 구현해서 그래
	}
	public GridExamConsole(Exam exam) {
		//성적을 받는 부분이야
		super();
		this.exam = exam;
	}

	@Override
	public void print() {
		//성적출력
		System.out.println("┌─────────┬─────────┐");
		System.out.println("│  total  │   avg   │");
		System.out.println("├─────────┼─────────┤");
		 System.out.printf("│   %3d   │  %3.2f   │\n",exam.total(),exam.avg());
		System.out.println("└─────────┴─────────┘");

	}

	@Override
	public void setExam(Exam exam) {
		/*성적을 받는 dependency injection부분이야
		 * 위에꺼도 맞지만 스프링에서는 여기가 더 효율적이지*/
		this.exam = exam;

		
	}

}
