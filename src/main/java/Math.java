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
        System.out.println("Вычитаем "+ two + " из " + tree + ". Получаем результат: " + i);
        return i;
    }
}