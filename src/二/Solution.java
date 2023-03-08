package 二;

import java.awt.*;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Long integer1 = listNodeToNumber(l1);
        Long integer2 = listNodeToNumber(l2);

        System.out.println(integer1);
        System.out.println(integer2);

        Long num = integer1 + integer2;

        return numberToListNode(num);
    }

    private Long listNodeToNumber(ListNode l){

        String num = "";


        while (l!=null){
            num += l.val;
            l = l.next;
        }

        return Long.parseLong(new StringBuffer(num).reverse().toString());
    }

    private ListNode numberToListNode(Long num){

        ListNode listNode = new ListNode();

        char[] chars=String.valueOf(num).toCharArray();
        for (int j = 0; j < chars.length; j++) {

            listNode.val = Character.getNumericValue(chars[j]);

            if(j!=chars.length-1){
                ListNode pre = new ListNode();
                pre.next = listNode;
                listNode = pre;
            }
        }

        return listNode;
    }

}

