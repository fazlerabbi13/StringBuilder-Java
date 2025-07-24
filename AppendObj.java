public class AppendObj {
     public static void main(String[] args) {
      
        StringBuilder sb = new StringBuilder("");
        Object o = 21;
      
        // Appends the string representation 
        // of the object
        sb.append(o); 
        System.out.println(sb); 
    }
}
