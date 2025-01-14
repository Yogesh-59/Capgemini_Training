import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateFormatting {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Current date in format dd/MM/yyyy: " + currentDate.format(format1));
        System.out.println("Current date in format yyyy-MM-dd: " + currentDate.format(format2));
        System.out.println("Current date in format EEE, MMM dd, yyyy: " + currentDate.format(format3));
    }
}

