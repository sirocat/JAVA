package CafeExam;

public class cafe {
	private int coffee;
	private int sugar;
	private int cream;
	
	public void makeTea(int coffee, int sugar,int cream) {
		this.coffee = coffee;
		this.cream = cream;
		this.sugar = sugar;
		
		System.out.println("��ũĿ�� ������~~");
		System.out.println("Ŀ�� ��: "+(coffee+cream+sugar));
	}
	
	public void makeTea(int coffee,int sugar) {
		this.coffee = coffee;
		this.sugar = sugar;
		
		System.out.println("����Ŀ�� ������~~");
		System.out.println("Ŀ�ǳ�: "+(coffee+cream+sugar));
	}
	
	public void makeTea(int coffee) {
		this.coffee = coffee;
		System.out.println("��Ŀ�� ������~~");
		System.out.println("Ŀ�ǳ�: "+(coffee+cream+sugar));
	}
	
}
