/* Opdracht 4
ARRAY SORTEREN
Maak een array met 10 random getallen die deze in de volgorde van generering toont.
Toon daarna deze array in gesorteerde volgorde.
ADVANCED: gebruik geen methode van array of Collections, maar realiseer het met je eigen algoritme.
*/

import java.util.Arrays;
class opdracht4 {
    public static void main(String[] args) {
        int aantalNummers = 10;
        int array[] = new int[aantalNummers];
        // random getallen genereren in array
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*aantalNummers+1);
        }
        // print array
        System.out.println("randomNumber = " + Arrays.toString(array));

        // sorteer en print array
        Arrays.sort(array);
        System.out.println("randomNumber = " + Arrays.toString(array));
    }
}