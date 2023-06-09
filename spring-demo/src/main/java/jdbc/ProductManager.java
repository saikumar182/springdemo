package jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class ProductManager {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public void showProductAvg() {
		Integer avg = jdbcTemplate.queryForObject("select avg(price) from products", Integer.class);
		System.out.println("average = " + avg);
	}

}