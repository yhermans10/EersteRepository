/* Opdracht 3
TEL HET ARRAY OP

Berekend de som van alle array elementen.
Voorbeeld: voor een gegeven array {1, 2, 3, 4} wordt de som hiervan: 1 + 2 + 3 + 4 = 10
Tip: Gebruik een for-loop.
*/

class opdracht3 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 10};
        int som = 0;

        for (int i : array){
            som += i;
        }

        // print result
        System.out.println(
            "De som is: " + som);
        
    }
}