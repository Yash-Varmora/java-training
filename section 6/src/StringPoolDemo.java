public class StringPoolDemo {
    public static void main(String[] args) {
        String hello = "hello";
        String hi = "hello";
        String hey = "hey";
        System.out.println(hello == hi);
        System.out.println(hello.hashCode());
        System.out.println(hi.hashCode());
        System.out.println(hey.hashCode());
    }
}
