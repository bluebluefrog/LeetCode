package 二十一;

class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        ListNode startNode = new ListNode(-1);

        ListNode cur = startNode;
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                cur.next = new ListNode(list2.val);
                list2 = list2.next;
            }else{
                cur.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            cur = cur.next;
        }

        return startNode;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
    }
}
