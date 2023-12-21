import java.util.Scanner;

/**
 * @author Belitski Marat
 * @date 21.12.2023
 * @project TMS_AnOnl_17_Lesson_3
 */
public class Seasons {
    public static void main(String[] args) {

        //Задача № 1
        Scanner scanner = new Scanner(System.in);
        String winter = "Зима";
        String spring = "Весна";
        String summer = "Лето";
        String autumn = "Осень";
        String other = "Такого месяца не существует!";
        String choose = "Введите порядковый номер месяца: ";

        System.out.print(choose);

        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println(winter);
            case 3, 4, 5 -> System.out.println(spring);
            case 6, 7, 8 -> System.out.println(summer);
            case 9, 10, 11 -> System.out.println(autumn);
            default -> System.out.println(other);
        }

        //Задача № 2
        System.out.print(choose);
        int month = scanner.nextInt();

        if (month <= 2 && month!=0 || month == 12) {
            System.out.println(winter);
        } else if (month > 2 && month <= 5) {
            System.out.println(spring);
        } else if (month > 5 && month <= 8) {
            System.out.println(summer);
        } else if (month > 8 && month <= 11) {
            System.out.println(autumn);
        } else {
            System.out.println(other);
        }
    }
}