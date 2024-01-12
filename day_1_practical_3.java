public class day_1_practical_3 {


    static class node {
        int data;
        node next;

        public node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    static class linkedlist {
        node head;
        node tail;

        public void insert(int data) {
            node newnode = new node(data);
            if (head == null) {
                head = newnode;
                tail = newnode;
            } else {
                tail.next = newnode;
                tail = newnode;
            }
        }

        public void delete(int data) {
            node current = head;
            node previous = null;
            while (current != null) {
                if (current.data == data) {
                    if (previous == null) {
                        head = current.next;
                    } else {
                        previous.next = current.next;
                    }
                    break;
                }
                previous = current;
                current = current.next;
            }
        }

        public void traverse() {
            node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
            linkedlist list = new linkedlist();
            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.insert(4);
            list.insert(5);
            System.out.println("Original List:");
            list.traverse();
            list.delete(3);
            System.out.println("List after deletion:");
            list.traverse();


        }


}