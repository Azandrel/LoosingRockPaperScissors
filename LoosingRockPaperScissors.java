import java.util.Scanner;

public class LoosingRockPaperScissors {

    public static void main(String[] args) {

        // Game of rock paper scissors where the user always looses no mather what he
        // choose

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello! Let's play rock paper scissors\n");
        System.out.print("Wanna play? type yes or no: ");

        String decision = scan.nextLine().toLowerCase();

        if (decision.equals("yes")) {
            System.out.print("\nGreat! What is Your pick? paper, rock or scissors: ");
            theGame();
        } else {
            System.out.println("Nie? To nara!");
        }

        scan.close();
    }

    public static String theGame() {
        Scanner scan = new Scanner(System.in);
        String playerPick = scan.nextLine().toLowerCase();

        if (playerPick.equals("paper")) {
            System.out.println("\nYou: " + playerPick + " \nComputer: scissors");
            System.out.println("\nI'm sorry You loose. \nLets go again");
        } else if (playerPick.equals("rock")) {
            System.out.println("\nYou: " + playerPick + " \nComputer:paper");
            System.out.println("\nI'm sorry You loose \nLets go again");
        } else {
            System.out.println("\nYou: " + playerPick + "\nComputer: rock");
            System.out.println("\nI'm sorry You loose \nLets go again");
        }
        scan.close();
        return (playerPick);

    }
}

// 1. Pytanie czy gracz chce grać
// 2. ustawienie odpowiedzi wygrywającej dla kompa
// pomyśleć jak napisać loop gdzie będzie grać bez końca