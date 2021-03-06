
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

		// test Cat subclass
		Cat c = new Cat("Rosco", 9);
		System.out.println(c);

		// test .loseLife()
		c.loseLife();

		// test .getLivesLeft()
		System.out.println(c.getLivesLeft());
		c.loseLife();
		c.loseLife();
		c.loseLife();
		c.loseLife();
		c.loseLife();
		c.loseLife();
		c.loseLife();
		c.loseLife();
		c.loseLife();

		// test kitty is born with 9 lives
		Cat c2 = new Cat("Tom", 1);
		System.out.println(c2.toString());

	}
}