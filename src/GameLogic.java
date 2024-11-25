import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    //--------------------------------------------------
    //      Change to your path to file with list of word
    //--------------------------------------------------
    private final String pathFileSecrets = "E:/Programming/JavaIDE/IntelliJIDEA/InteleJ_Project/Visilica/secretStr.txt";
    private final int sizeBuffer = 256;

    private String secret;
    private int countError = 0;

    private LinkedList<Character> userString = new LinkedList<>();

    public void SelectSecretFromFile(){
        char[] buffer = new char[sizeBuffer];
        Random rand = new Random();
        try{
            Path path = Paths.get(pathFileSecrets);

            List<String> list = Files.readAllLines(path);
            String[] arrayStr = list.toArray(new String[0]);

            int indexSecret = rand.nextInt(arrayStr.length);
            secret = arrayStr[indexSecret];

            for(int i = 0; i < secret.length(); i++){
                userString.add('_');
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void GuessSecret(){
        SelectSecretFromFile();
        Scanner console = new Scanner(System.in);
        char userChar;
        int positionUserChar;
        do{
            PrinterGallows.printGallow(countError);
            System.out.println("    "+ userString);

            System.out.print("Input your symbol:\n>> ");
            userChar = console.next().charAt(0);
            positionUserChar = inSecret(userChar);

            if(positionUserChar == -1){
                countError++;
            }
            else{
                int nextPosUserChar;
                for(int i = positionUserChar; i < secret.length(); i++){
                    nextPosUserChar = secret.indexOf(userChar, i);
                    if(nextPosUserChar != -1){
                        userString.set(nextPosUserChar, userChar);
                    }
                }
                userString.set(positionUserChar, userChar);
                if(!userString.contains('_')){
                    break;
                }
            }
        }while (countError < 6);

        if(countError == 6){
            PrinterGallows.printGallow(countError);
            System.out.println("YOU LOSE\nWord: " + secret);
        }
        else{
            System.out.println("YOU WIN!\nWord: " + secret);
        }
    }
    public int inSecret(char symbol){
        return secret.indexOf(symbol);
    }
}
