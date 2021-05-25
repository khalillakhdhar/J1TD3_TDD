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
	public double detectprime(String prime)
	{
		return Double.parseDouble(prime);
		
		
	}
	public boolean verifprime(double prime)
	{
		return prime>100;
	}
	public boolean contenu(String decision)
	{
		
		if(decision.contains("refus")==true)
			return true;
		else if(decision.contains("acceptation"))
			return true;
		else
			return false;
		
	}
}
