import java.util.Scanner;

/**
 * @author Belitski Marat
 * @date 21.12.2023
 * @project TMS_AnOnl_17_Lesson_3
 */
public class Values {
    public static void main(String[] args) {

        //Задача № 3
        Scanner scanner = new Scanner(System.in);
        String input = "Введите число: ";

        System.out.print(input);
        while (scanner.hasNext()) {

            int choose = scanner.nextInt();

            int result = choose % 2;
            if (result == 0) {
                System.out.println("Это четное число");
                System.out.print(input);
            } else {
                System.out.println("Это нечетное число");
                System.out.print(input);
            }
        }


        //Задача № 4
        System.out.print("Введите температуру: ");
        int t = scanner.nextInt();

        if (t > -5){
            System.out.println("Тепло");
        }else if (t <=-20){
            System.out.println("Холодно");
        }else {
            System.out.println("Нормально");
        }


        //Задача № 5
        System.out.print("Введите порядковый номер цвета: ");
        int color = scanner.nextInt();

        switch (color){
            case 1 -> System.out.println("Красный");
            case 2 -> System.out.println("Оранжевый");
            case 3 -> System.out.println("Желтый");
            case 4 -> System.out.println("Зеленый");
            case 5 -> System.out.println("Голубой");
            case 6 -> System.out.println("Синий");
            case 7 -> System.out.println("Фиолетовый");
            default -> System.out.println("Такого цвета не существует !");
        }
    }
}
