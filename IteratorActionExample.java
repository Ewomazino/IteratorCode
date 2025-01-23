import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorActionExample {

    public static void main(String[] args) {
        // Create and initialize a list of words
        List<String> words = initializeWords();

        // Print the original list
        System.out.println("Original List: " + words);

        // Perform action: Remove words containing a specific character
        char filterChar = 'a';
        System.out.println("\nRemoving words containing the character '" + filterChar + "'...");
        List<String> filteredWords = removeWordsContainingCharacter(words, filterChar);
        System.out.println("Filtered List: " + filteredWords);

        // Perform action: Remove a specific word
        String wordToRemove = "cherry";
        System.out.println("\nRemoving the word '" + wordToRemove + "'...");
        filteredWords = removeSpecificWord(filteredWords, wordToRemove);
        System.out.println("Final List: " + filteredWords);
    }

    /**
     * Initializes a list of words.
     *
     * @return A list of sample words.
     */
    private static List<String> initializeWords() {
        List<String> words = new ArrayList<>();
        words.add("orange");
        words.add("apple");
        words.add("banana");
        words.add("grape");
        words.add("watermelon");
        words.add("cherry");
        words.add("strawberry");
        words.add("blueberry");
        words.add("kiwi");
        words.add("peach");
        words.add("pineapple");
        words.add("mango");
        words.add("raspberry");
        words.add("blackberry");
        words.add("papaya");
        words.add("dragonfruit");
        words.add("lychee");
        words.add("coconut");
        words.add("fig");
        words.add("guava");
        return words;
    }

    /**
     * Removes words from the list that contain a specific character.
     *
     * @param words      The list of words to filter.
     * @param filterChar The character to check for.
     * @return A new list with the filtered words.
     */
    private static List<String> removeWordsContainingCharacter(List<String> words, char filterChar) {
        // Create a copy of the list to avoid modifying the original
        List<String> filteredWords = new ArrayList<>(words);

        // Use an iterator to safely remove elements
        Iterator<String> iterator = filteredWords.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.indexOf(filterChar) != -1) { // Check if the word contains the character
                iterator.remove();
            }
        }
        return filteredWords;
    }

    /**
     * Removes a specific word from the list.
     *
     * @param words        The list of words to filter.
     * @param wordToRemove The word to remove.
     * @return A new list with the filtered words.
     */
    private static List<String> removeSpecificWord(List<String> words, String wordToRemove) {
        // Create a copy of the list to avoid modifying the original
        List<String> filteredWords = new ArrayList<>(words);

        // Use an iterator to safely remove elements
        Iterator<String> iterator = filteredWords.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.equals(wordToRemove)) { // Check if the word matches
                iterator.remove();
            }
        }
        return filteredWords;
    }
}