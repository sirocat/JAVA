package Collection;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Lotto {

	public static void main(String[] args) {
		System.out.println("[ArrayList방식으로 생성된 로또번호]");
		LottoArrayList lotto1 = new LottoArrayList();
		lotto1.getRandomBall();
		
		
		System.out.println("[HashMap방식으로 생성된 로또번호]");
		LottoHashMap lotto2 = new LottoHashMap();
		lotto1.getRandomBall();
		
		
		
		

	}

}
