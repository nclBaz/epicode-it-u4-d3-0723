import entities.Student;

public class Main {
	public static void main(String[] args) {

		Student aldo = new Student(); // I COSTRUTTORE
		Student giovanni = new Student("Giovanni"); // II COSTRUTTORE
		Student giacomo = new Student("Giacomo", "Poretti"); // III COSTRUTTORE

		aldo.sayHello();
		giovanni.sayHello();
		giacomo.sayHello();

	}
}