package Collection;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public interface Order {
    double sum();
    int count();
    LocalDateTime date();
    void registrationUser(User user);
    void addItem(Item items);


}
