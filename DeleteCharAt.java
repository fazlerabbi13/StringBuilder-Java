public class DeleteCharAt {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");

        sb.deleteCharAt(4);

        System.out.println(sb);
    }
}
