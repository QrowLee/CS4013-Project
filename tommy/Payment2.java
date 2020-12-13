 
import java.time.LocalDate;
public class Payment2 {
    double ammount;
    String owner;
    LocalDate date;
    public Payment2(double ammount,LocalDate date) {
        this.ammount = ammount;
    }
    public Payment2(String owner, Payment2 duePayment) {
        this.owner = owner;
        this.ammount = duePayment.ammount;
        this.date = duePayment.date;
    }
    public String toString() {
        return "Payment{" +
                "Ammount =" + ammount +
                "Date payed = " + date + 
                "owner = " + owner + 
                '}';
    }
}