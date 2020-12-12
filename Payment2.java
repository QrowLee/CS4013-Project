 
import java.time.LocalDate;
public class Payment2 {
    double ammount;
    String owner;
    LocalDate date;
    boolean due;
    public Payment2(double ammount, boolean due, LocalDate date) {
        this.ammount = ammount;
        this.due = due;
    }
    public Payment2(String owner, double ammount, boolean due, LocalDate date) {
        this.ammount = ammount;
        this.due = due;
        this.date = date;
    }
    public String toString() {
        return "Payment{" +
                "Ammount =" + ammount +
                "Date payed = " + date + 
                "owner = " + owner + 
                '}';
    }
}