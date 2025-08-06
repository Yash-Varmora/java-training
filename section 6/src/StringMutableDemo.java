public class StringMutableDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("world");
        stringBuilder.insert(0, "Hello");
        stringBuilder.deleteCharAt(4);
        stringBuilder.insert(4, 'o');
        stringBuilder.setLength(5);
        stringBuilder.reverse();
        String str = stringBuilder.toString();

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.insert(0, "Hello");
        stringBuffer.deleteCharAt(4);
        stringBuffer.insert(4, 'o');
        stringBuffer.setLength(5);
        stringBuffer.append("world");
        stringBuffer.reverse();
        String str1 = stringBuffer.toString();

    }
}
