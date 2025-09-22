class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String msg) {
        super(msg);
    }
}

class QuizProcessor {
    public static int calculateScore(String[] correct, String[] user) throws InvalidQuizSubmissionException {
        if (correct.length != user.length) {
            throw new InvalidQuizSubmissionException("Answer length mismatch!");
        }

        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(user[i])) {
                score++;
            }
        }
        return score;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        String[] correctAnswers = {"A", "B", "C", "D", "A"};
        String[] userAnswers1 = {"A", "B", "C", "D", "A"}; // Full marks
        String[] userAnswers2 = {"A", "C", "B", "D", "B"}; // Partial

        List<Integer> scores = new ArrayList<>();

        try {
            scores.add(QuizProcessor.calculateScore(correctAnswers, userAnswers1));
            scores.add(QuizProcessor.calculateScore(correctAnswers, userAnswers2));
        } catch (InvalidQuizSubmissionException e) {
            System.out.println("Quiz Error: " + e.getMessage());
        }

        System.out.println("All Scores: " + scores);
    }
}
