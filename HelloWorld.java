/*Сделано для проверки работы
репозитория*/
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Calculate two numbers:");
        int one = Integer.valueOf(args[0]);
        int two = Integer.valueOf(args[1]);
        int result = one + two;
        System.out.println(result);
    }
}