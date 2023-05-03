package com.main;

import java.util.Scanner;

import com.baginterface.BagInterface;
import com.baginterface.arraybag.ArrayBagDemo;
import com.baginterface.linkedbag.LinkedBagDemo;


/**
 * @author sarifb
 *
 */
public class ArrayAndLinkedBagMain {

	/**
	 * Main method of the bagsq		
	 * @param args
	 */
	public static void main(String[] args) {
		

		System.out.println("*****************************************"
				+ "*************************************\n");
		System.out.println("Implementing ArrayBag from here onwards ->");
		System.out.println("-------------------------------------"
				+ "-------------------------------------");
		ArrayBagDemo.main(args);
		System.out.println("\n\n*****************************************"
				+ "*************************************\n\n");
		
		
		
		System.out.println("*****************************************"
				+ "*************************************\n");
		System.out.println("Implementing LinkedBag from here onwards ->");
		System.out.println("-------------------------------------"
				+ "-------------------------------------");
		LinkedBagDemo.main(args);
		System.out.println("\n\n*****************************************"
				+ "*************************************\n\n");
		


	}

}
