package Cinema.exceptions;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exception {

    @ExceptionHandler(SeatOutOfBoundsException.class)
    public ResponseEntity<Map<String,String>> seatOutOfBoundsException(RuntimeException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", "The number of a row or a column is out of bounds!"));
    }

    @ExceptionHandler(SeatAlreadySoldException.class)
    public ResponseEntity<Map<String, String>> seatAlreadySoldException(RuntimeException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", "The ticket has been already purchased!"));
    }

    @ExceptionHandler(WrongTokenException.class)
    public ResponseEntity<Map<String, String>> wrongTokenException(RuntimeException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", "Wrong token!"));
    }

    @ExceptionHandler(WrongPasswordException.class)
    public ResponseEntity<Map<String, String>> wrongPassswordException(RuntimeException e) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error", "The password is wrong!"));
    }
}
