package Cinema;

import Cinema.Seat;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Seats {
    private int totalRows = 9;
    private int totalColumns = 9;
    private final List<Seat> availableSeats = new CopyOnWriteArrayList<>();

    public Seats(){
        int indexSeats = 0;
        for (int row = 1; row <= totalRows; row++){
            for(int column = 1; column <= totalColumns; column++){
                availableSeats.add(new Seat(column, row));
                indexSeats++;
            }
        }
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalColumns() {
        return totalColumns;
    }

    public void setTotalColumns(int totalColumns) {
        this.totalColumns = totalColumns;
    }

    public List<Seat> getAvailableSeats() {
        return availableSeats;
    }
}
