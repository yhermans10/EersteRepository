/* Opdracht 2
HOEVEEL E'S?

Tel het aantal keer dat de letter "e" in een gegeven string voorkomt.
Voorbeeld: "regenen" heeft 3 keer de letter "e".
Tip!: gebruik de methode charAt(int index) icm een for-loop.
*/

class Tellen {
    public static void main(String[] args) {
        String woord = "regenen";
        String letter = "e";
        int aantal = 0;
        int i;

        for(i = 0; i < woord.length(); i++){
            if(woord.charAt(i) == letter.charAt(0)){
                aantal++;
            }
        }

        // print result
       System.out.print("De letter '"+letter+"'' komt "+aantal+" keer voor in het woord '"+woord+ "'");
        
    }
}