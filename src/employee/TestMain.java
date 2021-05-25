package employee;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em=new Employee();
		ValidateEmployee validation=new ValidateEmployee();
		if(validation.horaire(5))
		{
			em.setNbheur(7);
		}
		if(validation.contenu("rf de conge"))
		{
			em.setDecision("refus de conge");
		}
		if(validation.verifconge(20))
		{
			em.setConge(20);
		}
		if(validation.verifprime(400))
		{
			em.setPrime(400);
		}
		if(validation.verifPH(40))
		{
			em.setPrix_heure(40);
		}
		
		System.out.println(em.toString());
		
	}

}
