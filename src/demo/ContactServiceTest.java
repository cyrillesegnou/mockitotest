package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import demo.Factory.Instance;

import static org.mockito.Mockito.*;

class ContactServiceTest {
	
	static private ContactService service ;
	

	@BeforeAll
	static void init() {
		
		
		service = Factory.getContactService(Instance.REAL); //ou Intance.MOCK
		
		
		//on je peut pas les mettre sici, il est question de crere une fabrique por cela
//		Contact c1 = new Contact("M", "Lagaffe", "Gaston") ;
//		c1.setId(1);
//		
//		
//		service = mock(ContactService.class);
//		when(service.findByIdContact(1)).thenReturn(c1);
		
	}
	
	@Test
	void testFindByID() {
		
		Contact c = service.findByIdContact(1) ;
		assertNotNull(c);
		assertEquals(1, c.getId());
		verify(service, times(1)).findByIdContact(1) ; // verifier que le contact d'id 1 à bie été appelé
		verify(service, times(0)).findByCivilite("M");
		
	}

}
