public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> linkedlist = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            linkedlist.addFirst(i);
            System.out.println(linkedlist);
        }
        linkedlist.add(2, 666);
        System.out.println(linkedlist);

        linkedlist.remove(2);
        System.out.println(linkedlist);

        linkedlist.removeFirst();
        System.out.println(linkedlist);

        linkedlist.removeLast();
        System.out.println(linkedlist);
    }
}
