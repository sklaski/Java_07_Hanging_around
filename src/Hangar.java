
public class Hangar {

	public static void main(String[] args) {
		Cars clio = new Cars("Clio");
		Boats titanic = new Boats("Titanic", 2412342);
		System.out.println(clio.doStuff());
		System.out.println(titanic.doStuff());
	}

}
