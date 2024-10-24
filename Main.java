package fr.zerin.main;
import java.util.Scanner;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Main {
	
	public static void printMatrice(int matrice[][]){
		for (int [] row : matrice)
		{
			// traverses through number of rows
			for (int element : row)
			{
				// 'element' has current element of row index
				System.out.print( element  + "\t");
			}
			System.out.println();
		}
	}
	
	public static int[][] createRngMatrice(int nbDeLigne, int nbDeColonne){
		
		int[][] tabMatrice = new int[nbDeLigne][nbDeColonne];
		Random rand = new Random();
		//System.out.println("Inserer les nombres dans votre matrice");
		
		for (int i = 0; i < nbDeLigne ; i++) {
			//System.out.println();
			
			for (int j = 0; j < nbDeColonne; j++) {
				
				//System.out.println("Ligne numéro "+ (i+1) +" colonne numéro "+ (j+1)+":");
				//int tempMatriceNb = sc.nextInt();
				int tempMatriceNb = rand.nextInt(3);
				tabMatrice[i][j] = tempMatriceNb;
				}
			}
		return tabMatrice;
	}
	
public static int[][] additionMatrice(int[][] m1,int[][] m2){
	
	
	int ligne = m1.length;
	int colonne = m1[0].length;
	int[][] tabMatrice = new int[ligne][colonne] ;
	
	for (int i = 0; i < ligne ; i++) {
		//System.out.println();
		
		for (int j = 0; j < colonne; j++) {
			tabMatrice[i][j] = m1[i][j] + m2[i][j];
			
			}
		}
	return tabMatrice;
		
	}

public static int[][] multiMatrice(int[][] m1,int[][] m2){
	
	
	int colonne= m2[0].length;
	int ligne = m1.length;
	int ligneCalc = m1[0].length;
	int[][] tabMatrice = new int[ligne][colonne];
	int res = 0;
	
	for (int i = 0; i < ligne ; i++) {
		//System.out.println();
		
		for (int j = 0; j < colonne; j++) {
			
			
			for(int k = 0; k < ligneCalc ; k++) {
				
				res =res + (m1[i][k] * m2[k][j]);
				}
			
			tabMatrice[i][j] = res;
			res = 0;
			}
		}
	return tabMatrice;
		
	}
	
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Fenetre fen = new Fenetre();
		
		
		System.out.println("Nous allons afficher une matrice en java de la taille que vous souhaitez");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Combien de Colonne ?");
		//int nbDeColonne = sc.nextInt();
		int nbDeColonne = fen.numbercolonne;
		System.out.println("Combien de Ligne ?");
		//int nbDeLigne  sc.nextInt();
		int nbDeLigne = fen.numberligne;
		
		fen = null;

		
		int[][] matrice1 = createRngMatrice(nbDeLigne,nbDeColonne);
		int[][] matrice2 = createRngMatrice(nbDeLigne,nbDeColonne);
		

		System.out.println("Voici la 1er matrice");
		printMatrice(matrice1);
		System.out.println("Voici la 2eme matrice");
		printMatrice(matrice2);
		System.out.println("Nous allons ADDITIONNER nos matrices");
		//int[][] matriceadd = additionMatrice(matrice1,matrice2);
		//printMatrice(matriceadd);
		System.out.println("Nous allons MULTIPLIER nos matrices");
		int[][] matricemulti = multiMatrice(matrice1,matrice2);
		printMatrice(matricemulti);
		
		
		
		
		
		
		
				
    
	}

	
	

}

  

