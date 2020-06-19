import com.sun.scenario.effect.impl.state.AccessHelper;

import javax.swing.*;

public class FizzBuzz {
    public static String fizzBuzz(int number) {

        String string = String.valueOf(number);
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '3') {
                result = "Fizz";
            } else if (c == '5')
                result = "Buzz";
        }
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                result = "FizzBuzz";
            } else
                result = "Fizz";
        } else if (number % 5 == 0)
            result = "Buzz";
        else
            result = "" + chuso(number);
        return result;
    }

    public static String donVi(int n) {
        switch (n) {
            case 0:
                return "";
            case 1:
                return "một";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bốn";
            case 5:
                return "năm";
            case 6:
                return "sáu";
            case 7:
                return "bảy";
            case 8:
                return "tám";
            default:
                return "chín";
        }
    }

    public static String hangChuc(int n) {
        switch (n) {
            case 1:
                return "mười";
            case 2:
                return "hai mươi";
            case 3:
                return "ba mươi";
            case 4:
                return "bốn mươi";
            case 5:
                return "năm mươi";
            case 6:
                return "sáu mươi";
            case 7:
                return "bảy mươi";
            case 8:
                return "tám mươi";
            default:
                return "chín mươi";
        }
    }
    public static String chuso(int number) {
        String strNum, num1, num2, char1, char2;
        String result = "";
        int firstNumber, secondNumber;
        strNum = String.valueOf(number);
        if (strNum.length() == 1) {
            char2 = strNum.substring(0, 1);
            secondNumber = Integer.parseInt(char2);
            num2 = donVi(secondNumber);
            result = num2;
        } else if (strNum.length() == 2) {
            char2 = strNum.substring(1, 2);
            char1 = strNum.substring(0, 1);
            secondNumber = Integer.parseInt(char2);
            firstNumber = Integer.parseInt(char1);
            num2 = donVi(secondNumber);
            num1 = hangChuc(firstNumber);
            result = num1 + " " + num2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.printf(fizzBuzz(13));
    }
}
