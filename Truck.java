package unit02.car;

public class Truck extends car{
	int ton;
	void load() {
		ton += 10;
	}
	void unload() {
		ton -= 10;
	}
	@Override
	void speedUp() {
		velocity += 10;
	}
	@Override
	void speedDown() {
		velocity -= 10;
	}

}
