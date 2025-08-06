public class StringFormatDemo {
    public static void main(String[] args) {
        String message = "Hello, %s ! you have %d messages";
        String yash = String.format(message, "Yash", 3);
        System.out.println(yash);
    }
}
