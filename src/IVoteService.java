import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/**
 * Created by jason on 7/5/17.
 */
public class IVoteService {
    protected Map<Integer, Integer> answers;
    private Question q;

    public IVoteService(Question q){
        this.q = q;
        this.answers = new HashMap<>();
    }

    public void answer(Person p) {
        Random rand = new Random();
        int temp = rand.nextInt(q.getOptions().length);
        answers.put(p.getID(), temp);
    }

    public void printResults() {
        int[] results = getResults();
        for (int i = 0; i < q.getOptions().length; i++){
            System.out.println(q.getOptions()[i] + ": " + results[i]);
        }
    }

    private int[] getResults(){
        int[] printArr = new int[q.getOptions().length];
        Iterator<Integer> ansIt = answers.values().iterator();
        while (ansIt.hasNext()){
            printArr[ansIt.next()]++;
        }
        return printArr;
    }
}
