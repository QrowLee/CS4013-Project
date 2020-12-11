 
import java.time.LocalDate;
public class Payment2 {
    double ammount;
    String owner;
    LocalDate date;
    boolean due;
    public Payment2(double ammount) {
        this.ammount = ammount;
    }
    public Payment2(double ammount, boolean due) {
        this.ammount = ammount;
        this.due = due;
    }
    public String toString() {
        return "Payment{" +
                "Ammount =" + ammount +
                "Date payed = " + date + 
                "owner = " + owner + 
                '}';
    }
}