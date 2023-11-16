package org.example;

/**                             Feb 2022   oop-list-interface
 * "Program to an Interface, not to an implementation"
 *
 * Demonstrates a method display( List ) that uses a parameter of
 * interface type List as a reference to a list.  This reference can
 * be used as a reference to any object that implements the List interface.
 * The reference can be used to access the underlying concrete implementation,
 * (e.g. the ArrayList or LinkedList) but,
 * only through the methods defined by the List interface.
 *
 * The List interface creates an abstraction of the concrete data type,
 * presenting it as a List. The "List" is the Abstract Data Type (ADT),
 * and a List Interface can NOT be instantiated.
 *
 * Note that a List implies that the elements are in some order, and this
 * order is maintained unless the list is changed.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class App
{
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();  // 'concrete' implementation
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        display( list1 ); // pass a reference of type ArrayList

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        display( list2 );  // pass a reference of type LinkedList

        int sum = sumValues(list1);


        // 2DO (Part A)
        // Look up the Stack class in the Java API
        // Create a Stack data structure, push() four Integer values onto the stack.
        // Call the display() method to display the list of elements in the stack.

        // Note that the display() method will 'see' the stack object only
        // as a List, and can only perform List operations on the stack.
    }

    /**
     * "Program to an interface, not to an implementation"
     * We program this method using a reference of type List (Interface),
     * and thus we can use only the methods provided by the List interface.
     *
     * @param list - a reference to a List type object
     *               (i.e. an object that implements the List Interface)
     */
    public static void display( List<Integer> list )  // reference type is "List"
    {
        System.out.print("List: ");
        ListIterator<Integer> iterator = list.listIterator();
        while( iterator.hasNext()  ) {
            System.out.print(iterator.next()+","); // get next value, and move iterator forward
        }
        System.out.println("");
    }

    /**
     *
     * @param list - uses the interface type List as the parameter type
     *             - this will accept any list that implements the List interface
     *             - such as ArrayList and LinkedList
     * @return
     */
    public static int sumValues( List<Integer> list) {
        int sum = 0;
        for( Integer val : list)
            sum = sum + val;

        return sum;
    }
}
