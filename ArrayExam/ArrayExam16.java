package ArrayExam;

import java.util.Scanner;

public class ArrayExam16 {

	public static void main(String[] args) {

		int a[] = new int[5];
		int sum = 0;
		double avg = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println("���� �Է�: ");
			a[i] = sc.nextInt();
			sum += a[i];
		}
		System.out.println("�հ� : "+sum);
		avg = sum / 5.0;
		System.out.println("��� : "+avg);

	}

}
