package Exam03;

public class SoccerPalyer extends Person{
	String teamName;

	@Override
	void printInfo() {
		super.printInfo();
		System.out.println(name+"��"+teamName+"�� �౸���� �Դϴ�.");
	}
	
}
