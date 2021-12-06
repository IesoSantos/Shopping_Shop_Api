/**
 * 
 */
package com.ieso.shopping.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.ieso.shopping.model.Item;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Anderson dos Reis Santos
 *
 */
@Getter
@Setter
public class ItemDTO {

	@NotBlank
	private String productIdentifier;
	@NotNull
	private float price;

	
	public static ItemDTO convert(Item item) {
		ItemDTO itemDTO = new ItemDTO();
		itemDTO.setProductIdentifier(item.getProductIdentifier());
		itemDTO.setPrice(item.getPrice());
		return itemDTO;
	}
}
