package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> mails) {

        return mails.stream()
                 .filter(mail -> mail.endsWith("gmail.com") || mail.endsWith("yandex.ru") || mail.endsWith("hotmail.com"))
                 .count();
    }
}
// END
