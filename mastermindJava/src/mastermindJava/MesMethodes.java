package mastermindJava;


import java.util.Scanner;
import java.util.Random;

public class MesMethodes {


	/* déclarations des methodes à appeler pour le jeu*/
	
	private static final int NB_PIONS = 4;
	private final int NB_MANCHES = 10;
	int reste_manche = NB_MANCHES;
	static int proposer[];
	int bonnecombi[];
	
	Random random = new Random();
	static Scanner saisir = new Scanner(System.in);

	/* Construcuteur de la class */
	
	public MesMethodes() {
		
	}
/* Combinaison proposée par le joueur */
		
		public static void proposition() {
			for(int i = 0; i<NB_PIONS; i++) {
				proposer[i] = saisir.nextInt();
			}
		}
		
		/* combinaison solution  de la manche */
		
		  void bonnecombinaison(){
			for(int i=0; i<NB_PIONS; i++) {
				bonnecombi[i] = random.nextInt(4 - 0 +1)+0;
			}
			}
		
		public void comparecombinaison() {
			for(int i=0; i<NB_PIONS; i++) {
				
		}
		
	}
		
	
	
	
	
	
}