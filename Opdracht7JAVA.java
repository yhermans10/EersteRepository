/* Opdracht 7
TIJD VOOR LINGO!
Werk het basisprincipe van Lingo uit.
Maak in de code een vast woord aan. Bijvoorbeeld fiets.
Het programma geeft dan aan dat het woord 5 letters heeft door 5 streepjes _ _ _ _ _
Via de scanner kan ik het woord proberen te raden.
Als je op enter klikt dan verschijnt een uitslag-code in een alert.
0 = fout
1 = juiste letter foute plaats (Geel in Lingo)
2 = juiste letter juiste plaats (Paars in Lingo)
Friet geeft dus 20111
Frans geeft dus 20002
*/

import java.util.Scanner;
class opdracht7 {
    public static void main(String[] args) {
        // bepaal woord, woordlengte en print het aantal streepjes
        String str1 = "fiets";
        String str2 = " ";
        int str1Lengte = str1.length(); 
        System.out.println("Raad het woord (LINGO)");
        System.out.println("Het woord bevat "+str1Lengte+ " letters");

        // streepjes zetten voor het aantal tekens van het woord
        for(int n = 0; n < str1.length(); n++)
        {
            System.out.print("- ");
        }

        // Bepaal of de speler het juiste woord heeft geraden
        Scanner sc = new Scanner(System.in);
        while(!str1.equals(str2)){
            System.out.println("\nVul gok in:");
            str2 = sc.nextLine();
            int str2Lengte = str2.length();

            for(int i = 0; i < str1Lengte || i < str2Lengte; i++) {
                // controleer per letter van woord2 of het op de juiste plek en juiste letter is tov woord1
                if(i < str1Lengte && i < str2Lengte) {
                    char charOne = str1.charAt(i);
                    char charTwo = str2.charAt(i);
                    String letter = String.valueOf(charTwo);
                    boolean bevatChar = false;
                    if(str1.contains(letter)){
                        bevatChar = true;
                    }
                    if (charOne == charTwo) {
                        System.out.print("2 ");
                    } 
                    if(bevatChar == true && charOne != charTwo){
                        System.out.print("1 ");
                    }
                    if(bevatChar == false){
                        System.out.print("0 ");
                    }
                    if(str1 == str2){
                        sc.close();
                    }
                }
            }            
        }
    }
}
    