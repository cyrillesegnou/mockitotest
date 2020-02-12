package demo;

import java.util.List;

public interface ContactService {
	
	Contact findByIdContact(long id) ;
	
	List<Contact> findByCivilite(String civilite) ;
	
	

}
