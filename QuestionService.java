public class QuestionService {
      Question[] questions = new Question[5];

      public QuestionService(){
            questions[0]=new Question(1,"When was Java introduced?","Java","CPP","Python","Ruby","Java");
            questions[1]=new Question(2,"What is size of int","1","2","3","4","4");
            questions[2]=new Question(3,"What is size of char","1","2","3","4","1");
            questions[3]=new Question(4,"What was Java's old name","Java","Hat","Zebra","Oak","OAk");
            questions[4]=new Question(5,"Who bought Java","Me","Jon Systems","Sun","Moon","Sun");            
      }

      public void displayQuestions(){
            for(Question q :questions){
                  System.out.println(q);
            }
            
      }
}
