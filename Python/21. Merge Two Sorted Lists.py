# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        pointer = ListNode(0)
        head = pointer
        while l1 != None and l2 != None:
            if l1.val < l2.val:
                pointer.next = l1
                pointer = pointer.next
                l1 = l1.next
            else:
                pointer.next = l2
                pointer = pointer.next
                l2 = l2.next
        if l2 != None:
            pointer.next = l2
        if l1 != None:
            pointer.next = l1
        return head.next
            
        
                
                
思路：新建一个node，和一个pointer指向这个node的head,比较l1, l2，把较小的往上添加。最后返回这个head.next
