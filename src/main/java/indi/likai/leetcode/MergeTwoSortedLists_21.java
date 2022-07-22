package indi.likai.leetcode;

public class MergeTwoSortedLists_21 {
    public static void main(String[] args) {
        MergeTwoSortedLists_21 m=new MergeTwoSortedLists_21();
        ListNode list1=new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode list2=new ListNode(1,new ListNode(3,new ListNode(4)));
        System.out.println(m.mergeTwoLists(list1,list2).toString());
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tmp=new ListNode();
        while (!(list1==null && list2 ==null)){
            if (list1==null){
                //
                tmp=new ListNode(list2.val,tmp);
                list2=list2.next;
            }
            else if (list2==null){
                //
                tmp=new ListNode(list1.val,tmp);
                list1=list1.next;

            }
            else if (list1.val>=list2.val){
                //
                tmp=new ListNode(list2.val,tmp);
                list2=list2.next;

            }else {
                //
                tmp=new ListNode(list1.val,tmp);
                list1=list1.next;

            }
        }
        ListNode rstNode=null;
        while (tmp!=null && tmp.next!=null){
            rstNode=new ListNode(tmp.val,rstNode);
            tmp=tmp.next;
        }
        return rstNode;
    }
}
