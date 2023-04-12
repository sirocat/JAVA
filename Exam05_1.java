package Text;

import java.util.Scanner;

public class Exam05_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,sum=0;
		int j = 1;
		System.out.print("숫자입력: ");
		i = sc.nextInt();
		while(j <= i) {
			if(j%2 == 0) {
				System.out.print("-"+j);
				sum -= j;
			}
			else {
				System.out.print("+"+j);
				sum += j;
			}
		j += 1;
		}
		
		System.out.print("="+sum);

	}

}
