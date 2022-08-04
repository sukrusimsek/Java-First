package Concrete;
import Entities.Customer;
import Abstract.BaseCustomerManager;
import Abstract.ICostumerCheckService;

public abstract class StarbucksCustomerManager extends BaseCustomerManager {
	private ICostumerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICostumerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
}
	@Override
	public void save(Customer customer) throws Exception{
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}	
	}
	
}
