package ifExam;

public class ifExam2 {

	public static void main(String[] args) {
		int a = 20, b= 10;
		char op = '*';
		if(op == '+') System.out.println(a+" + "+b+" = "+(a+b));
		else if(op == '-') System.out.println(a+" - "+b+" = "+(a-b));
		else if(op == '*') System.out.println(a+" * "+b+" = "+(a*b));
		else if(op == '/') System.out.println(a+" / "+b+" = "+(a/b));
		else System.out.println("사직연산자가 아닙니다");
}
}

