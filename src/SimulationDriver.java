import java.util.Random;

/**
 * Created by jason on 7/5/17.
 */
public class SimulationDriver {
    public static void main(String[] args){
        testMulti();
        System.out.println();
        testYesNo();
    }

    public static void testMulti(){
        String[] options = {"A", "B", "C", "D"};
        Question q = new MultiChoiceQuestion(options);
        IVoteService serv = new IVoteService(q);
        System.out.println("What is your favorite letter?");

        answer(serv);
    }

    public static void testYesNo(){
        String[] options = {"True", "False"};
        Question q = new YesNoQuestion(options);
        IVoteService serv = new IVoteService(q);
        System.out.println("True is the correct answer:");

        answer(serv);
    }

    public static void answer(IVoteService serv){
        Random rand = new Random();
        int numOfStudents = rand.nextInt(100)+10;
        System.out.println("(Number of Students answering: "+ numOfStudents + ")");
        for (int i = numOfStudents; i > 0; i--){
            Person p = new Student(i);
            serv.answer(p);
        }

        serv.printResults();
    }
}
