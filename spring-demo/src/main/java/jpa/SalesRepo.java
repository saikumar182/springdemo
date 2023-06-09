package jpa;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SalesRepo extends JpaRepository<Sales, Integer>{

	//List<Sales>findByProduct(int id);
	//List<Sales>findByQty(int min ,int max);

	@Query("FROM  Sale  quantity order by quantity asc")
	List<Sales> ascendingOrderOfQuantity();
}