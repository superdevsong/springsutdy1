package spring.di.entity;

import org.springframework.stereotype.Component;

@Component
public class SongExam implements Exam {
	/*exam 인터페이스를 상속하는 클래스야
	 * 내용은 각 과목에대한 변수들 그리고 인터페이스에서 구현한
	 * 내용들을 여기서 다시 재구현 했어 어려운 내용은 없으니 이정도만 설명할게*/
	private int kor;
	private int eng;
	private int math;
	private int com;
	public SongExam() {
		// TODO Auto-generated constructor stub
	}
	
	//맴버변수 초기화하는 함수 생성
	public SongExam(int kor, int eng, int math, int com) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}


	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return kor+eng+math+com;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total()/4.0f;
	}
	//tostring 함수 추가
	@Override
	public String toString() {
		return "SongExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}
	

}
