import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.prinln("https://github.com/s29829/pgo-tutorials-01.git");

        Scanner wejscie = new Scanner(System.in);
        System.out.print("Set up number: ");
        int danaLoc = wejscie.nextInt();


        if (danaLoc>0){
            System.out.println("The number is positive");
        }
        if (danaLoc<0){
            System.out.println("The number is negative");
        }
        if (danaLoc==0){
            System.out.println("The value equals 0");
        }

    }
}