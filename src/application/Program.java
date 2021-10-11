package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		Department obj = new Department(1,"Books");
		Department department = new Department(1,"Books");
	
		SellerDao sellerDao = DaoFactory.createSellerDao();


		Seller newSeller = new Seller(null,"Greg","greg@mail",new Date(),4000.0,department);
	
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		sc.close();
		
		
	}

}

