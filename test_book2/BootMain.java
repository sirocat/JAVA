package test_book2;

public class BootMain {

	public static void main(String[] args) {
		Cartoon c1 = new Cartoon();
		c1.title = "������ȭ";
		c1.writer = "��Ǯ";
		c1.webtoon = true;
		
		c1.printBook();
	
		Major m1 = new Major();
		m1.title = "�ڹ��� ����";
		m1.writer = "���ù�";
		m1.subject = "���α׷���";	
		
		m1.printBook();
	}
}
