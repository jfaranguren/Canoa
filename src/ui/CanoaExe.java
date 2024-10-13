package ui;

import java.util.Scanner;

import model.CanoaController;

public class CanoaExe {

	public Scanner reader;
	public CanoaController controller;

	public static void main(String[] args) {
		CanoaExe canoa = new CanoaExe();
		canoa.showMainMenu();
	}

	public CanoaExe() {

		reader = new Scanner(System.in);
		controller = new CanoaController();
	}

	public void showMainMenu() {

		System.out.println("Welcome to Canoa");

		boolean stopFlag = false;

		while (!stopFlag) {

			System.out.println("\nType an option");
			System.out.println("1. Register an User");
			System.out.println("2. Register a Property");
			System.out.println("3. Book a Property");
			System.out.println("0. Exit");

			int mainOption = reader.nextInt();

			switch (mainOption) {

			case 1:
				registerUser();
				break;
			case 2:
				registerPlaneTicket();
				break;
			case 3:
				bookTicket();
				break;
			case 0:
				System.out.println("Thanks for using our system");
				stopFlag = true;
				break;
			default:
				System.out.println("You must type a valid option");
				break;

			}

		}

	}

	public void registerUser() {

		System.out.println("Type the new User's name: ");
		String name = reader.nextLine();

		System.out.println("Type the new User's id: ");
		String id = reader.nextLine();

		System.out.println("Type the new User's e-mail: ");
		String email = reader.nextLine();

		System.out.println("Type the new User's phone number: ");
		String phone = reader.nextLine();

		if (controller.registerUser(name, id, email, phone)) {

			System.out.println("User registered successfully");

		} else {

			System.out.println("Error, User couldn't be registered");
		}

	}

	public void registerPlaneTicket() {

		System.out.println("Type the new Plane Ticket's Airline name: ");
		String airlineName = reader.nextLine();

		System.out.println("Type the new Plane Ticket's Flight Number: ");
		String flightNumber = reader.nextLine();

		System.out.println("Type the new Plane Ticket's Departure city: ");
		String departureCity = reader.nextLine();

		System.out.println("Type the new Plane Ticket's Arrival city: ");
		String arrivalCity = reader.nextLine();

		System.out.println("Type the new Plane Ticket's date (YYYY-MM-DD): ");
		String date = reader.nextLine();

		int year = Integer.parseInt(date.split("-")[0]);
		int month = Integer.parseInt(date.split("-")[1]);
		int day = Integer.parseInt(date.split("-")[2]);

		System.out.println("Type the new Plane Ticket's kilometers between cities: ");
		double kmBetweenCities = reader.nextDouble();

		if (controller.registerPlaneTicket(airlineName, flightNumber, departureCity, arrivalCity, year, month, day,
				kmBetweenCities)) {

			System.out.println("Ticket registered successfully");

		} else {

			System.out.println("Error, Ticket couldn't be registered");
		}

	}

	public void bookTicket() {

	}

}
