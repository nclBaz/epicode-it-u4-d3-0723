package entities;

import java.util.Random;

public class Student {

	public static String school = "Epicode";
	// LISTA ATTRIBUTI
	public int id;
	public String name;
	public String surname;

	// LISTA COSTRUTTORI
	// Se non dichiaro nessun costruttore, ci sarà sempre e comunque
	// già il costruttore vuoto come default

	// I COSTRUTTORE
	public Student() {
		Random rndm = new Random();
		this.name = "NOME DI DEFAULT";
		this.surname = "COGNOME DI DEFAULT";
		this.id = rndm.nextInt(1, 10000);
	}

	// II COSTRUTTORE
	public Student(String name) {
		Random rndm = new Random();
		this.name = name;
		this.surname = "COGNOME DI DEFAULT";
		this.id = rndm.nextInt(1, 10000);
	}

	// III COSTRUTTORE
	public Student(String name, String surname) {
		Random rndm = new Random();
		this.name = name;
		this.surname = surname;
		this.id = rndm.nextInt(1, 10000);
	}

	// LISTA METODI
	public void sayHello() {
		System.out.println("Ciao sono " + this.name + " " + this.surname + ", ID: " + this.id);
	}

}
