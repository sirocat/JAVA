package test_book2;

public class Major extends Book{
	String subject;

	@Override
	void printBook() {
		super.printBook();
		System.out.println("�����оߴ�"+subject+"�Դϴ�");
	}
	
	
	
}
