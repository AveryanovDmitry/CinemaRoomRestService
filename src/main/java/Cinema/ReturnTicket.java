package Cinema;

import Cinema.exceptions.WrongTokenException;
public class ReturnTicket {
    private Seat returned_ticket = null;
    public ReturnTicket(Token token, Seats hall, Statistics statistics){
        for (Seat s: hall.getAvailableSeats()){
            if(token.getToken().equals(s.getToken())) {
                s.setToken(null);
                s.setBoked(false);
                returned_ticket = s;
                statistics.decreaseCurrent_income(s.getPrice());
                statistics.increaseNumber_of_available_seats();
                statistics.decreaseNumber_of_purchased_tickets();
            };
        } if (returned_ticket == null) {
            throw new WrongTokenException();
        }
    }

    public Seat getReturned_ticket() {
        return returned_ticket;
    }
}
