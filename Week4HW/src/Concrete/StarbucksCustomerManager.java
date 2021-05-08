package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
		
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)==true) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}


}
