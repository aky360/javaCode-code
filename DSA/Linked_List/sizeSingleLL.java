public static int listSize(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
