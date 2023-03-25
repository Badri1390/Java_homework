package Java_hw.Java_homework.HW_1;

import java.util.Scanner;

public class program {
    public static void main(String[] args){
// 1.Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. 
// Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
// Sample Input:8, 11
// Sample Output:512, 1331

    Scanner in = new Scanner(System.in);
    int[] array = new int[2];
    for (int i = 0; i < array.length; i++) {
        System.out.println("Введите число от 1 до 1000: ");
        array[i] = in.nextInt();
    }
    System.out.println(Math.round(Math.pow(array[0],3)));
    System.out.println(Math.round(Math.pow(array[1],3)));


// 2.Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число,
// на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.
// Sample Input:4, 1, 2, 3, 5, 2
// Sample Output:2, 4, 6, 10

    System.out.println("Введите число n: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.println("Введите число: ");
        array[i] = input.nextInt();
    }
    System.out.println("Введите число, на которое нужно умножить: ");
    int x = input.nextInt();
    for (int i : array) {
        System.out.println(i*x);
    }


// 3.Реализовать простой калькулятор (+,-,=,*), только с целыми числами.

    System.out.println("Введите первое число: ");
    Scanner input = new Scanner(System.in);
    int a = input.nextInt(); 
    System.out.println("Введите второе число: ");
    int b = input.nextInt(); 
    System.out.println("Выберите математическое действие (+,-,=,*): ");
    String x = input.next();
    switch (x) {
        case "+":
            System.out.println("Ответ: " + (a+b));
            break;
        case "-":
            System.out.println("Ответ: " + (a-b));
            break;
        case "*":
            System.out.println("Ответ: " + (a*b));
            break;
        case "/":
            System.out.println("Ответ: " + (a/b));
            break;
        default:
            break;
    }




    }
}
