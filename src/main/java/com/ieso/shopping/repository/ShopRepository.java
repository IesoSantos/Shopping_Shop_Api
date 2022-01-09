/**
 * 
 */
package com.ieso.shopping.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ieso.shopping.model.Shop;

/**
 * @author Anderson dos Reis Santos
 *
 */
@Repository
public interface ShopRepository extends JpaRepository<Shop, Long>{
	
	public List<Shop> findAllByUserIdentifier(String userIdentifier);
	
	public List<Shop> findAllByTotalGreaterThan(Float total);
	
	List<Shop> findAllByDateGreaterThanEquals(Date date);

}
