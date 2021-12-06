/**
 * 
 */
package com.ieso.shopping.dto;

import java.util.Date;
import java.util.List;


import lombok.Getter;
import lombok.Setter;

/**
 * @author Anderson dos Reis Santos
 *
 */
@Getter
@Setter
public class ShopDTO {
	
	private String userIdentifier;
	private float total;
	private Date date;
	private List<ItemDTO> items;

}
