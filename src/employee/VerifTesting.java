package employee;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class VerifTesting {

	ValidateEmployee emplo;
	@Before
	public void initilise()
	{
		
		emplo=new ValidateEmployee();
		
	}
	
	@Test
	public void verifintervalle()
	{
		assertFalse(emplo.horaire(12));
		
	}
	
	
}
