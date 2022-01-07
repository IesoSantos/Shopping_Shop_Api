/**
 * 
 */
package com.ieso.shopping.repository;

import java.util.Date;
import java.util.List;

import com.ieso.shopping.dto.ShopReportDTO;
import com.ieso.shopping.model.Shop;

/**
 * @author Anderson dos Reis Santos
 *
 */
public interface ReportRepository {

	public List<Shop> getShopByFilters(
			Date dataInicio,
			Date dataFim,
			Float valorMinimo);
	
	public ShopReportDTO getReportDate(
			Date dataInicio,
			Date dataFim);
}
