package test_person;

public class Student extends Person {
	boolean online;

	@Override
	void printInfo() {
		super.printInfo();
		
		if(online)
			System.out.println(name+"�� �л��̸� ���� �¶��� ���� �� �Դϴ�");
		else
			System.out.println(name+"�� �л��̸� ���� � ���� �� �Դϴ�");
	}
	
	
}
