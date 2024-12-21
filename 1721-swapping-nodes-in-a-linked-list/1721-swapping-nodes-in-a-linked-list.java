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
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> li=new ArrayList<>();
        ListNode current=head;
        while(current!=null){
            li.add(current.val);
            current=current.next;
        }
        int size=li.size();
        int t1=k-1,t2=size-k;
        int temp=li.get(t1);
        li.set(t1,li.get(t2));
        li.set(t2,temp);

        current = head;
        int i = 0;
        while (current != null) {
            current.val = li.get(i);
            current = current.next;
            i++;
        }

        return head;
    }
}