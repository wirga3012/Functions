import java.io.IOException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("-------------1--------------------");
//        Pirmauzduotis();
        //Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos susumuoja ir atspausdina.

        int number1 = 2023;
        int number2 = 2025;
        System.out.println();

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

        String sentence = "\"Šiandien labai \n graži \t diena\"";

        System.out.println(sentence);
        printSentence(sentence);
//      Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų. Kodavimas - sakinį apsukame iš kitos pusės.
//      Pvz “Naglis” turi gautis “silgaN”.

        String name = "Virgaile yra maladiec";

        System.out.println(reverseWords(name));
        System.out.println(reverseWords(name.split(" ")));
        System.out.println(5);
        System.out.println("kjhk");
    }
//    public static void Pirmauzduotis() {
//        sum(4,1);
//        sum(4,1);
//        sum(4,1);
//
//    }

    public static void sum(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    public static double PISq() {
        return 9.8596;
    }

    public static int skaiciuSandauga(int number1, int number2) {
        return (number1 * number2);
    }

    public static void printNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }

    public static int[] randomArr(int min, int max) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (max - min));
        }
        return numbers;
    }

    public static int arraySum(int[] nums) {
//        return Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;

    }

    public static int arrayAvg(int[] nums) {
        return arraySum(nums) / nums.length;
    }

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
}