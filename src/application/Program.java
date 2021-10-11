package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department(1,"Books");
	
		SellerDao sellerDao = DaoFactory.createSellerDao();


		
		List<Seller> list = sellerDao.findAll();
		
		for(Seller sellerboy : list) {
			System.out.println(sellerboy);
		}
		
	}

}
