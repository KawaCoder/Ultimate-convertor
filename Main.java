import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {



    public static String reponse;


    public static void timeconvertor(){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\n___________________________\n[1] Heure - Minute  |  [2] Seconde - Heure\n" +
                    "[3] Seconde - Minute\n[4] Retour");
            reponse = sc.nextLine();
            if (reponse.equals("1")) {
                while(true){
                    System.out.println("\n\n___________________________\n[1] Heure - Minute  |  [2] Minute - Heure\n" +
                            "[3] Retour");
                    reponse = sc.nextLine();
                    if (reponse.equals("1")) {
                        while(true) {
                            System.out.println("Entrez une valeur en Heure:");
                            try {
                                double heure = sc.nextDouble();
                                sc.nextLine();
                                double minute = heure / 60;
                                System.out.println("Output: "+heure+" h. = "+ minute+" m.");
                            } catch (InputMismatchException e) {
                                System.out.println("\n\nERREUR: Entree incorrecte: Entrez un nombre.");
                            }
                            System.out.println("\n\nContinuer? o/n");
                            reponse = sc.nextLine();
                            if (reponse.equals("n")) {
                                break;
                            }
                        }
                    }else if (reponse.equals("2")){
                        while(true){
                            System.out.println("Entrez une valeur en minute:");
                            try {
                                int minute = sc.nextInt();
                                sc.nextLine();
                                int heure = minute / 60;
                                minute = minute % 60;
                                System.out.println("Output: "+heure+" h "+ minute+" m.");
                            } catch (InputMismatchException e) {
                                System.out.println("\n\nERREUR: Entree incorrecte: Entrez un nombre.");
                            }
                            System.out.println("\n\nContinuer? o/n");
                            reponse = sc.nextLine();
                            if (reponse.equals("n")) {
                                break;
                            }



                        }

                    }else if (reponse.equals("3")){
                        break;
                    }

                }

            }else if (reponse.equals("2")) {
                while (true) {
                    System.out.println("\n\n___________________________\n[1] Seconde - Heure  |  [2] Heure - Seconde\n" +
                            "[3] Retour");
                    reponse = sc.nextLine();
                    if (reponse.equals("1")) {
                        while(true) {
                            System.out.println("Entrez une valeur en seconde:");
                            try {
                                int seconde = sc.nextInt();
                                sc.nextLine();
                                int minute = seconde / 60;
                                int heure = minute / 60;
                                minute = minute % 60;
                                System.out.println("Output: " + seconde + " s = " + heure + " h " + minute + " m " + (seconde % 60) + " s.");
                            } catch (InputMismatchException e) {
                                System.out.println("\n\nERREUR: Entree incorrecte: Entrez un nombre.");
                            }
                            System.out.println("\n\nContinuer? o/n");
                            reponse = sc.nextLine();
                            if (reponse.equals("n")) {
                                break;
                            }
                        }
                    }else if (reponse.equals("2")) {
                        while (true) {
                            System.out.println("Entrez une valeur en heure:");
                            try {
                                long seconde = sc.nextLong();
                                sc.nextLine();
                                System.out.println("Output: " + seconde + " s = " + seconde * 3600 + " h.");
                            } catch (InputMismatchException e) {
                                System.out.println("\n\nERREUR: Entree incorrecte: Entrez un nombre.");
                            }
                            System.out.println("\n\nContinuer? o/n");
                            reponse = sc.nextLine();
                            if (reponse.equals("n")) {
                                break;
                            }
                        }


                    }
                }
            }else if (reponse.equals("3")){

            }
        }
    }


    public static void ohmconvertor(){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\n___________________________\nTrouver: \n[1] Une resistance (ohm)  |  [2] Une tension (volt)\n" +
                    "[3] Une intensite de courant (ampere)\n[4] Retour");
            reponse = sc.nextLine();
            if (reponse.equals("1")) {
                while(true){
                System.out.println("Entrez la tension (V): ");
                double U = sc.nextDouble();
                    sc.nextLine();
                System.out.println("Entrez l'intensite (A): ");
                double I = sc.nextDouble();
                    sc.nextLine();
                try {
                    System.out.println("Output: " + (U / I) + " Ω");

                } catch (InputMismatchException e) {
                    System.out.println("\n\nERREUR: Entree incorrecte: Entrez un nombre.");
                }
                System.out.println("\n\nContinuer? o/n");
                 reponse = sc.nextLine();
                if (reponse.equals("n")) {
                    break;
                }
            }
            }else if (reponse.equals("2")){
                while(true) {
                    System.out.println("Entrez la resistance (Ω): ");
                    double R = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Entrez l'intensite (A): ");
                    double I = sc.nextDouble();
                    sc.nextLine();
                    try {
                        System.out.println("Output: " + (R * I) + " V");

                    } catch (InputMismatchException e) {
                        System.out.println("\n\nERREUR: Entree incorrecte: Entrez un nombre.");
                    }
                    System.out.println("\n\nContinuer? o/n");
                    reponse = sc.nextLine();
                    if (reponse.equals("n")) {
                        break;
                    }
                }
            }else if (reponse.equals("3")){
                while(true) {
                    System.out.println("Entrez la tension (V): ");
                    double U = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Entrez la resistance (Ω): ");
                    double R = sc.nextDouble();
                    sc.nextLine();
                    try {
                        System.out.println("Output: " + (U / R) + " Ω");

                    } catch (InputMismatchException e) {
                        System.out.println("\n\nERREUR: Entree incorrecte: Entrez un nombre.");
                    }
                    System.out.println("\n\nContinuer? o/n");
                    reponse = sc.nextLine();
                    if (reponse.equals("n")) {
                        break;
                    }
                }
            }else if (reponse.equals("4")){
                break;
            }else{
                System.out.println("____________________________\n\nERREUR: Entree incorrecte: Entrez une option valide (1/2/3/4)");
            }
        }

    }


    public static void oncetoliters(){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\n___________________________\nConvertir: \n[1] Litre - Ounce  |  [2] Ounce - Litre\n[3] Retour");
            reponse = sc.nextLine();
            if (reponse.equals("1")){
                while(true) {
                    System.out.println("Entrez une valeur en litre.");
                    try {
                        int litre = sc.nextInt();
                        sc.nextLine();
                        System.out.println("\n\nOutput:" + litre * 33.81402 + " oz");

                    } catch (InputMismatchException e) {
                        System.out.println("\n\nERREUR: Entree incorrecte: Entrez un nombre.");
                    }
                    System.out.println("\n\nContinuer? o/n");
                    reponse = sc.nextLine();
                    if (reponse.equals("n")) {
                        break;
                    }
                }
            }else if (reponse.equals("2")){
                while(true) {
                    System.out.println("Entrez une valeur en once (fl oz).");
                    try {
                        int once = sc.nextInt();
                        sc.nextLine();
                        System.out.println("\n\nOutput:" + once * 0.0295735296 + " L");

                    } catch (InputMismatchException e) {
                        System.out.println("\n\nERREUR: Entree incorrecte: Entrez un nombre.");
                    }
                    System.out.println("\n\nContinuer? o/n");
                    reponse = sc.nextLine();
                    if (reponse.equals("n")) {
                        break;
                    }
                }
            }else if (reponse.equals("3")){
                break;
            }else{
                System.out.println("____________________________\n\nERREUR: Entree incorrecte: Entrez une option valide (1/2/3)");
            }

        }
    }

    public static void ouncetograms(){

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\n___________________________\nConvertir: \n[1] Grammes - Ounce  |  [2] Ounce - Grammes\n[3] Retour");
            reponse = sc.nextLine();
            if (reponse.equals("1")){
                while(true) {
                    double gramme = 0.0;
                    System.out.println("Entrez une valeur en Grammes: ");
                    try {
                        gramme = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("\n\nOutput: " + gramme * 0.035273962 + "oz");
                    } catch (InputMismatchException e) {
                        System.out.println("\n\nERREUR: Entree incorrecte: Entrez un nombre.");
                    }
                    System.out.println("\n\nContinuer? o/n");
                    reponse = sc.nextLine();
                    if (reponse.equals("n")) {
                        break;
                    }
                }
            }else if (reponse.equals("2")){
                while(true) {
                    double ounce = 0.0;
                    System.out.println("Entrez une valeur en Ounce: ");
                    try {
                        ounce = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("\n\nOutput: " + ounce * 28.34952 + "g");
                    } catch (InputMismatchException e) {
                        System.out.println("\n\nERREUR: Entree incorrecte: Entrez un nombre.");
                    }
                    System.out.println("\n\nContinuer? o/n");
                    reponse = sc.nextLine();
                    if (reponse.equals("n")) {
                        break;
                    }
                }
            }else if (reponse.equals("3")){
                break;
            }else{
                System.out.println("____________________________\n\nERREUR: Entree incorrecte: Entrez une option valide (1/2/3)");
            }


        }
    }

    public static void fahrenheittocelsius(){
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\n___________________________\nConvertir: \n[1] Fahrenheit - Celsius  |  [2] Celsius - Fahrenheit\n[3] Retour");
            reponse = sc.nextLine();
            if (reponse.equals("1")) {
                while(true) {
                    double a = 0.0;
                    System.out.println("Entrez une temperature en fahrenheit: ");
                    try {
                        a = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("\n\nOutput: " + ((a - 32) * 5 / 9) + "°C");
                    } catch (InputMismatchException e) {
                        System.out.println("\n\nERREUR: Entree incorrecte: Entrez un nombre.");
                    }
                    System.out.println("\n\nContinuer? o/n");
                    reponse = sc.nextLine();
                    if (reponse.equals("n")) {
                        break;
                    }
                }


            } else if (reponse.equals("2")) {
                //while (true) {
                    double celsius = 0.0;
                    System.out.println("Entrez une temperature en celsius: ");
                    try {
                        celsius = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("\n\nOutput: " + ((celsius * 1.8) + 32) + "°F");
                    } catch (InputMismatchException e) {
                        System.out.println("\n\nERREUR: Entree incorrecte: Entrez un nombre.");
                    }
                }else if (reponse.equals("3")) {
                    break;
                } else {
                    System.out.println("____________________________\n\nERREUR: Entree incorrecte: Entrez une option valide (1/2/3)");
                }
                System.out.println("\n\nContinuer? o/n");
                reponse = sc.nextLine();
                if (reponse.equals("n")) {
                    break;
                }
            }
        }

    public static void binarytodecimal(){
        // Below code inspired by: https://www.javatpoint.com/java-decimal-to-binary

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n___________________________\nConvertir: \n[1] Decimal - Binaire  |  [2] Decimal - binaire\n[3] Retour");
            reponse = sc.nextLine();
            if (reponse.equals("1")) {
                while(true) {
                    int decimalint = 0;
                    System.out.print("\n___________________________\nEntrez un nombre decimal: ");
                    try {
                        decimalint = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("ERREUR: Entree incorrecte: Valeur non decimale.");
                    }

                    int[] binaryNum = new int[1000];

                    int i = 0;
                    while (decimalint > 0) {
                        binaryNum[i] = decimalint % 2;
                        decimalint = decimalint / 2;
                        i++;
                    }
                    System.out.print("Output: ");
                    for (int j = i - 1; j >= 0; j--) {
                        System.out.print(binaryNum[j]);
                    }
                    System.out.println("\n\nContinuer? o/n");
                    reponse = sc.nextLine();
                    if (reponse.equals("n")) {
                        break;
                    }
                }
            }else if (reponse.equals("2")) {
                while (true) {
                    String binaryString;
                    System.out.print("\n___________________________\nEntrez un nombre binaire: ");
                    binaryString = sc.nextLine();
                    try {
                        System.out.println("\nOutput: " + Integer.parseInt(binaryString, 2));
                    } catch (NumberFormatException e) {
                        if (binaryString.isEmpty()) {
                            System.out.println("ERREUR: Entree incorrecte: Variable nulle. Entrez une valeur (binaire)");
                        } else {
                            System.out.println("ERREUR: Entree incorrecte: Valeur non binaire.");
                        }

                    }
                    System.out.println("\n\nContinuer? o/n");
                    reponse = sc.nextLine();
                    if (reponse.equals("n")) {
                        break;
                    }
                }
                }else if (reponse.equals("3")) {
                    break;
                } else {
                    System.out.println("____________________________\n\nERREUR: Entree incorrecte: Entrez une option valide (1/2/3)");
                }
        }
    }

    // Below code taken from https://javatutoring.com/decimal-to-hexadecimal-java-program/
    public static void decimaltohexadecimal() {

        while (true) {
            boolean erreur = false;
            Scanner sc = new Scanner(System.in);
            System.out.println("\n___________________________\nConvertir: \n[1] Decimal - Hexadecimal  |  [2] Hexadecimal - Decimal\n[3] Retour");
            reponse = sc.nextLine();
            if (reponse.equals("1")){
                while(true) {
                    char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                    int rem;
                    int num = 0;
                    String hexadecimal = "";
                    System.out.println("Entrez un nombre decimal: ");
                    try {
                        num = sc.nextInt();
                        sc.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("ERREUR: Entree incorrecte: Valeur non decimale.");
                        erreur = true;
                    }
                    System.out.println("Output: ");
                    while (num != 0) {
                        rem = num % 16;
                        hexadecimal = ch[rem] + hexadecimal;
                        num = num / 16;
                    }
                    System.out.print(hexadecimal);
                    System.out.println("\n\nContinuer? o/n");
                    reponse = sc.next();
                    if (reponse.equals("n")) {
                        break;
                    }
                }
            }else if (reponse.equals("2")){
                while(true) {
                    // Below code taken from https://javatutoring.com/decimal-to-hexadecimal-java-program/
                    String hexdec;
                    String hex = "0123456789ABCDEF";
                    System.out.print("Entrez un nombre hexadecimal: ");
                    hexdec = sc.nextLine();
                    hexdec = hexdec.toUpperCase();
                    int decimal = 0;
                    for (int i = 0; i < hexdec.length(); i++) {
                        char ch = hexdec.charAt(i);
                        int in = hex.indexOf(ch);
                        decimal = 16 * decimal + in;
                    }
                    System.out.print("Output: " + decimal);
                    System.out.println("\n\nContinuer? o/n");
                    reponse = sc.nextLine();
                    if (reponse.equals("n")) {
                        break;
                    }
                }
            }else if (reponse.equals("3")){
                break;
            }else{
                System.out.println("____________________________\n\nERREUR: Entree incorrecte: Entrez une option valide (1/2/3)");
            }
        }
    }

    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\nQuelle conversion voulez-vous faire?");
            System.out.println("\n[1] Binaire - Decimal  |  [2] Hexadecimal - Decimal\n" +
                    "[3] Fahrenheit - Celsius  |  [4] Ounce - Grammes\n" +
                    "[5] Once (fl oz) - Litre  |  [6] Convertisseur electrique (loi d'Ohm)\n" +
                    "[7] Heure - Minute -      |\n" +
                    "Seconde");
            reponse = sc.nextLine();

            if (reponse.equals("1")) {
                Main.binarytodecimal();
            } else if (reponse.equals("2")) {
                Main.decimaltohexadecimal();
            } else if (reponse.equals("3")) {
                Main.fahrenheittocelsius();
            } else if (reponse.equals("4")) {
                Main.ouncetograms();
            } else if (reponse.equals("5")) {
                Main.oncetoliters();
            } else if (reponse.equals("6")) {
                Main.ohmconvertor();
            }else if (reponse.equals("7")) {
                Main.timeconvertor();
            }else{
                System.out.println("____________________________\n\nERREUR: Entree incorrecte: Entrez une option valide (1/2/3/4/5/6)");
            }


        }
    }
}
//this is a git test
//this is an other test
//ok it works ^^
