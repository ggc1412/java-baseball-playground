package stringCalc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    int operator(String opt, int a, int b) {
        int value = 0;
        switch (opt) {
            case "+":
                value = a + b;
                break;
            case "-":
                value = a - b;
                break;
            case "*":
                value = a * b;
                break;
            case "/":
                value = a / b;
        }
        return value;
    }

    int stringCalculate(String[] values){
        int a = Integer.parseInt(values[0]);

        for (int i = 1; i * 2 - 1 < values.length; i++) {
            a = operator(values[i * 2 - 1], a, Integer.parseInt(values[i * 2]));
        }
        return a;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        String[] values = value.split(" ");

        System.out.println(main.stringCalculate(values));
    }
}
