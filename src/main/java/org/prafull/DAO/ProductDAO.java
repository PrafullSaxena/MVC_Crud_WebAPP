package org.prafull.DAO;

import java.util.List;
import javax.transaction.Transactional;
import org.prafull.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;




@Component
public class ProductDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	public List<Product> getProducts(){
		
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	public Product getProduct(int pid) {
		
		Product product = hibernateTemplate.get(Product.class, pid);
		
		return product;
	}
	
	@Transactional
	public void deleteProduct(int pid) {
		
		Product p = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
		
	}
	
	

}
