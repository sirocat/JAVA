package whileExam;

public class whileExam2 {

	public static void main(String[] args) {
		int i = 1,sum = 0;
		while(i <= 10) {
			if(i%2 == 0) sum -=i;
			else sum += i;
			i++;
		}
		System.out.println("1-2+3-4+5-6+7-8+9-10="+sum);

	}

}
