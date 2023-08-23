package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoArrayList {
	
	public void getRandomBall() {
		List<Integer> lotto = new ArrayList<Integer>();
		
			int count = 0;
			while(count < 6) {
				int lottoNum = (int)(Math.random() * 45)+1;
				if(lotto.contains(lottoNum)) {
					System.out.println("중복값 발생");
					continue;
				}
				lotto.add(lottoNum);
				count++;
			}
			Collections.sort(lotto);
			for(Integer value : lotto) {
				System.out.printf("%2d",value);
			}
			System.out.println();
			lotto.clear();
			
			
	}

}
