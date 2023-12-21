import java.util.Scanner;

/**
 * @author Belitski Marat
 * @date 21.12.2023
 * @project TMS_AnOnl_17_Lesson_3
 */
public class Cycles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задача № 1
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        //Задача № 2
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }


        //Задача № 4
        boolean exit = false;
        int number = 0;

        while (!exit) {
            number += 7;
            System.out.println(number);

            if (number == 98) {
                exit = true;
            }
        }


        //Задача № 5
        int ex = 0;
        for (int i = 10; i > 0; i--) {
            System.out.println(ex);
            ex += -5;
        }

        //Задача № 3
        System.out.print("Введите число до которого нужно суммировать: ");
        int input = scanner.nextInt();

        int temp = 0;
        for (int i = 1; i < input; i++) {
            temp += i;
        }
        System.out.printf("Сумма чисел от 1 до %S (не включительно) равна %S", input, temp);
    }
}

