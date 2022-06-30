package 一四二;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

//    public ListNode detectCycle(ListNode head) {
//        HashSet hashSet = new HashSet();
//
//        ListNode cur = head;
//        while (cur != null) {
//            if (hashSet.contains(cur)) {
//                return cur;
//            } else {
//                hashSet.add(cur);
//                cur = cur.next;
//            }
//        }
//
//        return null;
//    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (true) {
            if (fast == null||fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }

}
