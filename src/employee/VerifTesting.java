package employee;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
	@Test
	public void verifprix()
	{
		assertTrue(emplo.verifPH(23));
		
		
		
	}
	@Test
	public void conges()
	{
		assertFalse(emplo.verifconge(33));
	}
	@Test
	public void testpr()
	{
		assertTrue(emplo.verifprime(200));
		
		
	}
	@Test
	public void prisedecision()
	{
		assertTrue(emplo.contenu("refus de cong? pour x"));
		
		
	}
	
	
}
