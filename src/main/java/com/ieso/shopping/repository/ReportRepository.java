/**
 * 
 */
package com.ieso.shopping.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ieso.shopping.dto.ShopReportDTO;
import com.ieso.shopping.model.Shop;

/**
 * @author Anderson dos Reis Santos
 *
 */
@Repository
public interface ReportRepository extends JpaRepository<Shop, Long>{

	public List<Shop> getShopByFilters(
			Date dataInicio,
			Date dataFim,
			Float valorMinimo);
	
	public ShopReportDTO getReportDate(
			Date dataInicio,
			Date dataFim);
}
