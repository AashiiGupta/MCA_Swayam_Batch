public class RemoveCycle {
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
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public boolean detectCycle(){
        Node slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }

    public void removeCycle(){
        boolean exist = false;
        Node slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                exist=true;
                break;
            }
        }
        if(exist == false) return;
        slow=head;
        Node prev = null;
        while(slow!=fast){
            prev = fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next = null;
    }
    public static void main(String args[]){
        RemoveCycle ll = new RemoveCycle();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        tail.next = head.next.next;
        System.out.println(ll.detectCycle());
        ll.removeCycle();
        System.out.println(ll.detectCycle());
    }
}
