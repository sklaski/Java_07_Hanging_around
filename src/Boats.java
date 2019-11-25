public class Boats extends Vehicle{

	public Boats(String brand) {
		this(brand, 0);
	}
	
	public Boats(String brand, int kilometers) {
		super(brand, kilometers);
	}

	@Override
	public String doStuff() {
		return "I am " + this.brand + " and i go glug glug!";
	}

}