package ovh.johanpassion;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        Double prixTotal = 0.0;
        System.out.println("Combien d'article avez-vous ?");
        int nbArticle = clavier.nextInt();
        for (int i=0;i<nbArticle;i++){
            System.out.println("Donner le prix de l'article "+i);
            Double prix = clavier.nextDouble();
            prixTotal += prix;
        }
        System.out.println("Votre total est de : "+prixTotal);
        clavier.close();

        /*
         * int i = 1;
         * while(nbArticle>0){
         * i+=1
         * System.out.println("Donner le prix de l'article "+i);
         * Double prix = clavier.nextDouble();
         * prixTotal += prix;
         * }
         * 
         */

    }
    
}
