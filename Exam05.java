package Text;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,sum=0;
		System.out.print("숫자입력: ");
		i = sc.nextInt();
		for(int j = 1; j<=i; j++) {
			if(j%2 == 0) {
				System.out.print("-"+j);
				sum -= j;
			}
			else {
				System.out.print("+"+j);
				sum += j;
			}
		}
		
		System.out.print("="+sum);

	}


}