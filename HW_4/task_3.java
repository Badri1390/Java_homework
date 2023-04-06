package Java_hw.Java_homework.HW_4;
import java.util.*;
//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false
public class task_3 {
    public static void main(String[] args) {  
       System.out.println(IsItRight("([])")); 

    }  
    private static boolean IsItRight(String newString){
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Deque<Character> str = new LinkedList<>();
        for (Character el : newString.toCharArray()) {
            if(map.containsValue(el)){
                str.push(el);
            }else if (map.containsKey(el)){
                if (str.isEmpty() || str.pop() != map.get(el)){
                    return false;
                }
            }
        }
        return str.isEmpty();
    }  

}

