package Cinema;

public class Statistics {
    private int current_income = 0;
    private int number_of_available_seats = 81;
    private int number_of_purchased_tickets = 0;

    public Statistics(){
    }

    public int getCurrent_income() {
        return current_income;
    }

    public void increaseCurrent_income(int current_income) {
        this.current_income = this.current_income + current_income;
    }

    public void decreaseCurrent_income(int current_income) {
        this.current_income = this.current_income - current_income;
    }

    public int getNumber_of_available_seats() {
        return number_of_available_seats;
    }

    public void decreaseNumber_of_available_seats() {
        this.number_of_available_seats -= 1;
    }

    public void increaseNumber_of_available_seats() {
        this.number_of_available_seats += 1;
    }

    public int getNumber_of_purchased_tickets() {
        return number_of_purchased_tickets;
    }

    public void increaseNumber_of_purchased_tickets() {
        this.number_of_purchased_tickets++;
    }

    public void decreaseNumber_of_purchased_tickets() {
        this.number_of_purchased_tickets--;
    }
}
