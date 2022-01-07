/**
 * 
 */
package com.ieso.shopping.repository;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.ieso.shopping.dto.ShopReportDTO;
import com.ieso.shopping.model.Shop;

/**
 * @author Anderson dos Reis Santos
 *
 */
public class ReportRepositoryImpl implements ReportRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Shop> getShopByFilters(Date dataInicio, Date dataFim, Float valorMinimo) {
		StringBuilder sb = new StringBuilder();
		sb.append("select s ");
		sb.append("from shop s ");
		sb.append("where s.date >= :dataInicio ");
		
		if(dataFim != null)
			sb.append("and s.date <= :dataFim ");
		
		if(valorMinimo != null)
			sb.append("and s.total <= :valorMinimo ");
		
		Query query = entityManager.createQuery(sb.toString());
		query.setParameter("dataInicio", dataInicio);
		
		if(dataFim != null)
			query.setParameter("dataFim", dataFim);
		
		if(valorMinimo != null)
			query.setParameter("valorMinimo", valorMinimo);
		
		return query.getResultList();
	}

	@Override
	public ShopReportDTO getReportDate(Date dataInicio, Date dataFim) {
		StringBuilder sb = new StringBuilder();
		sb.append("select count(sp.id), sum(sp.total), avg(sp.total) ");
		sb.append("from shopping.shop sp ");
		sb.append("where sp.date >= :dataInicio ");
		sb.append("and sp.date <= :dataFim ");
		
		Query query = entityManager.createNativeQuery(sb.toString());
		query.setParameter("dataInicio", dataInicio);
		query.setParameter("dataFim", dataFim);
		
		Object[] result = (Object[]) query.getSingleResult();
		ShopReportDTO shopReportDTO = new ShopReportDTO();
		shopReportDTO.setCount(((BigInteger) result[0]).intValue());
		shopReportDTO.setTotal((Double) result[1]);
		shopReportDTO.setMean((Double) result[2]);
		return shopReportDTO;
	}

	@Override
	public List<Shop> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Shop> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Shop> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Shop> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Shop> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Shop> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Shop> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Shop getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shop getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Shop> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Shop> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Shop> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Shop> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Shop> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Shop entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Shop> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Shop> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Shop> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Shop> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Shop> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Shop, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
