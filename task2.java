import java.util.LinkedList;
import java.util.Scanner;

/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("yyyy");
        System.out.println("Текущий список: " + list);

        System.out.println("Введите элемент, чтобы добавить его: ");
        String elem = sc.nextLine();
        list.addLast(elem);
        System.out.println("Добавлен новый элемент: " + list);

        System.out.println("Первый элемент: " + list.peekFirst());

        list.removeFirst();
        System.out.println("Первый элемент удален, новый список: " + list);

        

    }


}
