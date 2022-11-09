/*калькулятор добавьте возможность отменить последнюю операцию.
Пример
1+2
3
+4
7
Отмена
3
*3
9*/

import java.util.Scanner;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        st.push(a);
        int res;

        while (true) {
            System.out.println("Введите операцию + - / *: " + "Введите skip для отмены предыдущего действия ");
            //char op;
            //op = sc.next().charAt(0);
            String op = sc.next();
            if (op.equals("skip")) {
                st.pop();
                a = st.peek();
                System.out.println(a);
            } else {
                System.out.println("Введите второе число: ");
                int b = sc.nextInt();

                switch (op) {
                    case "+":
                        res = a + b;
                        System.out.printf("Result: %d \n", res);
                        st.push(res);
                        a=res;
                        break;
                    case "-":
                        res = a - b;
                        System.out.printf("Result: %d \n", res);
                        st.push(res);
                        a=res;
                        break;
                    case "/":
                        res = a / b;
                        System.out.printf("Result: %d \n", res);
                        st.push(res);
                        a=res;
                        break;
                    case "*":
                        res = a * b;
                        System.out.printf("Result: %d \n", res);
                        st.push(res);
                        a=res;
                        break;
                }
            }
        }
    }
}