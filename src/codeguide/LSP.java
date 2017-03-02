package codeguide;

/**
 * Exercise for learning Liskov Substitution Principle. To know the principle of
 * Liskov Substitution Principle. TODO Fix the code follow Liskov Substitution
 * Principle.
 * 
 * @author Jirayu Laungwilawan
 * @version 2.3.27
 *
 */

public class LSP {
	public static void main(String[] args) {
		// Answer the question below. Use information in Person class and Student class below the LSP class.
		// 1. Can we call this?
		Person person1 = new Person("foo");
		// Answer : 
		
		// 2. Can we call this?
		Person person2 = new Student("foo");
		// Answer : 
		
		// 3. True of false?
		System.out.println(person1 == person2);
		// Answer : 
		
		// 4. True or false?
		person1.equals(person2);
		// Answer : 
		
		// 5. True or false?
		person1.getName().equals(person2.getName());
		//Answer : 
	}

}

class Person {
	/** Name of Person */
	private String name;

	/**
	 * Constructor of Person. Initialize the value of Person.
	 * 
	 * @param Recive
	 *            name for Person.
	 */
	public Person(String name) {
		this.name = name;
	}

	/**
	 * Return name of Person.
	 * 
	 * @return Return name of Person.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Return information of Person.
	 */
	public String toString() {
		return "My name is " + this.name + ".";
	}

}

class Student extends Person {
	/** Id of Student */
	private long id;
	private long DEFAULT_ID = 1000;

	/**
	 * Constructor of Student. Initialize the value of Student and call super.
	 * 
	 * @param Recive
	 *            name for Student and sent to super().
	 */
	public Student(String name) {
		super(name);
		this.id = DEFAULT_ID;
	}

	/**
	 * Constructor of Student. Initialize the value of Student and call super.
	 * 
	 * @param Recive
	 *            name for Student and sent to super().
	 * @param Recive
	 *            id for Student.
	 */
	public Student(String name, long id) {
		super(name);
		this.id = id;
	}

	/**
	 * Return id of Student.
	 * 
	 * @return Return id of Student.
	 */
	public long getId() {
		return id;
	}

	/**
	 * Return information of Student.
	 */
	@Override
	public String toString() {
		return "My name is " + super.getName() + " and my id is " + this.id + ".";
	}
}