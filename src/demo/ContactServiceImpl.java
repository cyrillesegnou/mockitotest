package demo;

import java.util.List;

public class ContactServiceImpl implements ContactService{

	@Override
	public Contact findByIdContact(long id) {
		Contact c1 = new Contact("M", "Lagaffe", "Gaston") ;
		c1.setId(1);
		
		return c1;
	}

	@Override
	public List<Contact> findByCivilite(String civilite) {
		// TODO Auto-generated method stub
		return null;
	}

}
