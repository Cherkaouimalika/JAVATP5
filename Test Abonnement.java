package tp5;
public class TestAbonnement {
	public static void main(String[] args) {
       Abonnement[] AB=new Abonnement[3];
		
       AB[0]=new AbonnementVideo("ali",12.0, 4, true ,true);
       AB[1]=new AbonnementMusique("ali",12, 4, 50,true);
	     AB[2]=new AbonnementJeux("malika",12.2 ,4, 24,44);
		
		 for(Abonnement ab :AB) {
			 ab.afficher();
			 System.out.println(ab.CoutMensuel());
			 System.out.println(ab.ScoreSatisfaction());
			 }
		 
	System.out.println("TEST REDUCTION 20%_____   50%____   ");
	
	for (Abonnement ab :AB) {
		
	if(ab instanceof Reducible) {
		ab.afficher();
		Reducible re=(Reducible) ab;
		 System.out.println("le cout apré 20%:"+ab.CoutMensuel());
		 System.out.println("le cout apré 50%:"+ab.CoutMensuel());
	}
	
	
	}
	}
	}
