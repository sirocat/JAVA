package test;

import java.util.Scanner;

public class Exam05_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(i<=num) {
			if(i%2==0) {
				System.out.print("-"+i);
				sum = sum - i;
			}
			if(i%2==1) {
				System.out.print("+"+i);
				sum = sum + i;
			}
			i++;
		}
		System.out.print("="+sum);
	}

	}
