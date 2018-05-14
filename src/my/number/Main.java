package my.number;

public class Main {

    public static void main(String[] args) {
        MyBigNumber number1 = new MyBigNumber("1234");

        byte[] digits  = new byte[]{6,7,8,9};
        MyBigNumber number2 = new MyBigNumber(digits);

        System.out.println(number1.toString());
        System.out.println(number2.toString());

        number1.plus(number2);

        System.out.println(number1.toString());
    }
}
