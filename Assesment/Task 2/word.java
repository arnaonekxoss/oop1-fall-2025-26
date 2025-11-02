public class word {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String oldWord = "fox";
        String newWord = "cat";

        String newSentence = sentence.replace(oldWord, newWord);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Replaced sentence: " + newSentence);
    }
}