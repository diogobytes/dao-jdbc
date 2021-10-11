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
		Department department = new Department(1,"Books");
	
		SellerDao sellerDao = DaoFactory.createSellerDao();


		Seller newSeller = new Seller(null,"Greg","greg@mail",new Date(),4000.0,department);
		sellerDao.insert(newSeller);
		System.out.println(newSeller.getId());
		
	}

}

