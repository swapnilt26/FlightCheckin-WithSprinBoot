package com.project.FlightCheckIn.Integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.project.FlightCheckIn.dto.Reservation;
import com.project.FlightCheckIn.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {

	private static final String RESERVATION_REST_URL = "http://localhost:8080/flightreservation/reservation/";

	@Override
	public Reservation findReservation(Long id)
	{
		RestTemplate rest = new RestTemplate();
		Reservation res = rest.getForObject(RESERVATION_REST_URL+id, Reservation.class);
		return res;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate rest = new RestTemplate();
		Reservation res = rest.postForObject(RESERVATION_REST_URL,request ,Reservation.class);
		return res;
	}

}
