package entities;

import java.util.Objects;
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


	// To String e Equals sono metodi di default che tutti gli oggetti possiedono alla loro creazione
	// Spessissimo però non mi vanno bene questi comportamenti
	// Di default il toString mi stampa cose tipo entities.Student@1b28cdfa e allora lo voglio customizzare
	// Di default l'equals mi ritorna true solo se 2 oggetti sono nella stessa cella di memoria, però
	// non è detto che ciò mi vada bene, magari vorrei fare un controllo del tipo: se hanno gli stessi
	// valori allora equals mi deve tornare true. E allora sovrascrivo anch'esso

	// Per far generare questi 2 metodi a Intellij basta fare tasto dx --> Generate
	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true; // Se i 2 oggetti rappresentano la stessa cella di memoria allora torna true
		if (o == null || getClass() != o.getClass())
			return false; // Se o è null oppure se appartengono a classi diverse ritorna false
		Student student = (Student) o; // casting esplicito
		return this.id == student.id && Objects.equals(this.name, student.name) && Objects.equals(this.surname, student.surname);
	}
}
