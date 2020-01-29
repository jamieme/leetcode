
class Solution369{
    public static void main(String[] args){
        Solution369 s = new Solution369();
        Node addedListHead = s.solutionA(Node.construct(new int[]{9,9,9}));
        addedListHead.print();
    }

    public Node solutionA(Node head){
        /**
         * 1. reverse the list
         * 2. add 1 from head to tail
         * 3. reverse the processed list again
         */
        Node reversedHead = new Node(0,null);
        reverseList(head, reversedHead);
        Node trueHead = reversedHead.next;

        int left=1;
        Node tail = null;
        for(Node node=trueHead; node!=null;node=node.next){
            int sum = node.val + left;
            node.val = sum%10;
            left = sum/10;
            tail = node;
        }
        if(left>0){
            Node tmp = new Node(left,null);
            if(trueHead==null)  trueHead=tmp;
            else tail.next = tmp;
        }

        reverseList(trueHead, reversedHead);
        return reversedHead.next;
    }

    private Node reverseList(Node head, Node reverseHead){
        if(head==null)  return null;

        if(head.next==null){
            reverseHead.next = head;
            return head;
        }

        Node prev = reverseList(head.next, reverseHead);
        prev.next = head;
        head.next = null;

        return head;
    }
}