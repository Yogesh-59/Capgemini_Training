import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();
        LocalDate date = LocalDate.parse(inputDate, formatter);
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + modifiedDate);
        LocalDate finalDate = modifiedDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate);
    }
}
