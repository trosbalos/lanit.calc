import java.util.Scanner;

public class Math {

    public Object addition(Object two, Object tree) {

        int i = (Integer)two + (Integer)tree;
        System.out.println("Складываем "+ two + " и " + tree + ". Получаем результат: " + i);
        return i;
    }
    public Object multiply(Object two, Object tree) {
        int i = (Integer)two * (Integer)tree;
        System.out.println("Умножаем "+ two + " и " + tree + ". Получаем результат: " + i);
        return i;
    }
    public Object division(Object two, Object tree) {
        int i = (Integer)two / (Integer)tree;
        System.out.println("Делим "+ two + " на " + tree + ". Получаем результат: " + i);
        return i;
    }
    public Object subtraction(Object two, Object tree) {
        int i = (Integer)two - (Integer)tree;
        System.out.println("Вычитаем "+ tree + " из " + two + ". Получаем результат: " + i);
        return i;
    }
    public void start(){
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Возможные действия ( + , - , / , * )");
        System.out.println("Пример ввода: 10 + 10");

        while (!(input = scanner.nextLine()).equals("exit")) {

            String[] line = input.split("\\s");
            Integer two = Integer.valueOf(line[0]);
            Integer three = Integer.valueOf(line[2]);

            if (line[1].equals("+")) addition(two, three);
            else if (line[1].equals("-")) subtraction(two, three);
            else if (line[1].equals("*")) multiply(two, three);
            else if (line[1].equals("/")) division(two, three);
            else System.out.println("Введен недопустимый оператор");

            System.out.println("Возможные действия ( + , - , / , * )");
            System.out.println("Пример ввода: 10 + 10");
        }
    }
}