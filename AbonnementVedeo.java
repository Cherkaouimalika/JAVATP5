package tp5;

public class AbonnementVideo extends Abonnement implements Reducible {
	protected boolean optionHD;
	protected boolean option4K;
	protected double cout;
	protected int score;
	public AbonnementVideo(String nom,double prixBase,int nbProfils,boolean optionHD,boolean option4K) {
		super(nom,prixBase,nbProfils);
		this.optionHD=optionHD;
		this.option4K=option4K;
	}
	@Override
	public double CoutMensuel() {
		double cout=getprixBase();
		if(optionHD==true) {
		return	cout=cout+10;
		}
		if(option4K==true) {
			 cout=cout+20 ;
	}
	       return cout;
		}
	@Override
	public int ScoreSatisfaction() {
		int Score=60;
		if(optionHD==true) {
			return Score+10	;
			}
		if(option4K==true) {
			return Score+10;
		}
		if(this.getnbProfils()>=4) {
			return Score+10;
		}
		if(Score>100) {
			return Score;
		}
		return 0;
	}
public boolean EstEligibleReduction(double pourcentage) {
	if(pourcentage>=30) {
		return false;
	}else{
		return true;
	}}
   @Override
	public double AppliquerReduction(double pourcentage) {
        if (EstEligibleReduction(pourcentage)) {
            return cout * (1 - pourcentage / 100);
        }
        return cout;
   }
	public void afficher() {
		super.afficher();
		System.out.println("cout total est:"+cout);
		System.out.println("score total est:"+ScoreSatisfaction());
	}
	
	}
	
	

