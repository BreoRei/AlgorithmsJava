package SinglyLinkedList;

public class main {
    public static void main(String[] args) {

        singlyLinkedList my_list = new singlyLinkedList();
        my_list.addToStart(2);
        my_list.add(6);
        my_list.addToStart(4);
        my_list.add(10);
        my_list.addToStart(8);
        my_list.add(20);


        System.out.println("Односвязный список:");
        my_list.printList();
        System.out.println();

        System.out.println("Отсортированный односвязный список:");
        my_list.bubbleSort();
        my_list.printList();
        System.out.println();

        System.out.println("Перевернутый отсортированный односвязный список:");
        my_list.reverse();
        my_list.printList();
    }

}
