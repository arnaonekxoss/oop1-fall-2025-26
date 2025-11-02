
public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");

        String originalSentence = scanner.nextLine();

        String upperCaseSentence = originalSentence.toUpperCase();

        String lowerCaseSentence = originalSentence.toLowerCase();

        
        System.out.println("\nOriginal Sentence: " + originalSentence);
        System.out.println("Uppercase: " + upperCaseSentence);
        System.out.println("Lowercase: " + lowerCaseSentence);

    }
}

