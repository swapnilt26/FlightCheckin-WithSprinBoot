<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Details</title>
</head>
<body>
<h2>Flight Details:</h2>

Airlines : ${reservation.flight.flightNumber}<br/>
Operating Airlines : ${reservation.flight.operatingAirlines}<br/>
Departure City : ${reservation.flight.departureCity}<br/>
Arrival City : ${reservation.flight.arrivalCity}<br/>
Date Of Departure : ${reservation.flight.dateOfDeparture}<br/>
Estimated Departure Time : ${reservation.flight.estimatedDepartureTime}<br/>

<h2>Passenger Details:</h2>

First Name : ${reservation.passenger.firstName}<br/>
Last Name : ${reservation.passenger.lastName}<br/>
Email : ${reservation.passenger.email}<br/>
Mobile : ${reservation.passenger.phone}<br/>

<form action="completeCheckIn" method="post">
Enter the of Bags You Want To CheckIn : <input type="text" name="numberOfBags">
<input type="hidden" value="${reservation.id}" name="reservatiodId">
<input type="submit" value="CheckIn">
</form>
</body>
</html>