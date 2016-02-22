import java.util.Objects;

/**
 * Created by alexanderhughes on 2/15/16.
 */
public class Email implements Comparable {//interface implement
    String destination;
    String body;
    String subject;
    public Email(String destination, String body, String subject) {
        this.destination = destination;
        this.body = body;
        this.subject = subject;
    }

    @Override// lets Collections.sort(allEmails) to workpr
    public int compareTo(Object o) {
        Email e = (Email) o;
        return destination.compareTo(e.destination);
    }

    @Override
    public String toString() {
        return "Email{" +
                "destination='" + destination + '\'' +
                ", body='" + body + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
