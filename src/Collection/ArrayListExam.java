package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExam {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("유재석");
		list.add("지석진");
		list.add("김종국");
		list.add("송지효");
		list.add("하하");
		
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list);
		
		
		System.out.println("신청학생수(삭제전)"+list.size());
		list.remove("김종국");
		System.out.println("삭제후 신청 학생 수: "+list.size());
		System.out.println(list.get(2));
		
		for(String s: list) {
			System.out.println(s);
		}
		System.out.println("데이터 변경 전: "+list.get(0));
		list.set(0, "이수근");
		System.out.println("데이터 변경 후: "+list.get(0));
		
		System.out.println(list.indexOf("송지효"));
		if(list.contains("송지효")) {
			System.out.println("송지효가 포함되어 있네요.");
		}
		else {
			System.out.println("송지효가 포함되어 있지 않네요");
		}
		
		list.clear();
		if(list.isEmpty()) {
			System.out.println("학생 수: "+list.size());
		}
		
		list.add("윤석열");
		list.add("박정희");
		list.add("노태우");
		list.add("박근혜");
		list.add("문제인");
		
		Collections.sort(list);
		
		for(String string:list) {
			System.out.println(string);
		}
		
		
		
	}

}
