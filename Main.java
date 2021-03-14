import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {



    public static String reponse;

    public static void binarytodecimal(){
        // Below code inspired by: https://www.javatpoint.com/java-decimal-to-binary

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n___________________________\nConvertir: \n[1] Decimal - Binaire  |  [2] Decimal - binaire\n[3] Retour");
            reponse = sc.nextLine();
            if (reponse.equals("1")) {
                int decimalint = 0;
                System.out.print("\n___________________________\nEntrez un nombre decimal: ");
                try {
                    decimalint = sc.nextInt();
                }catch(InputMismatchException e) {
                    System.out.println("ERREUR: Entree incorrecte: Valeur non decimale.");
                }

                int[] binaryNum = new int[1000];

                int i = 0;
                while (decimalint > 0)
                {
                    binaryNum[i] = decimalint % 2;
                    decimalint = decimalint / 2;
                    i++;
                }
                System.out.print("Output: ");
                for (int j = i - 1; j >= 0; j--)
                    System.out.print(binaryNum[j]);
                System.out.println("\nAppuyez sur ENTREE pour continuer.");
                try{System.in.read();}
                catch(Exception e){}

            }else if (reponse.equals("2")) {
                String binaryString;
                System.out.print("\n___________________________\nEntrez un nombre binaire: ");
                binaryString = sc.nextLine();
                try {
                    System.out.println("\nOutput: " + Integer.parseInt(binaryString, 2));
                }catch (NumberFormatException e){
                    if(binaryString.isEmpty()) {
                        System.out.println("ERREUR: Entree incorrecte: Variable nulle. Entrez une valeur (binaire)");
                    }else{
                        System.out.println("ERREUR: Entree incorrecte: Valeur non binaire.");
                    }

                }
                System.out.println("Appuyez sur ENTREE pour continuer.");
                try{System.in.read();}
                catch(Exception e){}
            }else if (reponse.equals("3")){
                break;
            }else {
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
                System.out.println("salut");
                char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                int rem;
                int num = 0;
                String hexadecimal = "";
                System.out.println("Entrez un nombre decimal: ");
                try {
                    num = sc.nextInt();
                }catch(InputMismatchException e){
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

            }else if (reponse.equals("2")){
                // Below code taken from https://javatutoring.com/decimal-to-hexadecimal-java-program/
                String hexdec ;
                String hex= "0123456789ABCDEF";
                System.out.print("Entrez un nombre hexadecimal: ");
                hexdec = sc.nextLine();
                hexdec = hexdec.toUpperCase();
                int decimal = 0;
                for (int i = 0; i < hexdec.length(); i++)
                {
                    char ch = hexdec.charAt(i);
                    int  in= hex.indexOf(ch);
                    decimal = 16*decimal + in;
                }
                System.out.print("Output: " + decimal);

            }else if (reponse.equals("3")){
                break;
            }else{
                System.out.println("____________________________\n\nERREUR: Entree incorrecte: Entrez une option valide (1/2/3)");
            }
        }
    }

    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\nQuelle conversion voulez-vous faire?");
            System.out.println("\n[1] Binaire - Decimal  |  [2] Hexadecimal - Decimal");
            reponse = sc.nextLine();

            if (reponse.equals("1")){
                Main.binarytodecimal();
            }else if (reponse.equals("2")){
                Main.decimaltohexadecimal();

            }
        }




    }
}
