
public class TestAnimal {
	public static void main(String args[]) {
		// instantite an Animal object
		Animal a = new Animal("CheChe");

		// .getName() returns name
		System.out.println(a.getName());

		// .toString() returns class details
		System.out.println(a.toString());

		// instntiate a Dog
		Dog d = new Dog("Bobi", 30);

		// set time
		d.setTime(10);

		// get time
		System.out.println(d.getTime());

		// test .stoString()
		System.out.println(d.toString());

	}
}