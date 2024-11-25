import java.util.Scanner;

public class PrinterGallows {
    private static String myTab = "\t\t";

    public static void Welcome(){
        Scanner scaner = new Scanner(System.in);
        System.out.print("Are you play in:\n(1) Console\n(2) IDE\n>> ");

        int launch = scaner.nextInt();
        if(launch == 1){
            myTab = "    ";
        }
    }
    public static void printGallow(int countError){
        switch(countError){
            case 0:
                System.out.print("\n\n\n\n\n\n\n\n\n\n" +
                        "\n  ====================\n");
                break;
            case 1:
                System.out.print("\n\n  #" +
                        "\n  #" +
                        "\n  #" +
                        "\n  #" +
                        "\n  #" +
                        "\n  #" +
                        "\n  #" +
                        "\n  #" +
                        "\n  ====================\n");
                break;
            case 2:
                System.out.print("\n\n  ##########" +
                        "\n  #" +
                        "\n  #" +
                        "\n  #" +
                        "\n  #" +
                        "\n  #" +
                        "\n  #" +
                        "\n  #" +
                        "\n  ====================\n");
                break;
            case 3:
                System.out.print("\n\n  ##########" +
                        "\n  #" + myTab + "  /" +
                        "\n  #" + myTab + "  \\" +
                        "\n  #" + myTab + "  /" +
                        "\n  #" +
                        "\n  #" +
                        "\n  #" +
                        "\n  #" +
                        "\n  ====================\n");
                break;
            case 4:
                System.out.print("\n\n  ##########" +
                        "\n  #" + myTab + "  /" +
                        "\n  #" + myTab + "  \\" +
                        "\n  #" + myTab + "  /" +
                        "\n  #" +
                        "\n  #" +
                        "\n  #" +
                        "\n  #" + myTab+ " [=]"+
                        "\n  ====================\n");
                break;
            case 5:
                System.out.print("\n\n  ##########" +
                        "\n  #" + myTab + "  /" +
                        "\n  #" + myTab + "  \\" +
                        "\n  #" + myTab + "  /" +
                        "\n  #" + myTab + "  0" +
                        "\n  #" + myTab + " /|\\" +
                        "\n  #" + myTab + " / \\"+
                        "\n  #" + myTab + " [=]"+
                        "\n  ====================\n");
                break;
            case 6:
                System.out.print("\n\n  ##########" +
                        "\n  #" + myTab + "  /" +
                        "\n  #" + myTab + "  \\" +
                        "\n  #" + myTab + "  /" +
                        "\n  #" + myTab + "  0" +
                        "\n  #" + myTab  + " /|\\" +
                        "\n  #" + myTab + " ( )"+
                        "\n  #" +
                        "\n  ====================\n");
                break;

        }
    }
}
