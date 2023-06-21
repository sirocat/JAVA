package Exam;

public class Book {
	private int no;
	private String name;
	private int count;
	private int borrow;
	private final static String Library = "�κ�������";
	private static int bookCnt = 0;
	
	public Book() {
		bookCnt++;
	}

	public Book(int no, String name) {
		this();
		this.no = no;
		this.name = name;
	}

	public Book(int no, String name, int count, int borrow) {
		this(no,name);
		this.count = count;
		this.borrow = borrow;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getBorrow() {
		return borrow;
	}

	public void setBorrow(int borrow) {
		this.borrow = borrow;
	}

	public static int getBookCnt() {
		return bookCnt;
	}

	public static void setBookCnt(int bookCnt) {
		Book.bookCnt = bookCnt;
	}

	public static String getLibrary() {
		return Library;
	}
	public void printInfo() {
		System.out.println("��ȣ: "+no+" ������ : "+name+" ��������"+count+" �뿩���� : "+borrow);
	}
	public void borrowBook(int cnt) {
		if(count < cnt)
			System.out.println(no+"�� ���� "+cnt+"�� ���� ����");
		else {
			count = count - cnt;
			borrow = borrow + cnt;
			System.out.println(no+"�� ���� "+cnt+"�� ���� ����");
		}
	}
	public void returnBook(int cnt) {
		if(borrow < cnt)
			System.out.println(no+"�� ���� "+cnt+"�� �ݳ� ����");
		else {
			count = count + cnt;
			borrow = borrow - cnt;
			System.out.println(no+"�� ���� "+cnt+"�� �ݳ� ����");
		}
	
	}
}
