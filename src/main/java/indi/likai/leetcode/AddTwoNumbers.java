package indi.likai.leetcode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers atn=new AddTwoNumbers();
        ListNode l1=new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode l2=new ListNode(5,new ListNode(6,new ListNode(4)));
        atn.addTwoNumbers(l1,l2);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode sumNode=null,rst=null;
        int carry=0;
        while(l1!=null || l2!=null ||carry ==1){
            int sum= (l1==null?0:l1.val )+ (l2==null?0:l2.val) + carry;
            carry=sum/10;
            sum=sum%10;
            sumNode=new ListNode(sum,sumNode);
            l1=l1==null?null:l1.next;
            l2=l2==null?null:l2.next;
        }
        while(sumNode!=null){
            rst=new ListNode(sumNode.val,rst);
            sumNode=sumNode.next;
        }

        return rst;
    }
}

