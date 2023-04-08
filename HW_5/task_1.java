package Java_hw.HW_5;
import java.util.*;
public class task_1 {
    public static void main(String[] args) {
        // Реализуйте структуру телефонной книги с помощью HashMap,
        //  учитывая, что 1 человек может иметь несколько телефонов
        
        Map<String, List<String>> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Иван Иванов", Arrays.asList("89267778895", "89254325678"));
        phoneNumbers.put("Кристина Белова", Arrays.asList("89154467700", "89109224576"));
        phoneNumbers.put("Антон Дроздов", Arrays.asList("89154467700", "89109224576"));
        phoneNumbers.put("Илья Ильин", Arrays.asList("89154467700", "89109224576"));
        phoneNumbers.put("Анна Буева", Arrays.asList("89154467700"));
        System.out.println(phoneNumbers.entrySet());
    }
}   