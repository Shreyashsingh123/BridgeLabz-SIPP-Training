public class WordSearch {
    public static String solve(String[] s, String word) {
        for (String sentence : s) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {
            "I like apples.",
            "He is reading a book.",
            "She plays cricket.",
            "We are going home."
        };
        String word = "book";
        String result = solve(sentences, word);
        System.out.println(result);
    }
}
