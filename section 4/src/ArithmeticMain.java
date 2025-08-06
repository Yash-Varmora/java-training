public class ArithmeticMain {
    public static void main(String[] args) {
        int result = ArithmeticOperations.addition(20,4);
        System.out.println(result);
        System.out.println(ArithmeticOperations.PI_VALUE);
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        System.out.println(arithmeticOperations.sum(20,4));
        System.out.println(arithmeticOperations.piValue);

    }
}
