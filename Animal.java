
public class Animal {

	// instance variables
	private String name;

	// constructor
	public Animal(String name) {
		// initialise instance variable
		this.name = name;
	}

	// getter
	public String getName() {
		return name;
	}

	public String toString() {
		return super.toString() + " Name: " + name;
	}
}