package Exam02;

public class Major extends Book{
	String subject;

	@Override
	public void printBook() {
		super.printBook();
		System.out.println("���� �оߴ� "+subject+"�Դϴ�");
	}
	
}
