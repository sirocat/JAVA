package Collection;

import java.util.LinkedList;

public class LinkedLsitExam {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		
		list.add("유재석");
		list.add("지석진");
		list.add("김종국");
		list.add("송지효");
		list.add("하하");
		
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println(list.getLast());
		System.out.println(list.getFirst());
		

	}

}
