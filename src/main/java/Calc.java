import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Math math = new Math();
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Введите действие (+, -, / , *)");
        System.out.println("Пример ввода: 10 + 10");

            while (!(input = scanner.nextLine()).equals("exit")) {

                String[] line = input.split("\\s");
                    if (line[1].equals("+")) math.addition(line[0], line[2]);
                    else if (line[1].equals("-")) math.subtraction(line[0], line[2]);
                    else if (line[1].equals("*")) math.multiply(line[0], line[2]);
                    else if (line[1].equals("/")) math.division(line[0], line[2]);
                    else System.out.println("Введен недопустимый оператор");

                System.out.println("Введите действие (+, -, / , *)");
                System.out.println("Пример ввода: 10 + 10");
            }
    }
}

