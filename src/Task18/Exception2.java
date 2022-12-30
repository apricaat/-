package Task18;

import java.util.Scanner;

// Если целые чила то java выкидывает ошибку java.lang.ArithmeticException: / by zero
// Если дробные то в java предусмотреты специальные числовые значение NaN, POSITIVE_INFINITY и NEGATIVE_INFINITY
// И при деление на дробный ноль мы не получаем ошибку и получаем спец значение
// Блок catch перехватывает исключение внутри блока мы можем его как то обработать, срабатывает только при выбросе ошибки
// Блок finally работает всегда


public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try {
            System.out.println(2 / i);
        }
        catch (Exception exception){
            System.out.println(exception.toString());
        }
        finally {
            System.out.println("Я работаю всегда");
        }
    }
}
