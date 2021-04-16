/* Opdracht 6
ZET DE LETTERS OP VOLGORDE
Als gebruiker mag ik een String invoeren. Dit doe ik via de Scanner.
De String wordt getoond.
Daarna worden alle letters uit de String getoond in alfabetische volgorde.
*/
import java.util.Arrays;
import java.util.Scanner;
class opdracht6 {
    public static void main(String[] args) {
        // Vul de userInput in en print het
        Scanner input = new Scanner(System.in);
        System.out.println("Typ een woord"); 
        String userInput = input.nextLine();   
        System.out.println("Input user is: " + userInput);
        input.close();
        
        // transform to char, sorteer en print
        char charArray[] = userInput.toCharArray();
        Arrays.sort(charArray);
        System.out.println("Alfabetische volgorde van input user is: " + new String(charArray));
    }
}