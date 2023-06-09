package jdbc;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CategoryManager1 {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void insertData() {
		int count=jdbcTemplate.update("insert into categories (catcode, catdesc) values (?, ?)", "pn", "pendrive");
		System.out.println("Affected rows :"+count);
	}


	public void printCategoryAvgPrice() {
		List<CatAvgPrice> categories = jdbcTemplate.query
				("select catcode, avg(price) as avgprice from products group by catcode",
				// RowMapper (mapRow(rs, int)) is implemented using Lambda Expression
				(rs, rowNum) -> new CatAvgPrice(rs.getString("catcode"), rs.getDouble("avgprice")));

		for (var c : categories)
			System.out.printf("%-10s  %8.2f\n", c.getCode(), c.getAvgPrice());
	}

	
}
