package com.devsuperior.dsmeta.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dsmeta.entities.Sales;

public interface SaleRepository extends JpaRepository<Sales, Long> {
	
}
