import java.util.Scanner;

/**
 * @author Belitski Marat
 * @date 21.12.2023
 * @project TMS_AnOnl_17_Lesson_3
 */
public class Advance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задача № 3
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
        System.out.println();


        //Задача № 2
        System.out.print("Введите сумму вклада: ");
        float deposit = scanner.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int term = scanner.nextInt();
        float percent = 7.0F;

        for (int i = 1; i <= term; i++) {
            deposit = deposit + (deposit / 100 * percent);
        }
        System.out.printf("Сумма средств по окончанию договора: %.2f рублей", deposit);


        //Задача № 1
        int fibOne = 0;
        int fibSec = 1;
        int fibSum;
        System.out.println(fibOne);
        System.out.println(fibSec);

        for (int i = 3; i <= 11; i++) {
            fibSum = fibOne + fibSec;
            fibOne = fibSec;
            fibSec = fibSum;
            System.out.println(fibSum);
        }
    }
}
