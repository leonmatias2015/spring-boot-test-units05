package com.boot.bookingrestaurantapi.dtos;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String name;	
	private String value;	

}