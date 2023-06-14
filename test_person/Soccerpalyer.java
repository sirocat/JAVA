package test_person;

public class Soccerpalyer extends Person{
	String teamName;

	@Override
	void printInfo() {
		//super.printInfo();
		System.out.println(name+"는"+teamName+"팀 축구선수 입니다.");
	}
	
}
