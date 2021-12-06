/**
 * 
 */
package com.ieso.shopping.dto;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.ieso.shopping.model.Shop;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Anderson dos Reis Santos
 *
 */
@Getter
@Setter
public class ShopDTO {
	
	@NotBlank
	private String userIdentifier;
	@NotNull
	private float total;
	@NotNull
	private Date date;
	@NotNull
	private List<ItemDTO> items;
	
	public static ShopDTO convert(Shop shop) {
		ShopDTO shopDTO = new ShopDTO();
		shopDTO.setUserIdentifier(shop.getUserIdentifier());
		shopDTO.setTotal(shop.getTotal());
		shopDTO.setDate(shop.getDate());
		return shopDTO;
	}

}
