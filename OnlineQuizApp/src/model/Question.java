public class Question {
    private int id;
    private int quizId;
    private String questionText;
    private String[] options;
    private String correctAnswer;

    public Question(int id, int quizId, String questionText, String[] options, String correctAnswer) {
        this.id = id;
        this.quizId = quizId;
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public int getId() { return id; }
    public int getQuizId() { return quizId; }
    public String getQuestionText() { return questionText; }
    public String[] getOptions() { return options; }
    public String getCorrectAnswer() { return correctAnswer; }
}