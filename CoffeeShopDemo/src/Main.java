import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Entities.Customer;
//import adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException{
		BaseCustomerManager customerManager = new BaseCustomerManager();
		try {
			customerManager.save(new Customer(101, "Şükrü ", "Şimşek", 1999, "48584781498"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
