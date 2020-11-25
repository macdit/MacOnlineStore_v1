package com.macdit.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.macdit.model.Item;

@Component
public class ItemServiceImpl implements ItemService {

	public ItemServiceImpl() {

		// Create an array list to hold all items
		items.add(new Item(1, "SchoolBag", "One of the best school bag in the Nation", 25.99));
		items.add(new Item(2, "TV", "This Samsung Smart TV works without power", 399.00));
		items.add(new Item(3, "Watch", "This Gold watch is capable of doing more than just a watch", 28.99));
		items.add(new Item(4, "XBox 360x", "A new gaming system ", 299.00));

	}

	// Create an arrayList to store all items
	List<Item> items = new ArrayList<Item>();

	// Get all items from the database
	@Override
	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		return items;
	}

	// Get specific item from the database
	@Override
	public Item getItem(int id) {

		// Get a list of item
		Iterator<Item> iterator = items.iterator();
		while (iterator.hasNext()) {
			Item item = iterator.next();
			if (item.getId() == id) {
				return item;
			}
		}
		return null;
	}

	// Add an item to the list
	@Override
	public void createItem(int id, String name, String desc, double price) {
		items.add(new Item(id, name, desc, price));

	}

	// Method to remove an item from the list
	@Override
	public boolean deleteItem(int id) {

		// iterate inside the list to find item at given index #
		for (Item i : items) {
			if (i.getId() == id) {
				items.remove(i);
				return true;
			}
		}
		return false;

	}

	// Method to update the list
	@Override
	public boolean updateItem(Item item, int targetId) {

		// iterate inside the list to find the item at given index #
		// if found, replace that raw with new item attributes
		for (Item i : items) {
			if (i.getId() == targetId) {
				// Replace raw with new values
				int id = item.getId(); 
				String name = item.getName();
				String desc = item.getDesc();
				double price = item.getPrice();
				
				i.setId(id);
				i.setName(name);
				i.setDesc(desc);
				i.setPrice(price);
				
				items.set(targetId, i);
				return true;
			}

		}
		return false;

	}
}
