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

	Scanner sc = new Scanner(System.in);
	
	SellerDao sellerDao = DaoFactory.createSellerDao();
	
	//findById procurar vendedor por ID
	System.out.println("=== TEST 1: seller findById =====");
	Seller seller = sellerDao.findById(3);
	System.out.println(seller);
	
	//findByDepartment bugado 
	System.out.println("\n=== TEST 2: seller findByDepartment =====");
	Department department = new Department(1,null);
	List<Seller> list = sellerDao.findByDepartment(department);
	for(Seller obj : list) {
		System.out.println(obj);
	}
	//findAll bugada
	System.out.println("\n=== TEST 3: seller findAll =====");
	list = sellerDao.findAll();
	for(Seller obj : list) {
		System.out.println(obj);
	}
	//INSERT
	System.out.println("=== TEST 4: seller insert =====");
	Seller newSeller = new Seller(null, "Greg", "greg@gmail.com",new Date(), 4000.00, department);
	sellerDao.insert(newSeller);
	
	//UPDATE
	System.out.println("=== TEST 5: seller update =====");
	seller= sellerDao.findById(1);
	seller.setName("Martha Waine");
	sellerDao.update(seller);
	System.out.println("Update completed");
	
	//DELETE
	System.out.println("=== TEST 6: seller delete =====");
	System.out.println("Enter id for delete test:");
	int id = sc.nextInt();
	sellerDao.deleteById(id);
	System.out.println("Delete completed!");
	}
}
