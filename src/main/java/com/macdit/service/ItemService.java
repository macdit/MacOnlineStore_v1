package com.macdit.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.macdit.model.Item;

// Hosts all interfaces
@Component
public interface ItemService {

	// Interfaces to all CRUD generic operations
	// CRUD (Create, Read, Update, Delete)
	// 1) Create/add a new Item
	// 2) Read/retrieve all items
	// 3) Read/retrieve specific item by given id
	// 4) update/modify existing item record using provided id
	// 5) Delete/remove existing record using id

	// Interfaces to do CRUD operations
	/*
	 * 1. GET – To retrieve a resource from the server 
	 * 2. POST – To create a resource on the server
	 * 3. PUT – To change the state or to update a resource
	 *  4. DELETE – To remove or delete a resource from the server
	 */

	// Return a list of item
	// Get all items
	List<Item> getAllItems();

	// Get specific item by Id
	Item getItem(int id);

	// Add a new item to the database
	void createItem(int id, String name, String desc, double price); // Return void

	// Update item
	boolean updateItem(Item item, int targetId);

	// Delete item
	boolean deleteItem(int id);

}
