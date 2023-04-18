package practice;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int max = 0;
		int i =0;
		while(i<5) {
			System.out.print((i+1)+"번재 정수 입력: ");
			num[i] = sc.nextInt();
			if(num[i]>max) {
				max = num[i];
			}
		i += 1;
		}
		System.out.println("입력한 값들 중 최대값은"+max+"입니다.");

	}

}
