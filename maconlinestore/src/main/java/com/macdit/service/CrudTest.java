package com.macdit.service;



import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.macdit.model.Item;


public class CrudTest {
	public static void main(String[] args) {
		
		
		  List<Item> items = new ArrayList<Item>();
		  
		// Create instance of ItemServiceImpl object to test its methods
		ItemServiceImpl itemImpl = new ItemServiceImpl();
		
		
		// Create an array list to hold all items
		items.add(new Item(1, "SchoolBag", "One of the best school bag in the Nation", 25.99));
		items.add(new Item(2, "TV", "This Samsung Smart TV works without power", 399.00));
		items.add(new Item(3, "Watch", "This Gold watch is capable of doing more than just a watch", 28.99));
		items.add(new Item(4, "XBox 360x", "A new gaming system ", 299.00));
		
		// 1) Get all items in the database or list
	   List<Item> myList = itemImpl.getAllItems();
	   // display/print the current list
	   for(Item item: myList) {
		   System.out.println(item);
	   }
	   
	   
	   //1.2) Get specific item by its id, get item at index 3
	   Item targetItem = itemImpl.getItem(3);
	   System.out.println("\n\nThe item at index # 3 is: " +targetItem );
	   
	   // 3) Add an item to the list/database
	   itemImpl.createItem(7, "Desktop Dell", "Dell Fire 370", 783.99);
	   // Display the current inventory
	   System.out.println("\n\nThe current inventory after adding Dell Fire is:  ");
	   for(Item item: myList) {
		   System.out.println(item);
	   }
	   
	   // 4) Update existing record in the list
	   Item newItem = new Item(8, "Tires", "Winter Tires", 99.99);
	   
	   // 
	   itemImpl.updateItem(newItem, 2);
	   // Display the current inventory
	   System.out.println("\n\nThe current inventory after updating item at indext 2:  ");
	   for(Item item: myList) {
		   System.out.println(item);
	   }
      
	   
	   
	   
	   // 5) Delete item at index 4
	      itemImpl.deleteItem(4);
	      // Display the current inventory
		   System.out.println("\n\nThe current inventory after removing item at index 4:  ");
		   for(Item item: myList) {
			   System.out.println(item);
		   }
	      
	   
	   
	   
			//Logger logger = Logger.getLogger(CrudTest.class);
			//logger.debug("Logger Works! (Log4j 1)");
		

	}

}
