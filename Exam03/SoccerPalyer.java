package Exam03;

public class SoccerPalyer extends Person{
	String teamName;

	@Override
	void printInfo() {
		super.printInfo();
		System.out.println(name+"는"+teamName+"팀 축구선수 입니다.");
	}
	
}
