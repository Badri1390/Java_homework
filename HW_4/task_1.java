package Java_hw.Java_homework.HW_4;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;
public class task_1 {
    public static void main(String[] args){
        // Дан Deque состоящий из последовательности цифр.
        // Необходимо проверить, что последовательность цифр является палиндромом

    Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(6,5,4,4,5,6));

        boolean res = true;
        for (int i = 0; i < deque.size() / 2; i ++) {
            int f = deque.pollFirst();
            int l = deque.pollLast();
            if (f != l) {
                res = false;
                break;
            }
        }
        System.out.println(res ? "Палиндром" : "Не палиндром");
   
    }      
}

