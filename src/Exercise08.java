import java.util.ArrayList;

/**
 * Created by alexanderhughes on 3/2/16.
 */
public class Exercise08 {

    public static void main(String[] args) {
        String[] names = {"Charlie", "David", "Alice", "Bob"};
        ArrayList<String> sortedNames = new ArrayList<>();

        for (String name : names) {
            for (int i = 0; i < sortedNames.size(); i++) {
                if (name.compareTo(sortedNames.get(i)) < 0) {
                    sortedNames.add(i, name);
                }
            }
        }
        System.out.println(sortedNames);
        doingItTheRightWay(names);

    }

    static void doingItTheRightWay(String[] names) {
        ArrayList<String> sortedNames = new ArrayList<>();
        for (String name : names) {
            int index = 0;
            for (String sortedName : sortedNames) {
                if (name.compareTo(sortedName) > 0) {
                    index++;
                }
            }
            sortedNames.add(index, name);
        }
        System.out.println(sortedNames);
    }
}
