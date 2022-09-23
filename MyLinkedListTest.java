package List;

public class MyLinkedListTest {

    public static void main(String args[]) {

        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        // add the number 4 to the linked list
        list.addFirst(4);

        System.out.println(list.get(0));

        // the number should be 4

        // add the number 6 to the linked list, the addFirst() method should make the list now be ordered 6,4
        list.addFirst(6);

        System.out.println(list.get(0) + ", " + list.get(1));

        // the result should be "6, 4"
        System.out.println(list.size()); // should be 2

        list.addLast(9); // order should now be 6, 4, 9

        System.out.println(list.get(0) + ", " + list.get(1) + ", " + list.get(2));

        list.remove(4);

        // The 4 should have been removed
        System.out.println(list.get(0) + ", " + list.get(1));

        // The size of the list should now be 2
        System.out.println(list.size());
    }
}