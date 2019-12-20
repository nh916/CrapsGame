import java.util.Random;

public class CrapsGame {


    public void turn() {
//        getting the first 2 rolls
        int roll1 = rollDice();
        int roll2 = rollDice();
//        adding up the first two roles and storing them inside of points
        int points = roll1 + roll2;

//        prints out what the two rolls were and what the total was
        System.out.println("Player rolled " + roll1 + " + " + roll2 + " = " + points);

//        checks if the first role was 7 or 11 and tells them they won and games over
        if ((points == 7 || points == 11)) {
//            prints out the Player wins
            System.out.println("Player wins");
//            checks if first role was 2 or 3 or 12 and tells them they lost and games over
        } else if ((points == 2 || points == 3 || points == 12)) {
//            prints out the Player loses
            System.out.println("Player loses");
        } else {
//            creates an infinite while loop until the Player either rolls a 7 which they lose or they get their first role
            while (true) {
//                gets the next rolls with 2 dice
                int newRole1 = rollDice();
                int newRole2 = rollDice();
//                gets the sum total of the next rolls of 2 dice
                int score = newRole1 + newRole2;
//                prints out both dice and the sum total
                System.out.println("Player rolled " + newRole1 + " + " + newRole2 + " = " + score);
//                checks if the sum total of the new roll was 7
                if (score == 7) {
//                    if the sum total of the new roll was 7 then it shows the Player that they lost
                    System.out.println("Player loses");
//                    returns at the end to exit the method and stop the infinite loop
                    return;
                }
//                checks if the new roll was the same as the first roll
                if (score == points) {
//                    if yes then it prints out the player wins
                    System.out.println("Player wins");
//                    returns at the end of the method to exit and stop and infinite loop
                    return;
                }
            }
        }
    }

    public int rollDice() {
//        specifying lower and upper limit
        int lowerLim = 1;
        int upperLim = 6;
//        making a random object
        Random roll = new Random();
//        returning a number that's between 1 and 6 inclusive
        return lowerLim + roll.nextInt(upperLim - lowerLim + 1);
    }


    public static void main(String[] args) {
        /* prints the beginning of the Game */
        System.out.println("Start of Game");
//        making a new object
        CrapsGame crapsGame = new CrapsGame();
//        calls turn method to start the game

        crapsGame.turn();


        //printing at end of the project
        System.out.println("End of project");
    }
}
