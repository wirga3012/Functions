import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        System.out.println("-------------1--------------------");
//        Pirmauzduotis();
        //Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos susumuoja ir atspausdina.

        int number1 = 2023;
        int number2 = 2025;

        sum(number1, number2);
        sum(16, 20);

        System.out.println("--------------2---------------");
        //Sukurkite Funkciją kuri vadinasi PISq. Funkcija gražina double tipo reikšmę. Reikšmė yra : 9.8596;
        // Gautą reikšmę atspausdinkite.

        System.out.println(PISq());

        System.out.println("----------------3----------------");



        //Sukurkite Funkciją kuri priima du int tipo kintamuosius. Funkcija gražina skaičių sandaugą.;
        // Gautą reikšmę atspausdinkite.
        System.out.println("-----------------4-----------------");

        System.out.println(skaiciuSandauga(number1, number2));

        //Sukurkite Funkciją kuri priima int[] tipo kintamąį, prasuka ciklą ir atspausdina kiekvieną skaičių.

        int[] numbers = {6, 9, 2, 5, 1};
        printNumbers(numbers);

        System.out.println("-----------5----------");

        //Sukurkite Funkciją kuri sugeneruotų 5-ių random int skaičių masyvą ir jį gražintų. intervalą(min, max sugalvokite patys)

        int[] randomNumbers = randomArr(25, 60);
        printNumbers(randomNumbers);

        System.out.println("------------6---------");
//     Sukurkite Funkciją kuri panaudotų 5tos užduoties masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.
        System.out.println(arraySum(numbers));

        //Sukurkite Funkciją kuri priimtų 5tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).
        System.out.println("-------------7---------");
        System.out.println(arrayAvg(numbers));

//       Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų stačiakampį užpildytą žvaigždutėmis.
//       Pirmas int - išoriniam ciklui, antras vidiniam.
        System.out.println("--------------8---------");
        printRectangle(5, 10);

        //Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų kiek jame yra raidžių ir tarpų.
        // Sakinys - “Šiandien labai graži diena”. (kodas turi veikti padavus bet kokį sakinį)
        System.out.println("-------------9-----------");
        String sentence = "\"Šiandien labai \n graži \t diena\"";

        System.out.println(sentence);
        printSentence(sentence);
//      Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų. Kodavimas - sakinį apsukame iš kitos pusės.
//      Pvz “Naglis” turi gautis “silgaN”.
        System.out.println("-------------10---------------");

        String name = "Virgaile mokosi programuoti";

        System.out.println(reverseWords(name));
        System.out.println(reverseWords(name.split(" ")));
        System.out.println(5);
        System.out.println(" Sveikuciai");

//     Parašykite funkciją, kurios argumentas būtų tekstas, kuris būtų atspausdinamas konsolėje pridedant
//     “---” pradžioje ir gale. PVZ (---labas---)
        System.out.println("------1 sunkesnis---------");

       String word = "labas";
       printWord(word);

//    Sugeneruokite atsitiktinį stringą iš raidžių ir skaičių (10 simbolių). Atspausdinkite simbolius stulpeliu.
//    Jei tai skaičius apgaubkite “ [ 7 ]”. Jei skaičiai eina keli iš eilės, apgaubkite juos kartu. [75].
        System.out.println("----------2 sunkesnis-------");

        System.out.println(generateRndStr(10));

        System.out.println("------------3 sunkesnis------");

        String txt = generateRndStr(10);

        System.out.println(txt);

        System.out.println("--------------4 sunkesnis----------");









    }




//    public static void Pirmauzduotis() {
//        sum(4,1);
//        sum(4,1);
//        sum(4,1);
//
//    }
// 1 uzduotis
    public static void sum(int number1, int number2) {
        System.out.println(number1 + number2);
    }
// 2 uzduotis
    public static double PISq() {
        return 9.8596;
    }
//3 uzduotis
    public static int skaiciuSandauga(int number1, int number2) {
        return (number1 * number2);
    }
// 4 uzduotis
    public static void printNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }
// 5 uzduotis
    public static int[] randomArr(int min, int max) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (max - min));
        }
        return numbers;
    }
// 6 uzduotis
    public static int arraySum(int[] nums) {
//        return Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;

    }
// 7 uzduotis
    public static int arrayAvg(int[] nums) {
        return arraySum(nums) / nums.length;
    }
// 8 uzduotis
    public static void printRectangle(int number1, int number2) {
        for (int i = 0; i < number1; i++) {
            System.out.print("<[");
            for (int j = 0; j < number2; j++) {
                System.out.print("*");

            }
            System.out.print("]>");
            System.out.println();
        }

    }
// 9 uzduotis
    public static void printSentence(String words) {
        int spaceCounter = 0;
        int lettersCounter = 0;
        for (int i = 0; i < words.length(); i++) {

            if (words.toCharArray()[i] == ' ') {
                spaceCounter++;
            } else {
                lettersCounter++;
            }

        }
        System.out.println("tarpu yra - " + spaceCounter + " raidziu yra - " + lettersCounter);
    }
// 10 uzduotis
    public static String reverseWords(String words) {
        String reversedWords = "";
        for (int j = words.length() - 1; j >= 0; j--) {
            reversedWords += words.toCharArray()[j];
        }

        return reversedWords;
    }

    public static String reverseWords(String[] words) {
        String reversedWords = "";

        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversedWords += words[i].toCharArray()[j];
            }
            reversedWords += " ";
        }
        return reversedWords;
    }

//    1 sunkesnis
    public static void printWord (String words){
        String beginSimbol = "----";
        String endSimbol = "----";


        System.out.println(beginSimbol + words + endSimbol);

    }
//    2 sunkesnis
        public static String generateRndStr (int lenght){
        String txt = "ghkjjkhgjhgghffffjyk2516555655454322486647";
        String rndStr = "";
        System.out.println(rndStr);


        String nums = "";
        for (int i = 0; i < rndStr.length(); i++) {
            if (Character.isDigit(txt.charAt(i))){
                rndStr += rndStr.charAt(i);
                nums += rndStr.charAt(i);

            }else{
                if(nums.length() !=0){
                    System.out.println("[" + nums + "]");
                    nums ="";
                }
                System.out.println(rndStr.charAt(i));
            }
            if (nums.length() !=0 ){
                System.out.println("[" + nums +  "]");
            }
        }

        return rndStr;

    }
//    3 sunkesnis
    public static int integer (int roundNumber){
        int count = 0;
        for (int i = 2; i <=roundNumber ; i++) {
            if (roundNumber % i ==0){
                count++;
            }
        }
        return count;
    }
 // 4 sunkesnis. Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai nuo 33 iki 77.
    // Išrūšiuokite masyvą pagal daliklių be liekanos kiekį mažėjimo tvarka, panaudodami trečio uždavinio funkciją.





    }