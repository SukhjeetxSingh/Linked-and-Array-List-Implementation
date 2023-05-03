package com.baginterface.linkedbag;

import com.baginterface.BagInterface;

public class LinkedBagDemo {

	public static void main(String[] args) {
	
		String[] maxContents = {"H","E","L","L","O","!"};
		LinkedBag<String> lBag = new LinkedBag<>();
		
		// test on empty bag
		System.out.println("\n---------- Test on Emtpy -----------");
		if(lBag.isEmpty() ==  true) {
			System.out.println("isEmpty finds the bag empty: OK");
		}
		
		String[] initContents = {"H","E","L","L","O"};
		System.out.println("\n---------- Test on Add -----------");
		testAdd(lBag, initContents);
		if(lBag.isEmpty() ==  false) {
			System.out.println("isEmpty finds the bag is NOT empty: OK");
		}
		
		System.out.println("\n---------- Test on Remove -----------");
		String[] strToRemove = {"H", "E", "e"};
		testRemove(lBag,strToRemove);
		displayBag(lBag);
		
		System.out.println("\n---------- Clearing the linkedBag -----------");
		lBag.clear();
		displayBag(lBag);
		if(lBag.isEmpty()) {
			System.out.println("The Bag is empty");
		}
	} // end main
	
   // Tests the method add.
   private static void testAdd(LinkedBag<String> lBag, String[] content)
   {
      System.out.print("Adding the following strings to the bag: ");
      for (int index = 0; index < content.length; index++)
      {
         if (lBag.add(content[index]))
            System.out.print(content[index] + " ");
         else
            System.out.print("\nUnable to add " + content[index] +
                             " to the bag.");
      } // end for
      System.out.println();
      
      displayBag(lBag);
   } // end testAdd
   
   // Tests the two remove methods.
   private static void testRemove(BagInterface<String> lBag, String[] tests)
   {
      System.out.println("\nTesting the two remove methods:");
      for (int index = 0; index < tests.length; index++)
      {
         String aString = tests[index];
         if (aString.equals("") || (aString == null))
         {
            // test remove()
            System.out.println("\nRemoving a string from the bag:");
            String removedString = lBag.remove();
            System.out.println("remove() returns " + removedString);
         }
         else
         {
            // Test remove(aString)
            System.out.println("\nRemoving \"" + aString + "\" from the bag:");
            boolean result = lBag.remove(aString);
            System.out.println("remove(\"" + aString + "\") returns " + result);
         } // end if
         
         displayBag(lBag);
      } // end for
   } // end testRemove

   // Tests the method isEmpty.
   // correctResult indicates what isEmpty should return.   
	private static void testIsEmpty(BagInterface<String> lBag, boolean correctResult)
	{
      System.out.print("Testing isEmpty with ");
      if (correctResult)
         System.out.println("an empty bag:");
      else
         System.out.println("linkedBag that is not empty:");
      
      System.out.print("isEmpty finds the bag ");
      if (correctResult && lBag.isEmpty())
			System.out.println("empty: OK.");
		else if (correctResult)
			System.out.println("not empty, but it is empty: ERROR.");
		else if (!correctResult && lBag.isEmpty())
			System.out.println("empty, but it is not empty: ERROR.");
		else
			System.out.println("not empty: OK.");      
		System.out.println();
	} // end testIsEmpty

   // Tests the method getFrequencyOf.
	private static void testFrequency(BagInterface<String> lBag, String[] tests)
	{
 		System.out.println("\nTesting the method getFrequencyOf:");
      for (int index = 0; index < tests.length; index++)
      {
         String aString = tests[index];
         if (!aString.equals("") && (aString != null))
         {
            System.out.println("In this Linked bag, the count of " + tests[index] +
                               " is " + lBag.getFrequencyOf(tests[index]));
         } // end if
      } // end for
   } // end testFrequency
   
   // Tests the method contains.
	private static void testContains(BagInterface<String> lBag, String[] tests)
	{
 		System.out.println("\nTesting the method contains:");
      for (int index = 0; index < tests.length; index++)
      {
         String aString = tests[index];
         if (!aString.equals("") && (aString != null))
         {
            System.out.println("Does this Linked bag contain " + tests[index] + 
                               "? " + lBag.contains(tests[index]));
         } // end if
      } // end for
   } // end testContains

   // Tests the method toArray while displaying the bag.
	private static void displayBag(BagInterface<String> lBag)
	{
		System.out.println("The Linked bag contains " + lBag.getCurrentSize() +
		                   " string(s), as follows:");		
		Object[] bagArray = lBag.toArray();
		for (int index = 0; index < bagArray.length; index++)
		{
			System.out.print(bagArray[index] + " ");
		} // end for
		
		System.out.println();
	} // end displayBag
} // end ArrayBagDemo