package test_book2;

public class Cartoon extends Book {
	boolean webtoon;

	@Override
	void printBook() {
		
		super.printBook();
		
		if(webtoon)
			System.out.println("�� ��ȭ�� �����Դϴ�");
		else
			System.out.println("�� ��ȭ�� ������ �ƴմϴ�");
	
	
	}
	
}
