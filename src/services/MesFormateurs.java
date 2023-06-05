package services;

import java.text.DecimalFormat;

public class MesFormateurs {

        /**
         * Formate un nombre entier de manière à ce que son affichage soit aligné à
         * droite sur 5 positions en remplissant les décimales manquantes à l'aide de
         * zéros.
         * 
         * @param valeur la valeur devant être formatée de la manière décrite
         * @return une chaîne de caractèresformatée formatée comme précité
         */
        public static String formaterNbreEntierA(int valeur) {
                DecimalFormat df = new DecimalFormat("00000");
                return df.format(valeur);
        }

        /**
         * Formate un nombre entier de manière lisible et compréhensible pour un être
         * humain, en utilisant un séparateur de milliers et en forçant un affichage à
         * au minimum 4 décimales à l'aide de zéros.
         * 
         * @param valeur la valeur devant être formatée de manière lisible et
         *               compréhensible
         * @return une chaîne de caractèresformatée formatée comme précité
         */
        public static String formaterNbreEntierB(int valeur) {
                DecimalFormat df = new DecimalFormat("#,###");
                return df.format(valeur);
        }

        /**
         * Formate un nombre réel de manière lisible et compréhensible pour un être
         * humain, en utilisant un séparateur de milliers et en forçant un affichage à 3
         * décimales après la virgule.
         * 
         * @param valeur la valeur devant être formatée de manière lisible et
         *               compréhensible
         * @return une chaîne de caractèresformatée formatée comme précité
         */
        public static String formaterNbreReel(double valeur) {
                DecimalFormat df = new DecimalFormat("#,###.000");
                return df.format(valeur);
        }
}
