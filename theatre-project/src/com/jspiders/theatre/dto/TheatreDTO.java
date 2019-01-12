package com.jspiders.theatre.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "threatre_table")
public class TheatreDTO implements Serializable {

	@Id
	@Column(name = "theatre_id")
	private int theatreId;
	@Column(name = "name")
	private String name;
	@Column(name = "no_of_seats")
	private int noOfSeats;
	@Column(name = "location")
	private String location;
	@Column(name = "ticket_price")
	private double ticketPrice;

	public TheatreDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

}
