package com.project.FlightCheckIn.Integration;

import com.project.FlightCheckIn.dto.Reservation;
import com.project.FlightCheckIn.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
}
