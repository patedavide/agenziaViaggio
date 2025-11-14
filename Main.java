import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args){

        Calendar cal = Calendar.getInstance();
        cal.set(2025,Calendar.JANUARY,19);
        Date inizioViaggio1 = cal.getTime();
        cal.set(2025, Calendar.MARCH, 2);
        Date fineViaggio1 = cal.getTime();


    }
}
