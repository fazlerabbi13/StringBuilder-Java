public class Replace {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Be consistent with your routine");

        sb.replace(0, 3, "with ");

        System.out.println(sb);
    }
}
