package com.boot.bookingrestaurantapi.jsons;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class CreateReservationRest {

	@JsonProperty("date")
	private Date date;

	@JsonProperty("person")
	private Long person;

	@JsonProperty("turnId")
	private Long turnId;

	@JsonProperty("restaurantId")
	private Long restaurantId;

}
