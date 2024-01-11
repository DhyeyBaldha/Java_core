public class day_1_practical_3 {


    static class node {
        int data;
        node next;

        public node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    class linkedlist{
        node head;
        node tail;

        public void insert(int data){
            node newnode= new node(data);
            if (head==null){
                head=newnode;
                tail=newnode;
            }
            else {
                tail.next=newnode;
                tail=newnode;
            }
        }
        public void delete(int data){
            node current=head;
            node privious=null;
            while (current==null){

            }
        }
    }

    public static void main(String [] args){


    }

}
