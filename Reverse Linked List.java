class Solution {
    public ListNode reverseList(ListNode head) {
        //first we declare the dummyNode--because we can store in reverse order
        ListNode newHead=null;
        //iterate the node
        while(head!=null){
            //Find the nextNode
            ListNode next=head.next;
            //break the headNode and strore dummy
            head.next=newHead;
            newHead=head;
            head=next;
        }
        return newHead;
        
    }
}
