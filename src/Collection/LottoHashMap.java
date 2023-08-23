package Collection;

import java.util.HashSet;
import java.util.Set;

public class LottoHashMap {
	
	public void getRandomBall() {
		Set<Integer> lotto = new HashSet<Integer>();
		int lottoNum = 0;
		
		while(lotto.size() != 6) {
			lottoNum = (int)(Math.random()*45)+1;
			lotto.add(lottoNum);
		}
		for(Integer value : lotto) {
			System.out.printf("%2d",value);
		}
		
	}

}
