import entities.Student;
import es1.Esercizio1;

public class Main {
	public static void main(String[] args) {

		Student aldo = new Student(); // I COSTRUTTORE
		Student giovanni = new Student("Giovanni"); // II COSTRUTTORE
		Student giacomo = new Student("Giacomo", "Poretti"); // III COSTRUTTORE

		Student ajeje = aldo; // NON COPIARE MAI GLI OGGETTI COSI'
		ajeje.name = "Ajeje";

		aldo.sayHello();
		giovanni.sayHello();
		giacomo.sayHello();
		ajeje.sayHello();

		System.out.println(Math.PI);

		System.out.println(Esercizio1.isBisestile(2024));

		System.out.println(Student.school);
	}


}