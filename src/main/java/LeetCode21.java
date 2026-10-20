// LEETCODE 21 - MERGE TWO SORTED SINGLY-LINKED LISTS
// GIVEN THE HEADS OF TWO SINGLY-LINKED LISTS, list1 AND list2
// MERGE THE TWO LISTS INTO ONE SORTED LIST. THE LIST SHOULD BE MADE BY SPLICING TOGETHER THE NODES OF THE FIRST TWO LISTS

// NOTE -- THIS IS UNFINISHED AND A CONCEPT I NEED TO DOUBLE BACK DOWN ON. AS SUCH, I AM PUSHING IT, BUT IT IS INCOMPLETE.

public class LeetCode21 {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        return dummy.next;
    }
}
