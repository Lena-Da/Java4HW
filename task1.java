import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("yyyy");
        System.out.println(list);

        LinkedList<String> revList = new LinkedList<String>();
        for (int i = list.size()-1; i >= 0; i--) {
            revList.add(list.get(i));
        }
        System.out.println(revList);
    }
}