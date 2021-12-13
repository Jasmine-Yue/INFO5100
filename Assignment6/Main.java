import java.time.LocalDate;
import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws  Exception {
        // write your code here

        //Q1:  sort by comparator
        Student Jack=new Student(1,"Jack",3.4,  LocalDate.of(1990,12,21));
        Student Mike= new Student(2,"Mike",3.2,LocalDate.of(1988,12,21));
        Student Bill=  new Student(5,"Bill",3.1,LocalDate.of(1991,12,21));

        List<Student> students= Arrays.asList(Jack,Mike,Bill);
        System.out.println(" before:");
       students.forEach(System.out::println);

        Collections.sort(students, new NameComparator());
        System.out.println(" order by name asc :");
        students.forEach( System.out::println);

        Collections.sort(students, new GpaComparator());
        System.out.println(" order by gpa desc :");
        students.forEach(System.out::println);

        Collections.sort(students, new DateOfBirthComparator());
        System.out.println(" order by date birth  asc:");
        students.forEach(System.out::println);

        //Q2:  dealing with exception
        DrivingLicenseApplication dla= new DrivingLicenseApplication();
        dla.getDateBirth();



    }

}
