package Collection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public  DateTime() {

        LocalDateTime now;
        now = LocalDateTime.now();
        Object date;
        date = LocalDate.now().format(DateTimeFormatter.ofPattern("d/M/uuuu"));

    }
}