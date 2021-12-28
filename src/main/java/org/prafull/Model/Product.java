package org.prafull.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductTable")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	
	private String name;
	private String productDesc;
	private long price;


	public Product(int pid, String name, String productDesc, long price) {
		super();
		this.pid = pid;
		this.name = name;
		this.productDesc = productDesc;
		this.price = price;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getProductDesc() {
		return productDesc;
	}


	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}


	public long getPrice() {
		return price;
	}


	public void setPrice(long price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", productDesc=" + productDesc + ", price=" + price + "]";
	}
	
	
	
}
