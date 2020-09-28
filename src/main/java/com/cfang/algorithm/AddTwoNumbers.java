package com.cfang.algorithm;

import com.cfang.algorithm.common.ListNode;

/**
 * @author cfang 2020/9/28 13:43
 * @description
 */
public class AddTwoNumbers {

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode cur = node;
        if(null == l1) return l2;
        if(null == l2) return l1;
        int number = 0;
        while (null != l1 || null != l2 || number > 0){
            int v1 = null != l1 ? l1.val : 0;
            int v2 = null != l2 ? l2.val : 0;
            int sum =  v1 + v2 + number;
            ListNode newNode = new ListNode(sum % 10);
            cur.next = newNode;
            cur = newNode;
            number = sum / 10;

            if(null != l1) l1 = l1.next;
            if(null != l2) l2 = l2.next;
        }
        return node.next;
    }
}
