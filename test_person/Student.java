package test_person;

public class Student extends Person {
	boolean online;

	@Override
	void printInfo() {
		super.printInfo();
		
		if(online)
			System.out.println(name+"은 학생이며 현재 온라인 수업 중 입니다");
		else
			System.out.println(name+"은 학생이며 현재 등교 수업 중 입니다");
	}
	
	
}
