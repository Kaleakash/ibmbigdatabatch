package shopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import shopping.bean.Product;
import shopping.resource.DbResource;

public class ProductDao {

	public int createProductInfo(Product pr) {
		try {
			//business logic 
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = 
			con.prepareStatement("insert into product values(?,?,?)");
			pstmt.setInt(1, pr.getPid());
			pstmt.setString(2, pr.getPname());
			pstmt.setFloat(3, pr.getPrice());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Create Product Dao Method "+e);
			return 0;
		}
	}
	
	public List<Product> getAllProduct() {
		List<Product> listOfProduct = new ArrayList<Product>();
		try {
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = 
			con.prepareStatement("select * from product");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Product pr = new Product();
				pr.setPid(rs.getInt(1));
				pr.setPname(rs.getString(2));
				pr.setPrice(rs.getFloat(3));
			listOfProduct.add(pr);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listOfProduct;
	}
	
}
