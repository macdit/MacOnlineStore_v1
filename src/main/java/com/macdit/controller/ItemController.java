package com.macdit.controller;

import java.util.HashMap;

/* Get items 
 *  ItemController: specific for item related requests
 *  Receive all request with /item in their URLs use @ /item
 *   Make this class a RestController 
 *   All the URL with matching /item will be send to this controller
 *   for processing
 *  
 *  
 */

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.macdit.model.Item;
import com.macdit.service.ItemService;

// 1) Make this class a Rest Controller use @RestController
// 2) Receive all request with /item in their URL use @RequestMapping

@RestController
@RequestMapping("/item")
@Service
public class ItemController {

	@Autowired
	ItemService itemService;

	@GetMapping("")
	List<Item> getAllItems() {
		return itemService.getAllItems();
	}

	@GetMapping("/{id}")
	public Item getItem(@PathVariable("id") int id) {
		return itemService.getItem(id);
	}

	// Method to post map the request
	@PostMapping(value = "")
	public Map<String, Object> createItem(@RequestParam(value = "id") int id, @RequestParam(value = "name") String name,
			@RequestParam(value = "desc") String desc, @RequestParam(value = "price") double price) {
		itemService.createItem(id, name, desc, price);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Status", "A new item insertd");
		return map;
	}


	// Method to remove an item from the list
		
		public boolean deleteItem(List<Item> items, int id) {

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
		public boolean updateItem(List<Item> items, Item item, int targetId) {

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



