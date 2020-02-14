package shopping.service;

import java.util.List;
import java.util.ListIterator;

import shopping.bean.Product;
import shopping.dao.ProductDao;

public class ProductService {

	public String storeProductInfo(Product pr) {
		if(pr.getPrice()>500) {
			
			ProductDao pd = new ProductDao();
			if(pd.createProductInfo(pr)>0) {
				return "Product details stored successfully";
			}else {
				return "Product details didn't sotre";
			}
			
		}else {
			return "Product Price must be min 500 ";
		}
	}
	
	public List<Product> getProductInfo() {
		ProductDao pd = new ProductDao();
		List<Product> listOfProduct = pd.getAllProduct();
		ListIterator<Product> li = listOfProduct.listIterator();
		while(li.hasNext()) {
			Product p  =li.next();
			p.setPrice(p.getPrice()*0.9f);		
		}
		return listOfProduct;
	}
}
