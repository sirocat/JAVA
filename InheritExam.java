package unit02.car;

public class InheritExam {

	public static void main(String[] args) {
		Taxi myTaxi = new Taxi();
		myTaxi.carname = "티코";
		myTaxi.color = "red";
		myTaxi.speedUp();
		myTaxi.speedDown();
		
		System.out.println(myTaxi.color);
		System.out.println(myTaxi.carname+"의 속도는"+myTaxi.velocity);
		
		Truck myTruck = new Truck();
		myTruck.carname = "덤프트럭";
		myTruck.color = "white";
		myTruck.speedUp();
		myTruck.speedDown();
		
		System.out.println(myTruck.carname);
		System.out.println(myTruck.carname+"의 색깔은"+myTruck.color);
		
		
		
		
		
	}

}





































































































































































































































































































































































































































































































































































































































































































































































































































































































































