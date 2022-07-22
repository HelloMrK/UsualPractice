package indi.likai.leetcode;

public class RemoveDuplicatesFromSortedList_83 {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList_83 r=new RemoveDuplicatesFromSortedList_83();
        r.deleteDuplicates(new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(2)))));

    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while (temp!=null &&temp.next!=null){
            if (temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else {
                temp=temp.next;
            }
        }
        return head;

    }
}

