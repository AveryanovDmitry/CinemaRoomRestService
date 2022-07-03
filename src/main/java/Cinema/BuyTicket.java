package Cinema;

import Cinema.exceptions.SeatAlreadySoldException;
import Cinema.exceptions.SeatOutOfBoundsException;

import java.util.UUID;
public class BuyTicket {
    private String token;
    private Seat ticket;
    public BuyTicket(Seat place, Seats roomCinema, Statistics statistics){
        this.token = UUID.randomUUID().toString();

        for (Seat value : roomCinema.getAvailableSeats()) {
            if (value.equals(place) && !value.isBooked()) {
                value.setBoked(true);
                value.setToken(token);
                this.ticket = value;
                statistics.increaseCurrent_income(value.getPrice());
                statistics.decreaseNumber_of_available_seats();
                statistics.increaseNumber_of_purchased_tickets();
            } else if (value.equals(place) && value.isBooked()) {
                throw new SeatAlreadySoldException();
            }
        }
        if (this.ticket == null) {
            throw new SeatOutOfBoundsException();
        }
    }

    public Seat getTicket() {
        return ticket;
    }

    public String getToken() {
        return token;
    }
}