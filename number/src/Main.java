import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello JavaWorld!");
        int x;
        int max = 100;
        int min = 1;
        int num = 0;
        x = (int)(Math.random() * ((max - min)+1)) + min;
        System.out.println("Загадано число " + x);
        Scanner in = new Scanner(System.in);

        while (num != x) {
            System.out.print("Введите загаданное число: ");
            num = in.nextInt();
            if (num < x) {System.out.println("Число меньше");}
            if (num > x) {System.out.println("Число больше");}
        }

        System.out.printf("Вы угадали. Это число: %d \n", x);
        in.close();
        //System.out.println(x);
    }

}