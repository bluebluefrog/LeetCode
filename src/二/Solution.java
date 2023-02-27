package 二;

import java.awt.*;

public class Solution {

    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            Integer integer1 = listNodeToNumber(l1);
            Integer integer2 = listNodeToNumber(l2);

            int num = integer1 + integer2;
            numberToListNode(num);

        }

        private Integer listNodeToNumber(ListNode l){


        return 0;
        }

        private ListNode numberToListNode(Integer num){

            ListNode listNode = new ListNode();


            return listNode;
        }

}
