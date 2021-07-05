package spring.di.ui;

import spring.di.entity.Exam;

public interface ExamConsole {
	/*보면 대충 먼뜻인지 알겠지만
	 * setExam을 통해서 앞에서 구현한 인터페이스 exam의 성적들을 받고
	 * 그것을 print로 출력한다는내용이야
	 * */
	void print();

	void setExam(Exam exam);
	
}