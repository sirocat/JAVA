package Student0517;

public class Student {
	//멤버변수
	private String name;
	private int grade;
	
	//생성자
	public Student() {
		
	}
	//생성자 오버로딩
	public Student(String n) {
		name = n;
	}
	//
	public Student(String n,int g) {
		name = n;
		grade = g;
	}
	
	//메소드
	public void print() {
		System.out.println("학생의 이름은 "+name+" 이고,"+grade+"학년입니다.");
	}
	
	
	
}
