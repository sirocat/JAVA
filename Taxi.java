package unit02.car;

public class Taxi extends car{
	@Override
	void speedUp() {
		velocity -= 10;
	}
	@Override
	void speedDown() {
		velocity += 10;
	}
	int meter;
	
	void meterup() {
		meter += 10;
	}
	void meterDown(){
		meter -= 10;
	}
}
