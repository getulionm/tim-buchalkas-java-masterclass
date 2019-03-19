package abstraction.challenge;

/*
Create an abstract class to define items that can be stored in a list.
The class should contain 2 references to items which will represent the next and previous items
(in the case of a linked list).
I.e., if you call your abstract class ListItem, then it would have 2 member variables of type LisItem
that will hold references to the next/right and previous/left ListItems.

The abstract class wil also need to hold a value - try to be as flexible as possible when defining the
type of this value.

The class will also need methods to move to the next item and back to the previous item, and methods
to set the next and previous items.

You should also specify a compareTo() method that takes a parameter of the same type as the class and returns 0 if
the values are equal, greater than zero if the value sorts greater than the parameter and less than zero if it sorts
less than the parameter.

Create a concrete class from your abstract list item class and use this in a LinkedList class to implement a linked
list that will add items in order (so that they are sorted alphabetically). Duplicate values are not added.

Note that you are creating your own LinkedList class here, not using the built-in Java one..

The rules for adding an item to the linked list are:
    If the head of the list is null, make the head refer to the item to be added.
    If the item to be added is less than the current item in the list, add the item before the current item
     (i.e., make the previous item's "next" refer to the new item, and the new item's "next" refer to the current item).
    If the item to be added is greater than the current item, move onto the enxt item and compare again (if there is no
     next item then that is where the new item belongs).

Care will be needed when inserting before the first item in the list (as it will not have a previous item).

You will also need a method to remove an item from the list.

Hint: If you are creating classes with names such as List, LinkedList, Node etc, make sure that you create your classes
before referring to them.

Optional: create a class to use your concrete class to implement a Binary Search Tree:
When adding items to a Binary Search Tree, if the item to be added is less than the current item then move to the left,
if it is greater than the current item then move to the right.

The new item is added when an attempt to move in the required direction would involve following a null reference.
Duplicate values are not added.

Hint: To avoid typing loads of "addItem" lines, split a string into an array and create your list in a loop as in the
example below.
*/

public class Main {

    public static void main(String[] args) {

//        MyLinkedList list = new MyLinkedList(null);          // MyLinkedList


        SearchTree tree = new SearchTree(null);          // SearchTree


        tree.traverse(tree.getRoot());
//        Create a string data array to avoid typiung loads of addItem instructions

        String stringData = "5 7 3 9 8 2 1 0 4 6";
//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s : data ){
            // create new item with value set to the string s
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());

//        tree.traverse(tree.getRoot());                        // MyLinkedList
//        tree.removeItem(new Node("3"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(new Node("5"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(new Node("0"));
//        tree.removeItem(new Node("4"));
//        tree.removeItem(new Node("2"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(new Node("9"));
//        tree.traverse(tree.getRoot());
//        tree.removeItem(new Node("8"));
//        tree.traverse(tree.getRoot());
//        tree.removeItem(new Node("6"));
//        tree.traverse(tree.getRoot());
//
//        tree.removeItem(new Node(tree.getRoot()));
//        tree.traverse(tree.getRoot());
//        tree.removeItem(new Node(tree.getRoot()));
//        tree.traverse(tree.getRoot());

    }

}





























