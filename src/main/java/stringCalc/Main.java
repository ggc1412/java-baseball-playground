package stringCalc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    int stringCalculate(String[] values){
        int a = Integer.parseInt(values[0]);

        for (int i = 1; i * 2 - 1 < values.length; i++) {
            switch (values[i * 2 - 1]) {
                case "+":
                    a = a + Integer.parseInt(values[i * 2]);
                    break;
                case "-":
                    a = a - Integer.parseInt(values[i * 2]);
                    break;
                case "*":
                    a = a * Integer.parseInt(values[i * 2]);
                    break;
                case "/":
                    a = a / Integer.parseInt(values[i * 2]);
                    break;
            }
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
