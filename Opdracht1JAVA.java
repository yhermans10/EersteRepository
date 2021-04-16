/* Opdracht 1
STRINGS AAN ELKAAR PLAKKEN

Print de concatenatie van een aantal strings.
Voorbeeld: "po", "ging", "en" wordt "pogingen".
*/

class Demo {
    public static void main(String[] args) {
        String str1 = "po";
        String str2 = "ging";
        String str3 = "en";

       // Concateneer str1, str2 en str3
        String result = str1+str2+str3;
      
       // print result
       System.out.println(result);
    }
}