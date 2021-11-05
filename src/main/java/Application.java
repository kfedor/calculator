

import java.util.Scanner;

/** При написании кода отталкивался от условия задания, стараясь соблюсти пункты:
 * - 2 переменных типа double в методе main
 * - отдельные методы с соответствующими операциями
 * - получение аргументов из главного метода и возврат ему соответствующих параметров
 * - вывод результата в консоль
 * понимаю, что можно было сделать по другому и не так громоздко, плюс видел на просторах интернета
 * более изящные варианты. Но получилось как получилось.
 */

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        double num1 = scan.nextDouble();
        System.out.println("Введите операцию: ");
        char operations = scan.next().charAt(0);
        System.out.println("Введите число: ");
        double num2 = scan.nextDouble();
        if(operations == '+')
        {
            double result = sum(num1, num2);
            System.out.println("Результат: " + result);
        } else if(operations == '-') {
            double result = sub(num1, num2);
            System.out.println("Результат: " + result);
        } else if(operations == '*') {
            double result = mult(num1, num2);
            System.out.println("Результат: " + result);
        } else if(operations == '/') {
            double result = div(num1, num2);
            System.out.println("Результат: " + result);
        } else if(operations == '^') {
            double result = exp(num1, num2);
            System.out.println("Результат: " + result);
        } else if(operations == '%') {
            double result = rem(num1, num2);
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Некорректный запрос");
        }
    }
    public static double sum(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }
    public static double sub(double num1,double num2) {
        double result = num1 - num2;
        return result;
    }
    public static double mult(double num1,double num2) {
        double result = num1 * num2;
        return result;
    }
    public static double div(double num1,double num2) {
        double result = num1/num2;
        if (num2 == 0) {
            System.out.println("Алёёё, делить на ноль нельзя!");
        }
        return result;
    }
    public static double exp(double num1,double num2) {
        double result = Math.pow(num1,num2);;
        return result;
    }
    public static double rem(double num1,double num2) {
        double result = num1 % num2;
        return result;
    }
}


















//public class Application {
//    public static void main(String[] args) {
//        double firstNumber = 3;
//        double secondNumber = 5;
//        sum();
//    }
//    double static sum() {
//        return 42;
//    }
//}
        /*double sum = x + y;
        double sub = x - y;
        double mult = x * y;
        double div = x / y;
        double rem = x % y;
        double z = Math.pow(x,y);*/
//
//public class Application {
//    double sum() {
//        double result = firstNumber + secondNumber;
//        return result;
//    }
//    double sub() {
//        double result = double firstNumber - double secondNumber;
//        return result;
//    }
//    double mult() {
//        double result = firstNumber * secondNumber;
//        return result;
//    }
//    double div() {
//        double result = firstNumber / secondNumber;
//        return result;
//    }
//
//    public static void main(String[] args) {
//        double firstNumber = 20;
//        double secondNumber = 5;
//        double sum(firstNumber;secondNumber);
//        double sub(firstNumber,secondNumber);
//        double mult(firstNumber,secondNumber);
//        double div(firstNumber,secondNumber);
//
//        if (firstNumber + secondNumber) {
//            System.out.println(sum());
//        }else if (firstNumber - secondNumber) {
//            System.out.println(sub());
//        }else if (firstNumber * secondNumber) {
//            System.out.println(mult());
//        }else if (firstNumber / secondNumber) {
//            System.out.println(div());
//        }
//    }
//}

//public class Application {
//    double sum(double firstNumber, double secondNumber) {
//       double result =  firstNumber + secondNumber;
//        return result;
//

