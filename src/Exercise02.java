import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by alexanderhughes on 2/15/16.
 */
public class Exercise02 {

    public static void main(String[] args) {
        ArrayList<Email> allEmails = new ArrayList<>();
        allEmails.add(new Email("alice@gmail.com", "hi", "what's up?"));
        allEmails.add(new Email("bob@gmail.com", "Hi", "what's up?"));
        allEmails.add(new Email("charlie@gmail.com", "Hi", "what's up?"));
        allEmails.add(new Email("alice@gmail.com", "hi", "what's up?"));
        allEmails.add(new Email("bob@gmail.com", "Hi", "what's up?"));
        Collections.sort(allEmails);
        System.out.println(allEmails);
        HashMap<String, ArrayList<Email>> emailsByDest = new HashMap<>();
        for (Email email : allEmails) {
            if (!emailsByDest.containsKey(email.destination)) {
                emailsByDest.put(email.destination, new ArrayList<>());
            }
            emailsByDest.get(email.destination).add(email);
        }
    }
}