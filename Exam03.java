package practice;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month,day;
		System.out.print("�� �Է�: ");
		month = sc.nextInt();
		switch(month) {
		case 4: case 6: case 9: case 11:
			day = 30; break;
		case 2:
			day = 28; break;
		default :
			day = 31; break;
			
		}
		
		System.out.print(month+"���� "+day+"���Դϴ�.");
	}

}
