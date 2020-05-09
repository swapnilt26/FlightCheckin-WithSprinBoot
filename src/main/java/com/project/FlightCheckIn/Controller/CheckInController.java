package com.project.FlightCheckIn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.FlightCheckIn.Integration.ReservationRestClient;
import com.project.FlightCheckIn.dto.Reservation;
import com.project.FlightCheckIn.dto.ReservationUpdateRequest;

@Controller
public class CheckInController {
	
	@Autowired
	ReservationRestClient client;
	
	@RequestMapping("/showStartCheckIn")
	public String showCheckInPage()
	{
		return "displayCheckIn";
	}
	
	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("reservationId") Long id, ModelMap model)
	{
		Reservation res = client.findReservation(id);
		model.addAttribute("reservation",res);
		return "CheckInDetails";
	}
	
	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam int numberOfBags, @RequestParam Long reservatiodId, ModelMap model)
	{
		ReservationUpdateRequest req = new ReservationUpdateRequest();
		req.setCheckedIn(true);
		req.setNumberOfBags(numberOfBags);
		req.setId(reservatiodId);
		client.updateReservation(req);
		model.addAttribute("data",req);
		return "checkInCompleted";
	}

}
