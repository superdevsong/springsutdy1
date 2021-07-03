package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {
	@Autowired(required = false) //Autowired 속성에 required사용해서 exam 알맞은거 없으면 null
	@Qualifier("exam")
	Exam exam;	
	
	public GridExamConsole() {
		System.out.println("constructor");
	}
	public GridExamConsole(Exam exam) {
		System.out.println("overloaded constructor");
		this.exam = exam;
	}

	@Override
	public void print() {
		//성적출력
		if(exam==null) {
		System.out.println("┌─────────┬─────────┐");
		System.out.println("│  total  │   avg   │");
		System.out.println("├─────────┼─────────┤");
		 System.out.printf("│   0     │    0    │\n");
		System.out.println("└─────────┴─────────┘");
		}
		else {
			System.out.println("┌─────────┬─────────┐");
			System.out.println("│  total  │   avg   │");
			System.out.println("├─────────┼─────────┤");
			 System.out.printf("│   %3d   │  %3.2f   │\n",exam.total(),exam.avg());
			System.out.println("└─────────┴─────────┘");
		}
	}
	
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;

		
	}

}
