public class Boat extends Vehicle{

	public Boat(String brand) {
		this(brand, 0);
	}
	
	public Boat(String brand, int kilometers) {
		super(brand, kilometers);
	}

	@Override
	public String doStuff() {
		return "I am " + this.brand + " and i go glug glug!";
	}

}