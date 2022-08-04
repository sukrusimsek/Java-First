package Concrete;

import Abstract.ICostumerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICostumerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
	}
	
}
