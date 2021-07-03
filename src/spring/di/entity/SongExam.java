package spring.di.entity;

import org.springframework.stereotype.Component;

@Component
public class SongExam implements Exam {
	/*exam �������̽��� ����ϴ� Ŭ������
	 * ������ �� ���񿡴��� ������ �׸��� �������̽����� ������
	 * ������� ���⼭ �ٽ� �籸�� �߾� ����� ������ ������ �������� �����Ұ�*/
	private int kor;
	private int eng;
	private int math;
	private int com;
	public SongExam() {
		// TODO Auto-generated constructor stub
	}
	
	//�ɹ����� �ʱ�ȭ�ϴ� �Լ� ����
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
	//tostring �Լ� �߰�
	@Override
	public String toString() {
		return "SongExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}
	

}
