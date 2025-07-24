public class AppendWithSubseque {
    public static void main(String[] args) {
      
        StringBuilder sb = new StringBuilder("Welcome to ");
        CharSequence ch = "JavaProgramming";

        // Appends 'Programming' from the CharSequence
        sb.append(ch, 5, 14);
        System.out.println(sb); 
    }
}