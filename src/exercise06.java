import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by alexanderhughes on 2/25/16.
 */
public class exercise06 {

    public static void main(String[] args) {
        //reverse the list
        //turn it into HashMap
        //{"Smith":"Alice", "Hope":"Bob","Brown":"Charlie"}
        String[] names = {"Alice", "Smith", "Bob", "Hope", "Charlie", "Brown", "Bob"};
        HashMap<String, String> nameMap = new HashMap();
        for (int i = 0; i < names.length - 1; i += 2) {
            nameMap.put(names[i + 1], names[i]);
        }
        System.out.println(nameMap.toString());

        doingItInTwoSteps(names);
        doingItAnotherWay(names);

    }


    static void doingItInTwoSteps(String[] names) {
        ArrayList<String> reversedNames = new ArrayList<>();
        for (int i = names.length - 1; i >= 0; i--) {
            reversedNames.add(names[i]);
        }
        System.out.println(reversedNames.toString());
    }
    static void doingItAnotherWay(String[] names) {
        ArrayList<String> reversedNames = new ArrayList<>(Arrays.asList(names));
        Collections.reverse(reversedNames);
        HashMap<String, String> nameMap = new HashMap<>();
        for (int i = 0; i < reversedNames.size(); i+=2) {
            nameMap.put(reversedNames.get(i), reversedNames.get(i+1));
        }
        System.out.println(reversedNames.toString());
    }
}
