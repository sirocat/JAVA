package test_person;

public class PersonMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "������";
		s1.age = 23;
		s1.online = true;
		
		s1.printInfo();
		
		Soccerpalyer s2 = new Soccerpalyer();
		s2.name = "���ڰ�";
		s2.teamName = "����FC";
		
		s2.printInfo();
		

	}

}
