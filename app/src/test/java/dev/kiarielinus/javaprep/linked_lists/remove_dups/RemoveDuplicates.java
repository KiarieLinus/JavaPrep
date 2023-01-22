package dev.kiarielinus.javaprep.linked_lists.remove_dups;


import java.util.HashSet;
import java.util.LinkedList;

//Remove Dups! Write code to remove duplicates from an unsorted linked list.
//        FOLLOW UP
//        How would you solve this problem if a temporary buffer is not allowed?
public class RemoveDuplicates {
    static class LinkedListNode{
        int data;
        LinkedListNode next = null;

        public LinkedListNode(int data) {
            this.data = data;
        }

        void insertLast(int data){
            LinkedListNode end = new LinkedListNode(data);
            LinkedListNode n = this;
            while (n.next != null){
                n = n.next;
            }
            n.next = end;
        }
    }
    void deleteDups(LinkedListNode n){
        HashSet<Integer> set = new HashSet<>();
        LinkedListNode prev = null;

        while(n != null){
            if(set.contains(n.data)){
                prev.next = n.next;
            }else {
                set.add(n.data);
                prev = n;
            }
            n = n.next;
        }
    }
}
