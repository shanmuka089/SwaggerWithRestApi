package com.example.demo.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "model description",description = "to create request by passenger")
public class PassengerRequest {

	private String fname;
	private String lname;
	private String toCity;
	private String fromCity;
	private double price;
	private int no_of_seats;
}
