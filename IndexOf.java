public class IndexOf {
    public static void main(String[] args) {
        String s = new String("Welcome to geeksforgeeks");

        // Initializing search string
        String s1 = new String("for");

        // print the index of initial character
        // of Substring after 14th position
        System.out.print(
            "Found geeks(after 14th index) starting at position: ");
        System.out.print(s.indexOf(s1,15));
    }
}
