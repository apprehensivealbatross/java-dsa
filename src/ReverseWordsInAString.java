public class ReverseWordsInAString {
    public static void main(String[] args) {
        String str = "my name is Victor";
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String s) {
        // trim the input string and split by one or more spaces
        String[] words = s.trim().split("\\s+");

        // initialize a StringBuilder
        StringBuilder sb = new StringBuilder();

        // iterate over the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            // append each word and a space
            sb.append(words[i]).append(' ');
        }

        // convert the StringBuilder to a string and trim the trailing space
        return sb.toString().trim();
    }

}
