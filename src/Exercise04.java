import java.util.*;

/**
 * Created by alexanderhughes on 2/22/16.
 */
public class Exercise04 {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        sentence = sentence.toLowerCase();
        sentence = sentence.replace(",", "").replace(".","");
        System.out.println(sentence);
        String[] words = sentence.split(" ");System.out.println();
        List<String> wordList = Arrays.asList(words);
        Set<String> wordSet = new LinkedHashSet<String>(wordList);
        ArrayList<String> frequencies = new ArrayList<>();//LinkedHashSet does not allow duplicate values

        for (String word : words) {
            if(!frequencies.contains(word)) { //or (!frequencies.containsKey(word))
                frequencies.add(word);
            }
        }
        System.out.println(String.join(" ", frequencies));
    }
}
