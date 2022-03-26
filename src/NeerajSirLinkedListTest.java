import java.util.Scanner;

public class NeerajSirLinkedListTest<T extends Number> {
    Node head;
    int size;
    class Node
    {
        Node next;
        T data;
        public Node(T value)
        {
            this.data=value;
            this.next=null;
        }

    }
    public void insert(T value){
        Node node=new Node(value);
        if(head==null)
        {
            head=node;
            size++;
        }
        else {
            size++;
            node.next = head;
            head = node;
        }
    }
    // this method is used to print the linked List
    public void printLikedList1() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    // this method is used to print the size of the linkedList
    public int size()
    {
        return size;
    }
    // testing value methods
    int c=0;
    public boolean checker(Number x)
    {
        Node temp=head;
        int f=0;
        while(temp!=null)
        {
            if(temp.data==x)
            {
                f=1;
                c++;
            }
            temp=temp.next;
        }
        if(f==1)
        {
            return true;
        }
        return false;
    }
    // add the value in the last if the value of x is not present in the linkedList
    public void addLast(T x)
    {
        Node newNode=new Node(x);
        if(!checker(x))
        {
            size++;
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;

        }
        else
        {
            System.out.println("value already present no need to add in the linkedList");
        }
    }
    // remove the value of x is present in the linkedList
    public void remove(T x)
    {
        // count method knows the which position the value are present (by using the 'c' variable)

        if(checker(x))
        {

            int count=1;
            Node current=head;
            while(count<c-1)
            {
                current=current.next;
                count++;
            }
            current.next=current.next.next;
            size--;
        }
        else
        {
            System.out.println("Value is not present in the linked list that you want to delete");
        }
    }
    // add the element of the linked list at perticular position
    public void addSpecificPosition(T val,int p)
    {
        Node newNode=new Node(val);
        size++;
        Node previous=head;
        int k=1;
        while(k<p-1)
        {
            previous=previous.next;
            k++;
        }
        Node current=previous.next;
        previous.next=newNode;
        newNode.next=current;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        NeerajSirLinkedListTest<Number> obj=new NeerajSirLinkedListTest<Number>();
        System.out.println("Enter the number of  element that you want to insert");
        int n=readme.nextInt();
        for (int i = 0; i <n; i++) {
            obj.insert(readme.nextInt());
        }
        obj.printLikedList1();
        System.out.println("Enter the value  of x that you want to check");
        int x=readme.nextInt();
        boolean b=obj.checker(x);
        System.out.println(b);
        obj.addLast(x);
        System.out.println("change if the value is not already exist in the linkedlist other wise print the same");
        obj.printLikedList1();
        obj.remove(x);
        System.out.println("if element x present in the linked list then after deletion the element");
        obj.printLikedList1();
        System.out.println("Add the element of the linkedList at the given position");
        obj.addSpecificPosition(7,3);
        System.out.println("After adding ");
        obj.printLikedList1();


        System.out.println("size of the linkedList is->"+obj.size);
    }

}
