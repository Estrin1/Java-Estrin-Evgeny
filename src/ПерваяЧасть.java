import java.util.Random;
import java.util.Scanner;
// Код: 1)Если введенное числа более 7 вывести привет
// 2)Если введенное имя Вячеслав, то вывести привет 3)На входе дан массив int вывести все числа кратные 3

public class ПерваяЧасть {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число для проверки"+ "\t");
        Integer luckNumber = input.nextInt();
        if (luckNumber > 7) {
            System.out.println("Привет");
        }

        System.out.println("Введите имя");
        String name = input.next();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет");
        }
        System.out.println("Введите количество чисел в массиве");
        Integer LengthM = input.nextInt();
        int[] myArray = new int[LengthM];
        System.out.println("Хотите заполнить массив автоматически?, напишите да, или нет");
        String variant = input.next();

        if (variant.equals("да")) {
            System.out.println("Созданный массив :");
            for (int i = 0; i < LengthM; i++) {
                Random ran = new Random();
                myArray[i] = ran.nextInt(0,100);

                System.out.print(myArray[i]+ "\t");
            }

        }
        else if (variant.equals("нет")){
            System.out.println("Введите " + LengthM +" чисел через пробел");
            System.out.println("Созданный массив :");
            for (int i = 0; i < LengthM; i++) {
                myArray[i] = input.nextInt();

            }
        }
        System.out.println("все числа массива кратные 3:");
        for (int i = 0; i < LengthM; i++) {
            if(myArray[i] % 3 == 0){
                System.out.print(myArray[i]+"\t");}
        }
        }
    }



