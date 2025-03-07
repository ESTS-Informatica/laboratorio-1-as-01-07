public class WordGuessingGame {
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader inputReader;
    private WordGenerator wordGenerator;

    public WordGuessingGame() {
        this.wordGenerator = new WordGenerator();
        this.hiddenWord = wordGenerator.generateWord();
        this.guessedWord = initializeGuessedWord();
        this.numberOfTries = 0;
        this.inputReader = new InputReader();
    }

    public void play() {
        showWelcome();
        while (!guessedWord.equals(hiddenWord)) {
            guess();
            showGuessedWord();
            numberOfTries++;
        }
        showResult();
    }

    public void showWelcome() {
        System.out.println("Olaaaaaaa");
    }

    private void showGuessedWord() {
        System.out.println(guessedWord);
    }

    private void guess() {
        char guessChar = inputReader.getChar("Guess a letter: ");
        boolean found = false;
        StringBuilder newGuessedWord = new StringBuilder(guessedWord);
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (hiddenWord.charAt(i) == guessChar && guessedWord.charAt(i) == '_') {
                newGuessedWord.setCharAt(i, guessChar);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Incorrect guess!");
        }
        guessedWord = newGuessedWord.toString();
    }

    private void showResult() {
        if (guessedWord.equals(hiddenWord)) {
            System.out.println("Parabéns! :D");
            System.out.println("Numero de tentativas: " + numberOfTries);
            reset();
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

    private String initializeGuessedWord() {
        StringBuilder guessed = new StringBuilder();
        for (int i = 0; i < hiddenWord.length(); i++) {
            guessed.append("_");
        }
        return guessed.toString();
    }

    public void reset() {
        hiddenWord = wordGenerator.generateWord();
        guessedWord = initializeGuessedWord();
        numberOfTries = 0;
    }
}
