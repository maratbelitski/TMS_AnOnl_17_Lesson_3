import java.util.Scanner;

/**
 * @author Belitski Marat
 * @date 21.12.2023
 * @project TMS_AnOnl_17_Lesson_3
 */
public class Seasons {
    public static void main(String[] args) {

        //Задача №1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите порядковый номер месяца: ");

        int monthNumber = scanner.nextInt();
        switch (monthNumber){
            case 12,1,2 -> System.out.println("Зима");
            case 3,4,5 -> System.out.println("Весна");
            case 6,7,8 -> System.out.println("Лето");
            case 9,10,11 -> System.out.println("Осень");
            default -> System.out.println("Такого месяца не существует!");
        }
    }
}