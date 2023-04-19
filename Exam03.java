package test;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력:");
		int month = sc.nextInt();
		int day = 0;
		switch(month) {
		case 4: case 6: case 9: case 11:
			day = 30; break;
		case 2:
			day = 28; break;
		default:
			day = 31; break;
		}
		System.out.print(month+"월은 "+day+"일 입니다.");

	}

}
