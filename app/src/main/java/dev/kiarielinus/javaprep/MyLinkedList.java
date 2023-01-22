package dev.kiarielinus.javaprep;

public class MyLinkedList {
    	Node head; // head of list

    	// Linked list Node.
    	// Node is a static nested class
    	// so main() can access it
    	static class Node {

    		int data;
    		Node next;

    		// Constructor
    		Node(int d)
    		{
    			data = d;
    			next = null;
    		}
    	}

    	// **************INSERTION**************

    	// Method to insert a new node
    	public static void insert(MyLinkedList list,
                                  int data)
    	{
    		// Create a new node with given data
    		Node new_node = new Node(data);
    		new_node.next = null;

    		// If the Linked List is empty,
    		// then make the new node as head
    		if (list.head == null) {
    			list.head = new_node;
    		}
    		else {
    			// Else traverse till the last node
    			// and insert the new_node there
    			Node last = list.head;
    			while (last.next != null) {
    				last = last.next;
    			}

    			// Insert the new_node at last node
    			last.next = new_node;
    		}

    		// Return the list by head
        }

    	// **************TRAVERSAL**************

    	// Method to print the LinkedList.
    	public static void printList(MyLinkedList list)
    	{
    		Node currNode = list.head;

    		System.out.print("\nMyLinkedList: ");

    		// Traverse through the LinkedList
    		while (currNode != null) {
    			// Print the data at current node
                String pointer = "";
                if(currNode.next != null){pointer = "->";}
    			System.out.print(currNode.data + pointer);

    			// Go to next node
    			currNode = currNode.next;
    		}
    		System.out.println("\n");
    	}

    	// **************DELETION BY KEY**************

    	// Method to delete a node in the LinkedList by KEY
    	public static void deleteByKey(MyLinkedList list,
                                       int key)
    	{
    		// Store head node
    		Node currNode = list.head, prev = null;

    		//
    		// CASE 1:
    		// If head node itself holds the key to be deleted

    		if (currNode != null && currNode.data == key) {
    			list.head = currNode.next; // Changed head

    			// Display the message
    			System.out.println(key + " found and deleted");

    			// Return the updated List
    			return;
    		}

    		//
    		// CASE 2:
    		// If the key is somewhere other than at head
    		//

    		// Search for the key to be deleted,
    		// keep track of the previous node
    		// as it is needed to change currNode.next
    		while (currNode != null && currNode.data != key) {
    			// If currNode does not hold key
    			// continue to next node
    			prev = currNode;
    			currNode = currNode.next;
    		}

    		// If the key was present, it should be at currNode
    		// Therefore the currNode shall not be null
    		if (currNode != null) {
    			// Since the key is at currNode
    			// Unlink currNode from linked list
    			prev.next = currNode.next;

    			// Display the message
    			System.out.println(key + " found and deleted");
    		}

    		//
    		// CASE 3: The key is not present
    		//

    		// If key was not present in linked list
    		// currNode should be null
    		if (currNode == null) {
    			// Display the message
    			System.out.println(key + " not found");
    		}

    		// return the List
        }

    	// **************DELETION AT A POSITION**************

    	// Method to delete a node in the LinkedList by POSITION
    	public static void deleteAtPosition(MyLinkedList list, int index)
    	{
    		// Store head node
    		Node currNode = list.head, prev = null;

    		//
    		// CASE 1:
    		// If index is 0, then head node itself is to be
    		// deleted

    		if (index == 0 && currNode != null) {
    			list.head = currNode.next; // Changed head

    			// Display the message
    			System.out.println(
    				index + " position element deleted");

    			// Return the updated List
    			return;
    		}

    		//
    		// CASE 2:
    		// If the index is greater than 0 but less than the
    		// size of LinkedList
    		//
    		// The counter
    		int counter = 0;

    		// Count for the index to be deleted,
    		// keep track of the previous node
    		// as it is needed to change currNode.next
    		while (currNode != null) {

    			if (counter == index) {
    				// Since the currNode is the required
    				// position Unlink currNode from linked list
    				prev.next = currNode.next;

    				// Display the message
    				System.out.println(
    					index + " position element deleted");
    				break;
    			}
    			else {
    				// If current position is not the index
    				// continue to next node
    				prev = currNode;
    				currNode = currNode.next;
    				counter++;
    			}
    		}

    		// If the position element was found, it should be
    		// at currNode Therefore the currNode shall not be
    		// null
    		//
    		// CASE 3: The index is greater than the size of the
    		// MyLinkedList
    		//
    		// In this case, the currNode should be null
    		if (currNode == null) {
    			// Display the message
    			System.out.println(
    				index + " position element not found");
    		}

    		// return the List
        }



    	// **************MAIN METHOD**************

    	// method to create a Singly linked list with n nodes
    	public static void main(String[] args)
    	{
    		/* Start with the empty list. */
    		MyLinkedList list = new MyLinkedList();

    		//
    		// ******INSERTION******
    		//

    		// Insert the values
            insert(list, 1);
            insert(list, 2);
            insert(list, 3);
            insert(list, 4);
            insert(list, 5);
            insert(list, 6);
            insert(list, 7);
            insert(list, 8);

            // Print the LinkedList
    		printList(list);

    		//
    		// ******DELETION BY KEY******
    		//

    		// Delete node with value 1
    		// In this case the key is ***at head***
    		deleteByKey(list, 1);

    		// Print the LinkedList
    		printList(list);

    		// Delete node with value 4
    		// In this case the key is present ***in the
    		// middle***
    		deleteByKey(list, 4);

    		// Print the LinkedList
    		printList(list);

    		// Delete node with value 10
    		// In this case the key is ***not present***
    		deleteByKey(list, 10);

    		// Print the LinkedList
    		printList(list);

    		//
    		// ******DELETION AT POSITION******
    		//

    		// Delete node at position 0
    		// In this case the key is ***at head***
    		deleteAtPosition(list, 0);

    		// Print the LinkedList
    		printList(list);

    		// Delete node at position 2
    		// In this case the key is present ***in the
    		// middle***
    		deleteAtPosition(list, 2);

    		// Print the LinkedList
    		printList(list);

    		// Delete node at position 10
    		// In this case the key is ***not present***
    		deleteAtPosition(list, 10);

    		// Print the MyLinkedList
    		printList(list);
    	}

}
