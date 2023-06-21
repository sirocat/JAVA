package Exam02;

public class Cartoon extends Book{
	boolean webtoon;

	@Override
	public void printBook() {
		super.printBook();
		
		if(webtoon)
			System.out.println("이 만화는 웹툰입니다");
		else
			System.out.println("이 만화는 웹툰이 아닙니다");
	
	}
	
}
