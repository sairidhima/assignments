package Problem2;

import Problem2.Players;

    public class GuessGame {
        public void startGame() {
            boolean game = true;
            int counter = 1;
            while (game) {
                Players player1 = new Players();
                Players player2 = new Players();
                Players player3 = new Players();

                int randomNumber = (int) (Math.random() * 9);
                System.out.println("The random number is: " + randomNumber);

                int player1Guess = player1.guess();
                int player2Guess = player2.guess();
                int player3Guess = player3.guess();

                System.out.println("Player 1 guessed: " + player1Guess);
                System.out.println("Player 2 guessed: " + player2Guess);
                System.out.println("Player 3 guessed: " + player3Guess);

                if (player1Guess == randomNumber) {
                    System.out.println("Player 1 guessed correctly!");
                    game = false;
                } else if (player2Guess == randomNumber) {
                    System.out.println("Player 1 guessed correctly!");
                    game = false;
                } else if (player3Guess == randomNumber) {
                    System.out.println("Player 1 guessed correctly!");
                    game = false;
                } else {
                    System.out.println("Nobody guessed correctly. This is game number: " + counter);
                    game = true;
                }
                counter++;


            }

        }
    }

