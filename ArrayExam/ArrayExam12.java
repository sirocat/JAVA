package ArrayExam;

import java.util.Scanner;

public class ArrayExam12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		for(int i = 0; i < a.length; i++) {
			System.out.println("�����Է� : ");
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a.length; i++)
			System.out.println("a["+i+"]="+a[i]);
	}

}
