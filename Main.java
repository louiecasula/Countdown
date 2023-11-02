import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Set target date
        LocalDate target = LocalDate.of(2024, 1, 18);
        // Set current date
        LocalDate current = LocalDate.now();
       // Return days until
        System.out.println("Days until Demo Day: " + current.datesUntil(target).count());
    }
}