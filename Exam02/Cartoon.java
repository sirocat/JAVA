package Exam02;

public class Cartoon extends Book{
	boolean webtoon;

	@Override
	public void printBook() {
		super.printBook();
		
		if(webtoon)
			System.out.println("�� ��ȭ�� �����Դϴ�");
		else
			System.out.println("�� ��ȭ�� ������ �ƴմϴ�");
	
	}
	
}
