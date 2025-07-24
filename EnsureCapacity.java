public class EnsureCapacity {
    // Java program to demonstrate
// the ensureCapacity() Method.

    public static void main(String[] args)
    {

        // create a StringBuilder object
        StringBuilder str = new StringBuilder();

        // print string capacity
        System.out.println("Before ensureCapacity"
                           + " method capacity = "
                           + str.capacity());

        // apply ensureCapacity()
        str.ensureCapacity(25);

        // print string capacity
        System.out.println("After ensureCapacity"
                           + " method capacity = "
                           + str.capacity());
    }
}