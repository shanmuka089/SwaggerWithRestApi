package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.PassengerRequest;
import com.example.demo.response.TicketInfo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import springfox.documentation.service.Contact;

@RestController
@RequestMapping("/api")
public class AirIndiaController {
	
	
	@ApiOperation(value = "getting ticket info",notes = "getting aeroplane ticket information in various data formats",response = Contact.class)
	@PostMapping(value = "/bookTicket",
			consumes = {"application/json","application/xml"},
			produces = {"application/json","application/xml"})
	public ResponseEntity<TicketInfo> bookTicket(@ApiParam(value = "requestBody is mandatory",required = true)@RequestBody PassengerRequest request){
		TicketInfo info=new TicketInfo();
		info.setFullName(request.getFname()+" "+request.getLname());
		info.setNo_of_seats(request.getNo_of_seats());
		info.setFromCity(request.getFromCity());
		info.setToCity(request.getToCity());
		info.setPrice(request.getPrice());
		return new ResponseEntity<TicketInfo>(info,HttpStatus.CREATED);
	}

}
