package model;

import java.util.Calendar;

public class PlaneTicket {

	private String airLineName;
	private String flightNumber;
	private String departureCity;
	private String arrivalCity;
	private Calendar flightDate;
	private double kmBetweenCities;
	
	public PlaneTicket(String airLineName, String flightNumber, String departureCity, String arrivalCity,
			Calendar flightDate, double kmBetweenCities) {
		super();
		this.airLineName = airLineName;
		this.flightNumber = flightNumber;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.flightDate = flightDate;
		this.kmBetweenCities = kmBetweenCities;
	}

	public String getAirLineName() {
		return airLineName;
	}

	public void setAirLineName(String airLineName) {
		this.airLineName = airLineName;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Calendar getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Calendar flightDate) {
		this.flightDate = flightDate;
	}
	

	public double getKmBetweenCities() {
		return kmBetweenCities;
	}

	public void setKmBetweenCities(double kmBetweenCities) {
		this.kmBetweenCities = kmBetweenCities;
	}

	
	

	

}
