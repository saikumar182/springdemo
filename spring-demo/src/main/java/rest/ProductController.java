package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class ProductController {
@Autowired

private ProductRepo productRepo;


@GetMapping("/products")public List<Product> getAll(){
	return productRepo.findAll();
}
@DeleteMapping("/products/{id}")
public void deleteProductByid(@PathVariable("id") int id) {
	var p = productRepo.findById(id);
	if (p.isPresent())
		productRepo.deleteById(id);
	else
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Category Code Not Found");
}

  @DeleteMapping("/DeleteProductByName/{name}")
 public void deleteNameByProdName(@PathVariable(name ="name") String name) {
var pro= productRepo.findByName(name);
if(pro != null)
	productRepo.delete(pro);	
		else
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Category Code Not Found");
	}
  


	@PutMapping("/products/{id}") 
	public Product updateProductQuantity(@PathVariable("id") int id, @RequestParam("qoh") int qoh) {
	var prod = productRepo.findById(id);
	if (prod.isPresent()) {
	var product = prod.get();
	product.setQoh(qoh);
	productRepo.save(product);
	return product;
	} else
	throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product quantity Not Found");
	
}
}