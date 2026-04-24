package tp5;
public abstract class Abonnement {
	private String nom;
	 private double prixBase;
	 private int nbProfils;
	 public Abonnement( String nom,double prixBase,int nbProfils) {
		 this.nom=nom;
		 if (prixBase<=0) {
			 this.prixBase=1;
		 }
		
		 if (nbProfils<=0) {
			this. nbProfils=1;
		 }
	 }
		 public String getnom() {
			 return nom;
		 }
		 public void setnom(String nom) {
			 this.nom=nom;
		 }
		 public double getprixBase() {
			 return prixBase;
		 }
		 public void setprixBase(double prixBase) {
			 this.prixBase=prixBase;
		 }
		 public int  getnbProfils () {
			 return  nbProfils;
		  }
		 public void setnbProfils(int nbProfils) {
			 this.nbProfils=nbProfils;
		 }
		 public boolean estPartager() {
			 if (nbProfils>=3){
				 return true;
			 }
			 else {
				 return false;
			 }}
		 public void afficher() {
			 System.out.println("le nom est:"+nom);
			 System.out.println("le prixBase est:"+prixBase);
			 System.out.println("le nbProfils est:"+nbProfils);
			 System.out.println("le  est estPartager:"+estPartager());
		 }
		 protected abstract double CoutMensuel();
		 public abstract  int ScoreSatisfaction();

