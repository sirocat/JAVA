package practice;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num,sum = 0;
		System.out.print("���� �Է�:");
		num = sc.nextInt();
		for(int i = 1;i<=num;i++) {
			if(i%2==0) {
				System.out.print("-"+i);
				sum = sum - i;	
			}
			else{
				System.out.print("+"+i);
				sum = sum + i;
			}
		}
		System.out.print("="+sum);
	}

}
