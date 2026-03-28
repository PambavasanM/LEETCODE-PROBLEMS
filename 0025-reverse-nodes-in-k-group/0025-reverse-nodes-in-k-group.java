class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int x = k;
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        ListNode temp = head;
        while(temp != null){
            ListNode[] arr = reverse(temp,k);
            ans.next = arr[0];
            temp = arr[1];
            while(ans.next != null){
                ans = ans.next;
            }
        }
        return dummy.next;
    }
    ListNode[] reverse(ListNode head, int k){
        ListNode prev = null;
        ListNode next = null;
        ListNode temp = head;
        while(k>0 && temp != null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            k--;
        }
        if(k >0){
            temp = prev;
            prev = null;
            while(temp != null){
                next = temp.next;
                temp.next = prev;
                prev = temp;
                temp = next;
            }
        }
        return new ListNode[] {prev,temp};
    }
}