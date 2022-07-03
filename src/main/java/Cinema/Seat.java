package Cinema;

public class Seat {
    private String token = null;
    private int row;
    private int column;
    private int price;
    private boolean isBoked = false;
    public Seat(int column, int row){
        this.row = row;
        this.column = column;

        if(row > 4)
            price = 8;
        else
            price = 10;
    }

    public Seat(){}

    public boolean equals(Seat seat){
        return this.row == seat.getRow() && this.getColumn() == seat.getColumn();
    }
    public int getRow() {
        return row;
    }
    public int getColumn() {
        return column;
    }

    public int getPrice() {
        return price;
    }

    protected Boolean isBooked(){
        return isBoked;
    }
    public void setBoked(boolean boked) {
        isBoked = boked;
    }

    protected String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
