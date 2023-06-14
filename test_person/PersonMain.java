package test_person;

public class PersonMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "염미정";
		s1.age = 23;
		s1.online = true;
		
		s1.printInfo();
		
		Soccerpalyer s2 = new Soccerpalyer();
		s2.name = "구자경";
		s2.teamName = "서울FC";
		
		s2.printInfo();
		

	}

}
