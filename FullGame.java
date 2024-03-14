public class FullGame {
    WordGuessingGame wgg = new WordGuessingGame();
    InputReader ir = new InputReader();

    public void play() {
        char playAgain;
        do {
            wgg.reset();
            wgg.play();

            System.out.print("Do you want to play again? (S for Yes, any other key for No): ");
            playAgain = ir.getChar(null);
        } while (playAgain == 'S' || playAgain == 's');
    }

    public static void main(String[] args) {
        FullGame fg = new FullGame();
        fg.play();
    }
}