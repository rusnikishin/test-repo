/*Сделано для проверки работы
репозитория*/
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Raised by the power (enter two number, separated by a space): ");
        double one = Double.valueOf(args[0]);
        double two = Double.valueOf(args[1]);
        double result = java.lang.StrictMath.pow(one, two);
        System.out.println(result);
    }
}