public class AppendWithSubArr {
    public static void main(String[] args) {
      
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Programming ");

        // Create a character array
        char[] ch = {'i', 'n', ' ', 'J', 'a', 'v', 'a'};

        // Append part of the character array
        sb.append(ch, 0, 4);   // Appends "in J"

        System.out.println(sb);
    }
}
