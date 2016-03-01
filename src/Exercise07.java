import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by alexanderhughes on 3/1/16.
 */
public class Exercise07 {
    public static void main(String[] args) throws FileNotFoundException {
        //read csv file into an arraylist
        ArrayList<String> names = new ArrayList<>();
        //just grab first nae and last name, ex; "Martha Jenkins"
        String searchTerm = "ali";
        File f = new File("people.csv");
        Scanner scanner = new Scanner(f);
        scanner.nextLine();
        while (scanner.hasNext()) {
            String[] columns = scanner.nextLine().split(",");
            String name = columns[1] + " " + columns[2];
            names.add(name);
        }
        ArrayList<String> results = new ArrayList<>();
        for (String name: names) {
           // String[] splitName = name.split();
            if(name.toLowerCase().contains(searchTerm)) {
                results.add(name);

            }
        }
        System.out.println(results);
        doingItWithStreams(names);
        //new arraylist called results

    }

    static void doingItWithStreams(ArrayList<String> names) {
        ArrayList<String> results = new ArrayList<>();
        results = names.stream()
                .filter((name) -> {
                    return name.toLowerCase().contains("ali");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(results);
    }
}
