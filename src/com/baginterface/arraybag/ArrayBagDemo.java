package com.baginterface.arraybag;
import com.baginterface.*;
/** 
    A test of the methods isEmpty, getCurrentSize, getFrequencyOf, and contains 
    for the class ArrayBag2.
    Assumes the methods add and toArray are correct.
    @author Frank M. Carrano, Timothy M. Henry
    @version 5.0
*/
public class ArrayBagDemo
{
	public static void main(String[] args) 
	{
		String[] maxContents = {"H","E","L","L","O","!"};
		BagInterface<String> aBag = new LinkedBag<>(maxContents.length);
		
		// test on empty bag
		System.out.println("\n---------- Test on Emtpy -----------");
		testIsEmpty(aBag, true);
		
		String[] initContents = {"H","E","L","L","O"};
		System.out.println("\n---------- Test on Add -----------");
		testAdd(aBag,initContents);
		testIsEmpty(aBag,false);
		
		System.out.println("\n---------- Test on Remove -----------");
		String[] strToRemove = {"H", "o"};
		testRemove(aBag,strToRemove);
		displayBag(aBag);
		
		aBag.clear();
		displayBag(aBag);
		if(aBag.isEmpty()) {
			System.out.println("The Bag is empty");
		}
      
	} // end main
	
   // Tests the method add.
   private static void testAdd(BagInterface<String> aBag, String[] content)
   {
      System.out.print("Adding the following strings to the bag: ");
      for (int index = 0; index < content.length; index++)
      {
         if (aBag.add(content[index]))
            System.out.print(content[index] + " ");
         else
            System.out.print("\nUnable to add " + content[index] +
                             " to the bag.");
      } // end for
      System.out.println();
      
      displayBag(aBag);
   } // end testAdd
   
   // Tests the two remove methods.
   private static void testRemove(BagInterface<String> aBag, String[] tests)
   {
      System.out.println("\nTesting the two remove methods:");
      for (int index = 0; index < tests.length; index++)
      {
         String aString = tests[index];
         if (aString.equals("") || (aString == null))
         {
            // test remove()
            System.out.println("\nRemoving a string from the bag:");
            String removedString = aBag.remove();
            System.out.println("remove() returns " + removedString);
         }
         else
         {
            // Test remove(aString)
            System.out.println("\nRemoving \"" + aString + "\" from the bag:");
            boolean result = aBag.remove(aString);
            System.out.println("remove(\"" + aString + "\") returns " + result);
         } // end if
         
         displayBag(aBag);
      } // end for
   } // end testRemove

   // Tests the method isEmpty.
   // correctResult indicates what isEmpty should return.   
	private static void testIsEmpty(BagInterface<String> aBag, boolean correctResult)
	{
      System.out.print("Testing isEmpty with ");
      if (correctResult)
         System.out.println("an empty bag:");
      else
         System.out.println("a bag that is not empty:");
      
      System.out.print("isEmpty finds the bag ");
      if (correctResult && aBag.isEmpty())
			System.out.println("empty: OK.");
		else if (correctResult)
			System.out.println("not empty, but it is empty: ERROR.");
		else if (!correctResult && aBag.isEmpty())
			System.out.println("empty, but it is not empty: ERROR.");
		else
			System.out.println("not empty: OK.");      
		System.out.println();
	} // end testIsEmpty

   // Tests the method getFrequencyOf.
	private static void testFrequency(BagInterface<String> aBag, String[] tests)
	{
 		System.out.println("\nTesting the method getFrequencyOf:");
      for (int index = 0; index < tests.length; index++)
      {
         String aString = tests[index];
         if (!aString.equals("") && (aString != null))
         {
            System.out.println("In this bag, the count of " + tests[index] +
                               " is " + aBag.getFrequencyOf(tests[index]));
         } // end if
      } // end for
   } // end testFrequency
   
   // Tests the method contains.
	private static void testContains(BagInterface<String> aBag, String[] tests)
	{
 		System.out.println("\nTesting the method contains:");
      for (int index = 0; index < tests.length; index++)
      {
         String aString = tests[index];
         if (!aString.equals("") && (aString != null))
         {
            System.out.println("Does this bag contain " + tests[index] + 
                               "? " + aBag.contains(tests[index]));
         } // end if
      } // end for
   } // end testContains

   // Tests the method toArray while displaying the bag.
	private static void displayBag(BagInterface<String> aBag)
	{
		System.out.println("The bag contains " + aBag.getCurrentSize() +
		                   " string(s), as follows:");		
		Object[] bagArray = aBag.toArray();
		for (int index = 0; index < bagArray.length; index++)
		{
			System.out.print(bagArray[index] + " ");
		} // end for
		
		System.out.println();
	} // end displayBag
} // end ArrayBagDemo


