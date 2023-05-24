package AccountExam;

public class Account {
	private String name;
	private int no;
	private int balance;
	
	public Account() {}
	public Account(String name,int no) {
		this.name = name;
		this.no = no;
	}
	public Account(String name,int no,int balance) {
		this(name,no);
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(int money) {
		this.balance = money + balance;
		System.out.println(name+"��"+money+"�� �Ա�");
	}
	public void withdraw(int money) {
		if(balance < money)
			System.out.println(name+"��"+money+"�� ��� ���� - �����ܾ� "+balance+"��");
		else {
			balance -= money;
			System.out.println(name+"��"+money+"�� ���");
		}
		
		
	}
	public void printInfo() {
		System.out.println("[��������] ������:"+name+"���¹�ȣ:"+no+"�����ܰ�:"+balance);
	}
	
	
	
	
	
	
	
	
	
	
	
}
