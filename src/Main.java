import java.util.Scanner;
public class Main {
	private static Scanner clavier;
	public static void main(String[] args) {
		clavier = new Scanner (System.in);
		
		System.out.println("entrer un nombre");
		//char nb = clavier.nextLine().charAt(0);
		
		//int resultat =0;
		
		//CONVERTIR UN CHAR EN INT
		
		//int nb1 =(int) nb;
		//int nb1 = Integer.parseInt(nb);
			//resultat = nb1*28;
			//TESTE 2
			//TETETE
		
		try{
			int nbEntrer = clavier.nextInt();
			System.out.println("le nombre "+ nbEntrer);
		}
		// erreur est un objet
		catch(Exception erreur){
			System.out.println("erreur");
			System.out.println(erreur.toString());
		}
		
		//System.out.println("Le resultat est "+resultat);

	}

}
