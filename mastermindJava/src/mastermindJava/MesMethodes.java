package mastermindJava;

public class MesMethodes {

	import java.util.*;
	import Random 
	
	// déclarations des methodes à appeler pour le jeu
	int i;
	private final int NB_PIONS = 4;
	private final int NB_MANCHES = 10;
	public int reste_manche = NB_MANCHES;
	int proposer[];
	int bonnecomb[];
	
	Random random = new Random();
	Scanner saisir = new Scanner(System.in);
	
	
	/* Combinaison proposée par le joueur */
	public static proposer() {
		
		while(saisir.nextIn()>3) {
			System.out.println("Nombre inférieur à 4");
		}
		for(i=0; i<NB_PIONS; i++) {
			proposer[i] = saisir.nextInt();
			return proposer[i];
			}	
	}
	
	/* combinaison solution  de la manche */
	
	public static void bonnecombinaison() {
		for(i=0; i<NB_PIONS; i++) {
			bonnecomb[i] = rand.nextInt(4 - 0 +1)+0;
		}
		}
	
	public 
	
	
	
	
	
}
