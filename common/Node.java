public class Node{
    int val;
    Node next;
    public Node(int val, Node next){
        this.val = val;
        this.next = next;
    }

    public void print(){
        Node curr = this;
        while(curr!=null){
            System.out.format("%d ", curr.val);
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node construct(int[] values){
        Node head = null,curr=null;
        for(int v : values){
            Node tmp = new Node(v, null);
            if(curr==null){
                head = curr = tmp;
                continue;
            }
            curr.next = tmp;
            curr = tmp;
        }

        return head;
    }
}