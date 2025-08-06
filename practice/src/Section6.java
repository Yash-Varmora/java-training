public class Section6 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hi";

        System.out.println(str1.length());

        System.out.println(str2.charAt(0));

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        StringBuilder sb = new StringBuilder("Hello");
        sb.insert(1, "w");
        sb.append(" World");
        int index =sb.indexOf("Hello");
        sb.delete(1, 2);
        sb.reverse();
        String str3 = sb.toString();
        System.out.println(str3);

    }
}
