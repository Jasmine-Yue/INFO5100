import java.util.Date;
import java.util.Scanner;
import  java.text.SimpleDateFormat ;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class DrivingLicenseApplication {
/*    Write a class called 'DrivingLicenseApplication' to read input from the keyboard which
    take dateOfBirth of Date datatype. If the age is below 16 (For example 14), then throw
    and catch and exception which prints the message.
    The age of the applicant is 14 which is too early to apply for a driving licens*/

    public  void getDateBirth() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Date of Birth(dd-MM-yyyy):");

        String input = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date=null;
        try {
            //Parsing the String
            date = dateFormat.parse(input);
            Instant instant = date.toInstant();
            ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
            LocalDate givenDate = zone.toLocalDate();
            //Calculating the difference between given date to current date.
            Period period = Period.between(givenDate, LocalDate.now());
            if (period.getYears()<16)
               throw new Exception("The age of the applicant is 14 which is too early to apply for a driving license " );

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(" your  are eligible to apply for driving license");

    }


}
