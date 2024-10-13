package model;

import java.util.Calendar;

public class CanoaController {

	private User[] users;
	private PlaneTicket[] planeTickets;

	public CanoaController() {

		this.users = new User[15];
		this.planeTickets = new PlaneTicket[10];

	}

	public String showUserList() {

		String usersRegistered = "";

		for (int i = 0; (i < users.length); i++) {

			if (users[i] != null) {

				usersRegistered += "\n" + (i + 1) + ". " + users[i].getFullName();

			}

		}

		return usersRegistered;

	}

	public String showPlaneTickets() {

		String planeTicketsRegistered = "";

		for (int i = 0; (i < planeTickets.length); i++) {

			if (planeTickets[i] != null) {

				planeTicketsRegistered += "\n" + (i + 1) + ". " + planeTickets[i].getAirLineName() + " - "
						+ planeTickets[i].getFlightNumber() + " - " + planeTickets[i].getFlightDate();

			}

		}

		return planeTicketsRegistered;

	}

	public boolean registerUser(String fullName, String id, String email, String phone) {

		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {

				users[i] = new User(fullName, id, email, phone);
				return true;

			}

		}

		return false;
	}

	public boolean registerPlaneTicket(String airLineName, String flightNumber, String departureCity,
			String arrivalCity, int year, int month, int day, double kmBetweenCities) {

		Calendar flightDate = Calendar.getInstance();

		flightDate.set(year, month-1, day); 


		for (int i = 0; i < planeTickets.length; i++) {
			if (planeTickets[i] == null) {

				planeTickets[i] = new PlaneTicket(airLineName, flightNumber, departureCity, arrivalCity,
						flightDate, kmBetweenCities);

				return true;
			}

		}

		return false;
	}

}
