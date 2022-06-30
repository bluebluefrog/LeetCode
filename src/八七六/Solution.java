package 八七六;

public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {

        ListNode cur = head;

        int len=0;
        while (cur != null) {
            len++;
            cur = cur.next;
        }

        cur = head;
        int half = len / 2 + 1;
        for (int i = 1; i < half; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public static void main(String[] args) {

    }
}
