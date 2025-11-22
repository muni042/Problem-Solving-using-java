import java.util.Scanner;

class LListFuction{
    Node head1,tail1;
    Node head2,tail2;
    public void addnumList1(int a)
    {
        if(head1==null)
        {
            head1=new Node(a);
            tail1=head1;
        }
        else{
            Node temp=new Node(a);
            tail1.next=temp;
            tail1=temp;
        }

    }
    public void addnumList2(int a)
    {
        if(head2==null)
        {
            head2=new Node(a);
            tail1=head1;
        }
        else{
            Node temp=new Node(a);
            tail2.next=temp;
            tail2=temp;
        }

    }
    public Node AddTwoList(Node head1,Node head2)
    {
        Node head3;
        
        return head3;

    }
    
}
class Node{
    int val;
    Node next;
    Node()
    {

    }
    Node(int val)
    {
        this.val=val;
    }
    Node(int val,Node next)
    {
        this(val);
        this.next=next;
    }
    
}
public class AddNumLL{
    public static void main(String[] args) {
        LListFuction ref=new LListFuction();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value for List1");
        for(int i=0;i<3;i++)
        {
            ref.addnumList1(in.nextInt());
        }
        System.out.println("Enter the value for List2");
        for(int i=0;i<3;i++)
        {
            ref.addnumList2(in.nextInt());
        }
    }
}