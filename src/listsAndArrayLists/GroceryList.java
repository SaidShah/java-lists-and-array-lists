package listsAndArrayLists;

import java.util.ArrayList;

public class GroceryList {
	
	
	
	private ArrayList<String> groceryList = new ArrayList<>(); 
	
	public void addGroceryItem(String item) {
		groceryList.add(item.trim());// add item to array list
	}
	
	public void printList() {
		System.out.println("you have " + groceryList.size()+" items in your grocery list");
		for(int i =0; i <groceryList.size();i++) {
			System.out.println((i+1)+ ": "+groceryList.get(i));// prints the items on the array list
		}
	}
	
	public void modifyItem(String currentItem, String newItem) {// calls the modify grocery item 
		int position = findItem(currentItem);
		if(position>=0) {
			modifyGroceryItem(position,newItem);
		}
	}
	
	private void modifyGroceryItem(int position, String newItem) {// to modify a specific item in a specific part of the array list
		groceryList.set(position, newItem.trim());
		System.out.println("grocery Item "+(position+1)+" has been modified");
	}
	
	public void removeItem(String item) {
		int position = findItem(item);
		if(position>=0) {
			removeGroceryItem(position);
		}
		
	}
	
	private void removeGroceryItem(int position) {
		groceryList.remove(position);// to remove an item from a specific place on the arrayList
	}
	
	private int findItem(String item) {
		//boolean exists= groceryList.contains(item);// checks if the item is in the array list
		return groceryList.indexOf(item.trim());// find the item and returns the index position of the item or a -1 if it is not there
	
	}
	
	public boolean onFile(String searchItem) {
		int position = findItem(searchItem);
		if(position>=0) {
			return true;
		}
		
		return false;
	}

	public ArrayList<String> getGroceryList() {
		return groceryList;
	}
	
	
	
	
	

}
