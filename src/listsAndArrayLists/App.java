package listsAndArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	public static Scanner input = new Scanner(System.in);
	public static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		
		
		
		 
		 boolean 	quit = false;
		 int choice =0;
		 printInstructions();
		 while(!quit) {
			 System.out.println("enter your choice ");
			 choice = input.nextInt();
			 input.nextLine();
			 
			 switch(choice) {
			 case 0:
				 printInstructions();
				 break;
			 case 1: 
				 groceryList.printList();
				 break;
			 case 2: 
				 addItem();
				 break;
			 case 3: 
				 modifyItem();
				 break;
			 case 4:
				 removeItem();
				 break;
			 case 5:
				 searchForItem();
				 break;
			 case 6:
				 searchForItem();
				 break;
			 case 7:
				 quit = true;
				 break;
			 
			 
			 }
		 }
		
	}
	
	private static void printInstructions() {
		System.out.println("\n Press");
		System.out.println("\t 0 - To print choice options ");
		System.out.println("\t 1 - To print the list of grocery items ");
		System.out.println("\t 2 - To add an item to the list ");
		System.out.println("\t 3 - To modify an item on the list ");
		System.out.println("\t 4 - To remove an item from the list ");
		System.out.println("\t 5 - To search for an item on the list ");
		System.out.println("\t 6 - To to quit the program ");
	}
	
	public static void addItem() {// to add an item 
		System.out.print("please enter the grocery item: ");
		groceryList.addGroceryItem(input.nextLine().trim());
	}
	
	public static void modifyItem() {// to remove or replace an item
		System.out.print("enter item name: ");
		String itemNo = input.nextLine();
		System.out.print("enter replacement for the item: ");
		String newItem = input.nextLine().trim();
		groceryList.modifyItem(itemNo.trim(), newItem.trim());
	}
	
	public static void removeItem() {// remove an item
		System.out.print("Please enter the item name: ");
		String itemNo = input.nextLine();
		groceryList.removeItem(itemNo.trim());
	}
	
	public static void searchForItem() {// look for an item on the list
		System.out.println("Enter an item to search For: ");
		String searchItem = input.nextLine().trim();
		if(groceryList.onFile(searchItem)) {
			System.out.print("Found: "+ searchItem+ " on our list\n");
		}else {
			System.out.print(searchItem+" is not on the list\n");
		}
	}
	
	public static void processArrayList() {
		ArrayList<String> newArray = new ArrayList<String>();// creates a new array list and copies the array list to it
		newArray.addAll(groceryList.getGroceryList());
		
		ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());// creates a new arrayList and copies all the data
		
		String[] myArray= new String[groceryList.getGroceryList().size()];// creating an array
		myArray = groceryList.getGroceryList().toArray(myArray);// converting the array list to an array that we created
	}

}







































