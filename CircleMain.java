package CircleExam;

public class CircleMain {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRadius(5.0);
		System.out.println("������"+c1.getRadius()+"���� ����:"+c1.computeArea()+"���� �ѷ�:"+c1.computePerimeter());
	
		Circle c2 = new Circle(8.0);
		System.out.println("������"+c2.getRadius()+"���� ����:"+c2.computeArea()+"���� �ѷ�:"+c2.computePerimeter());
	}
}
