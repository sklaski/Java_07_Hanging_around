public class Cars extends Vehicle{

	public Cars(String brand) {
		this(brand, 0);
	}
	
	public Cars(String brand, int kilometers) {
		super(brand, kilometers);
	}

	@Override
	public String doStuff() {
		return "I am " + this.brand + " and I go zoom zoom zoom!";
	}

}