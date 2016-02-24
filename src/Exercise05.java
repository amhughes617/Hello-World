import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Created by alexanderhughes on 2/24/16.
 */
public class Exercise05 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "andrew", "edward", "alex"};
        // grab the first 5
        // make all the  names uppercase
        // ArrayList<String> containing all the ones starting with "A"
        ArrayList<String> newNames = new ArrayList<>(Arrays.asList(names));
        newNames = new ArrayList<>(newNames.subList(0, 5));

        solveViaStream(newNames);
        solveViaDirectModification(newNames);
        solveViaTempList(newNames);

    }
    static void solveViaDirectModification(ArrayList<String> names) {
        for (int i = 0; i< names.size(); i++) {
            names.set(i, names.get(i).toUpperCase());
        }
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (!name.startsWith("A")) {
                iter.remove();
            }
        }
        System.out.println(names);
    }

    static void solveViaTempList(ArrayList<String> names) {
        ArrayList <String> temp = new ArrayList<>();
        for (String name : names) {
            temp.add(name.toUpperCase());
        }
        names = temp;

        temp = new ArrayList<>();
        for(String name : names) {
            if (name.startsWith("A")) {
                temp.add(name);
            }
        }
        names = temp;
        System.out.println(names);
    }

    static void solveViaStream(ArrayList<String> names) {
        names = names.stream()
                .map((name) -> {    //anonymous function to run on all the name strings in ArrayList
                    return name.toUpperCase();  //returns modified name which is given to filter
                })
                .filter((name) -> {
                    return name.startsWith("A");    //returns modified name again replaces name in names
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(names);
    }
}
//    ArrayList<String newName = new Arraylist<>(Arrays.aslist(names));
//    newName = new ArrayList<>(newNames.subList(0, 5));