public class WordGuessingGame {
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader inputReader;

    public WordGuessingGame() {
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = 0;
        this.inputReader = new InputReader();
    }

    public void play() {
        showWelcome();
        guess(guessedWord);
        showGuessedWord();
        showResult();
    }

    public void showWelcome() {
        System.out.println("Olaaaaaaa");
    }

    private void showGuessedWord() {
        System.out.println(guessedWord);
    }

    private void guess(String letter) {
        inputReader.getChar(letter);
    }

    private void showResult() {
        if (hiddenWord == guessedWord) {
            System.out.println("Numero de tentativas: " + numberOfTries);
        }
    }

    public String getHiddenWord() {
        return hiddenWord;
    }

    public void setHiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    public String getGuessedWord() {
        return guessedWord;
    }

    public void setGuessedWord(String guessedWord) {
        this.guessedWord = guessedWord;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public void setNumberOfTries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }
}
