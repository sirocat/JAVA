package practice;

import java.util.Scanner;

public class Exam04_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,sum = 0;
		int i = 1;
		System.out.print("숫자 입력:");
		num = sc.nextInt();
		while(i <= num) {
			if(i%2==0) {
				System.out.print("-"+i);
				sum = sum - i;	
			}
			else{
				System.out.print("+"+i);
				sum = sum + i;
			}
		i += 1;
		}
		System.out.print("="+sum);
	}


	}
