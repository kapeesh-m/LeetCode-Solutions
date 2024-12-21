/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null){
            return null;
        }
        ArrayList<Integer> li=new ArrayList<>();
        while(head!=null){
            li.add(head.val);
            head=head.next;
        }
        Collections.sort(li);
        ListNode temp=new ListNode(-1);
        ListNode head1=temp;
        for(int i:li){
            temp.next=new ListNode(i);
            temp=temp.next;
        }
        head1=head1.next;
        return head1;
    }
}