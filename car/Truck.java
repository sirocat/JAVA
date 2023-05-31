package unit02.car;

public class Truck extends car{
	int ton;
	void load() {
		ton += 10;
	}
	void unload() {
		ton -= 10;
	}

}
