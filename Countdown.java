import java.time.LocalDate;

public class Countdown {
    public static void main(String[] args) {
        // Set target date
        LocalDate target = LocalDate.of(2024, 1, 18);
        // Set current date
        LocalDate current = LocalDate.now();
        // Save units in variables
        long days = current.datesUntil(target).count();
        long hours = days * 24;
        long minutes = hours * 60;
        long seconds = minutes * 60;
       // Return days until
        System.out.println("***********************************");
        System.out.printf( "Days until Demo Day:      %,9d\n", days);
        System.out.printf( "Hours until Demo Day:     %,9d\n", hours);
        System.out.printf( "Minutes until Demo Day:   %,9d\n", minutes);
        System.out.printf( "Seconds until Demo Day:   %,9d\n", seconds);
        System.out.println("***********************************");
    }
}