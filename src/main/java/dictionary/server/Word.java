package dictionary.server;

public class Word {
    private String wordTarget;
    private String wordExplain;

    /**
     * Get the English word.
     *
     * @return English word
     */
    public String getWordTarget() {
        return wordTarget;
    }

    /**
     * Set English word.
     *
     * @param wordTarget English word
     */
    public void setWordTarget(String wordTarget) {
        this.wordTarget = wordTarget;
    }

    /**
     * Get definition of word.
     *
     * @return Vietnamese definition of word
     */
    public String getWordExplain() {
        return wordExplain;
    }

    /**
     * Set Vietnamese definition of the word.
     *
     * @param wordExplain Vietnamese definition
     */
    public void setWordExplain(String wordExplain) {
        this.wordExplain = wordExplain;
    }

    /**
     * Constructor new Word.
     *
     * @param wordTarget English word
     * @param wordExplain Vietnamese definition
     */
    public Word(String wordTarget, String wordExplain) {
        this.wordTarget = wordTarget;
        this.wordExplain = wordExplain;
    }
}