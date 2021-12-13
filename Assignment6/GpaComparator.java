import java.util.Comparator;

public class GpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o2.getGpa()>o1.getGpa())
            return 1;
        else if (o2.getGpa()<o1.getGpa())
            return -1;
        else
            return 0;
    }
}
