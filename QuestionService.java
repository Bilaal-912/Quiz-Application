import java.util.Scanner;
public class QuestionService {
      Question[] questions = new Question[5];
      String selection[] = new String[5];

      public QuestionService(){
            questions[0]=new Question(1,"When was Java introduced?","Java","CPP","Python","Ruby","Java");
            questions[1]=new Question(2,"What is size of int","1","2","3","4","4");
            questions[2]=new Question(3,"What is size of char","1","2","3","4","1");
            questions[3]=new Question(4,"What was Java's old name","Java","Hat","Zebra","Oak","Oak");
            questions[4]=new Question(5,"Who bought Java","Me","Jon Systems","Sun","Moon","Sun");            
      }

      public void playQuiz(){
            int i=0;
            for(Question q :questions){
                  System.out.println("Question No:"+q.getId());
                  System.out.println(q.getQuestion());
                  System.out.println(q.getOpt1());
                  System.out.println(q.getOpt2());
                  System.out.println(q.getOpt3());
                  System.out.println(q.getOpt4());
                  System.out.print("Enter your choice:");
                  Scanner sc = new Scanner(System.in);
                  selection[i++]=sc.nextLine();
            }
            
            
      }
      public void printScore(){
            int score=0;
            for (int i = 0; i < questions.length; i++) {
                Question que = questions[i];
                String answer=que.getAnswer();
                String userAnswer=selection[i];

                if(answer.equals(userAnswer)){
                  score++;
                }
            }
            System.err.println("Your score is:"+score);
      }
}
