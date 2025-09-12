public class detectCycle {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail= newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static boolean detectloop(){
        Node slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public void print(){
        if(head == null){
            System.out.println("Linked list is empty");
        }
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        detectCycle ll = new detectCycle();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        tail.next = head.next;
        System.out.println(detectloop());
    }
}
