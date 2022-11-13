package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        return emails.stream()
                .map(email -> email.substring(email.indexOf('@')))
                .filter(email -> email.equals("@gmail.com")
                        || email.equals("@yandex.ru")
                        || email.equals("@hotmail.com"))
                .count();
    }
}
// END
