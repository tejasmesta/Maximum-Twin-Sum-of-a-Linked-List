class Solution {
    public int pairSum(ListNode head) {
        int ans = Integer.MIN_VALUE;
        
        if(head==null)
        {
            return 0;
        }
        
        ListNode s = head;
        ListNode f = head;
        
        while(f!=null && f.next!=null)
        {
            s = s.next;
            f = f.next.next;
        }
        
        ListNode temp = null;
        
        if(f==null)
        {
            temp = reverse(s);
        }
        else{
            temp = reverse(s.next);
        }
        
        ListNode cur = head;
        
        while(temp!=null)
        {
            ans = Math.max(ans,cur.val+temp.val);
            cur = cur.next;
            temp = temp.next;
        }
        
        return ans;
    }
    
    ListNode reverse(ListNode head)
    {
        ListNode cur = head;
        ListNode prev = null;
        
        while(cur!=null)
        {
            ListNode forw = cur.next;
            cur.next = prev;
            prev = cur;
            cur = forw;
        }  
        
        return prev;
    }
}
