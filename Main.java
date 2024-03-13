import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static boolean isPalindrome(String word) {
        String reverse = buildReverse(word);
        return word.equalsIgnoreCase(reverse);
    }

    private static String buildReverse(String word) {
        Deque<Character> stack = fillStack(word);
        StringBuilder reverse = new StringBuilder();

        while (!stack.isEmpty()) {
            reverse.append(stack.pop());
        }

        return reverse.toString();
    }

    private static Deque<Character> fillStack(String word) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(Character.toLowerCase(word.charAt(i)));
        }

        return stack;
    }

    public static void main(String[] args) {
        String word = "kayak";
        System.out.println(isPalindrome(word));

        word = "Hello";
        System.out.println(isPalindrome(word));

        word = "I saw I was I";
        System.out.println(isPalindrome(word));
    }
}