package employee;

public class ValidateEmployee {

	public boolean horaire(int h)
	{
		return h<=10 && h>=5;
		
		
	}
	public boolean verifPH(int prix)
	{
		//return prix>10;
		if(prix>=10)
			return true;
		else 
			return false;
		
	}
	public boolean verifconge(int nbj)
	{
		return nbj<30;
		
		
		
	}
}
