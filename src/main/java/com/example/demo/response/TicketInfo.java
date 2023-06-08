package com.example.demo.response;

import lombok.Data;

@Data
public class TicketInfo {

	private String fullName;
	private int no_of_seats;
	private double price;
	private String toCity;
	private String fromCity;
}
