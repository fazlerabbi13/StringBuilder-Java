public class AppendWithVaDataType {
    public static void main(String[] args) {
      
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("The value is ");

        // Append various data types
        sb.append(21);           
        sb.append(", ");         
        sb.append(7.01);          
        sb.append(", or ");      
        sb.append(false);       

        System.out.println(sb);
    }
}
