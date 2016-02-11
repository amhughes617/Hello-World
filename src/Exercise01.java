import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alexanderhughes on 2/11/16.
 */
public class Exercise01 {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "David", "Edward", "Albert", "Beth"};
        HashMap<Character, ArrayList<String>> nameMap = new HashMap<>();
        //create empty ArrayLists
        for (String name : names) {
            char firstLetter = name.charAt(0);
            if (!nameMap.containsKey(firstLetter)) {
                nameMap.put(firstLetter, new ArrayList<>());
            }
            nameMap.get(firstLetter).add(name);
        }
        //add names if using two for loops one to add all needed ArrayLists first, this one to add names
       // for (String name : names) {
       //     char firstLetter = name.charAt(0);
       //     nameMap.get(firstLetter).add(name);®
      //  }
        System.out.println(nameMap);

    }
}







/*   HashMap<String, ArrayList<String>> nameMap = new HashMap<>();
for (String name : names) {
        String firstLetter = String.valueOf(name.charAt(0));
        if (String.)
        }
        */