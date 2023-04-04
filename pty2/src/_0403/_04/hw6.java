package _0403._04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class hw6 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年 - MM月 - dd日 HH:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);

        Calendar date1 = Calendar.getInstance();
        date1.set(Calendar.YEAR,2015);
        date1.set(Calendar.MONTH,3);
        date1.set(Calendar.DAY_OF_MONTH,6);
        System.out.println("2015-4-6是一年中的第" + (date1.get(Calendar.WEEK_OF_YEAR))+"个星期");


    }

}
