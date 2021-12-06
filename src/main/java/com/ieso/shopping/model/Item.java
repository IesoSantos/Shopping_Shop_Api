/**
 * 
 */
package com.ieso.shopping.model;

import javax.persistence.Embeddable;

import com.ieso.shopping.dto.ItemDTO;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Anderson dos Reis Santos
 *
 */
@Getter
@Setter
@Embeddable
public class Item {
	
	private String productIdentifier;
	private float price;
	
	public static Item convert(ItemDTO itemDTO) {
		Item item = new Item();
		item.setProductIdentifier(itemDTO.getProductIdentifier());
		item.setPrice(itemDTO.getPrice());
		return item;
	}

}
