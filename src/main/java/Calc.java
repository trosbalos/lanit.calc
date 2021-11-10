import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Math math = new Math();
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Возможные действия ( + , - , / , * )");
        System.out.println("Пример ввода: 10 + 10");

            while (!(input = scanner.nextLine()).equals("exit")) {

                String[] line = input.split("\\s");
                Integer two = Integer.valueOf(line[0]);
                Integer three = Integer.valueOf(line[2]);

                    if (line[1].equals("+")) math.addition(two, three);
                    else if (line[1].equals("-")) math.subtraction(two, three);
                    else if (line[1].equals("*")) math.multiply(two, three);
                    else if (line[1].equals("/")) math.division(two, three);
                    else System.out.println("Введен недопустимый оператор");

                System.out.println("Возможные действия ( + , - , / , * )");
                System.out.println("Пример ввода: 10 + 10");
            }
    }
}

