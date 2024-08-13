public class StringExample {
    public static void main(String[] args) {
        // String name = new String("aman");
        // System.out.println("hello" + name);
        // System.out.println(name.concat("buddy"));
        StringBuffer sb = new StringBuffer("aman");
        System.out.println(sb.length());
        sb.append("redd");
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);
    }
}
