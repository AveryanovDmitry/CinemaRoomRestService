package Cinema;

import Cinema.exceptions.WrongPasswordException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class CinemaController {
    @Autowired
    private Seats hallCinema;

    @Autowired
    private Statistics statistics;

    @GetMapping("/seats")
    public Seats getTasks(@Autowired Seats roomCinema) {
        return roomCinema;
    }

    @PostMapping("/purchase")
    public BuyTicket postPurchase(@RequestBody Seat place) {
        return new BuyTicket(place, hallCinema, statistics);
    }

    @PostMapping("/return")
    public ReturnTicket postReturnTicket(@RequestBody Map<String,String> token) {
        return new ReturnTicket(new Token(token.get("token")), hallCinema, statistics);
    }

    @PostMapping("/stats")
    public Statistics returnStats(@RequestParam(required = false) String password){
        if("super_secret".equals(password))
            return statistics;
        else
            throw new WrongPasswordException();
    }
}