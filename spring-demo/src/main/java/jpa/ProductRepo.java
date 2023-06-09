package jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProductRepo extends CrudRepository<Product,Integer> {
	
	
//	("from product where price between :minlen and :maxlen order by name")
//	List<Product>getLongProducts(@Param("minlen")double minlen,@Param("maxlen")double maxlen);
	// List<Product> findByNameContainingIgnoreCase(String name);
	@Query
	("from Product where length(name)<20 and price>500")
	List<Product>getLessNames();

}