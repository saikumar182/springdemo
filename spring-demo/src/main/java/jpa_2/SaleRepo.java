package jpa_2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SaleRepo extends JpaRepository<Sale, Integer> {
	
	@Query("FROM Sale WHERE quantity  between : minquantity and :maxquantity")
	
	List<Sale> getQuantityBetween(@Param("minquantity") int minquantity, @Param("maxquantity") int maxquantity);
	
	
	//@Query("FROM  Sale  quantity order by quantity asc")
	//List<Sale> ascendingOrderOfQuantity();


}