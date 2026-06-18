import java.util.Scanner;

public class QuestionService {
  Question questions[] = new Question[5];
  String selection[] = new String[5];

  public QuestionService() {

    questions[0] = new Question(1, "Which of the following is NOT a valid access modifier in Java?", "public",
        "private", "protected", "friendly", "friendly");

    questions[1] = new Question(2, "What is the size of an int in Java?", "2 bytes", "4 bytes", "8 bytes",
        "Depends on system", "4 bytes");

    questions[2] = new Question(3, "Which keyword is used to inherit a class in Java?", "implement", "extends",
        "inherits", "super", "extends");

    questions[3] = new Question(4, "What will happen if the main method is not declared as static?",
        "Program runs normally", "Compilation error", "Runtime error", "JVM cannot call the method",
        "JVM cannot call the method");

    questions[4] = new Question(5,"Which of the following is used to achieve abstraction in Java?", "Classes only",
        "Interfaces only", "Abstract classes and Interfaces", "Constructors", "Abstract classes and Interfaces");
  }

  public void playQuiz() {
    int i = 0;
    for (Question q : questions) {
      System.out.println("Question no. : " + q.getId());
      System.out.println(q.getQuestion());
      System.out.println(q.getOpt1());
      System.out.println(q.getOpt2());
      System.out.println(q.getOpt3());
      System.out.println(q.getOpt4());
      Scanner sc = new Scanner(System.in);
      selection[i] = sc.nextLine();
      i++;
    }

    for (String s : selection) {
      System.out.println(s);
    }
  }

  public void printScore() {
    int score = 0;
    for (int i = 0; i < questions.length; i++) {
      Question que = questions[i];
      String actualAnswer = que.getAnswer();
      String userAnswer = selection[i];

      if (actualAnswer.equals(userAnswer)) {
        score++;
      }
    }
    System.out.println("Your score is : " + score);
  }
}
