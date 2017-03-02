package codeguide;

/**
 * Exercise for learning Encapsulate What Changes principle. To know the
 * principle of Encapsulate What Changes. TODO Fix the privacy of the code.
 * 
 * @author Jirayu Laungwilawan
 * @version 1.3.17
 */
public class EncapsulateWhatChanges {
	public static void main(String[] args) {
		// TODO Change the privacy of Person to be able to access it from main. Uncomment below and start.
		// Fix the code below.
//		Human human1 = new Human("Gear");
//		System.out.println(human1.toString());
//		System.out.println(human1.getName());
//		Human human2 = new Human("Jirayu");
//		System.out.println(human2.toString());
//		System.out.println(human2.getName());

		// Code below must error. When finish comment below.
//		human1.setName("foo");
//		human2.setName("bar");
//		human1.name = "foo";
//		human2.name = "bar";
	}

}

class Human {
	// ** Name of Person. */
	// TODO Changes the privacy of attribute.
	public String name;

	/**
	 * Constructor of Person. Initialize the value of Person.
	 * 
	 * @param Recive
	 *            name for Person.
	 */
	// TODO Changes the privacy of class.
	private Human(String name) {
		this.name = name;
	}

	/**
	 * Get the name of Person.
	 * 
	 * @return Return name of Student.
	 */
	// TODO Changes the privacy of class.
	private String getName() {
		return name;
	}

	/**
	 * Set the
	 * 
	 * @param name
	 */
	// TODO Changes the privacy of class.
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Return information of Person.
	 */
	public String toString() {
		return "My name is " + this.name + ".";
	}

}