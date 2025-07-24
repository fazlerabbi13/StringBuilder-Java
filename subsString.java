public class subsString {
    public static void main(String[] args)
    {

        // create a StringBuilder object
        // with a String pass as parameter
        StringBuilder str
            = new StringBuilder("GeeksForGeeks");

        // print string
        System.out.println("String contains = " + str);

        // get substring start from index 5 to index 8
        // using substring() and print results
        System.out.println("SubSequence = "
                           + str.substring(5, 8));
    }
}
