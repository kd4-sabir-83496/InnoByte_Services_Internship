public class Attempt {
    private int id;
    private int userId;
    private int quizId;
    private int score;
    private String date;

    public Attempt(int id, int userId, int quizId, int score, String date) {
        this.id = id;
        this.userId = userId;
        this.quizId = quizId;
        this.score = score;
        this.date = date;
    }

    public int getId() { return id; }
    public int getUserId() { return userId; }
    public int getQuizId() { return quizId; }
    public int getScore() { return score; }
    public String getDate() { return date; }
}