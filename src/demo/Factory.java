package demo;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Factory {
	
	public enum Instance{
		MOCK, REAL ;
		
	}
	
	public static ContactService getContactService (Instance instance) {
		
		ContactService service = null;
		switch(instance) {
		
		case MOCK :
			Contact c1 = new Contact("M", "Lagaffe", "Gaston") ;
			c1.setId(1);
			
			service = mock(ContactService.class);
			when(service.findByIdContact(1)).thenReturn(c1);
			break ;
		case REAL :
			
			service = mock(ContactServiceImpl.class) ;
			when(service.findByIdContact(1)).thenCallRealMethod();
			
			break ;
			
			default :
			break ;
		
		}
		return service ; 
		
		
	}

}
