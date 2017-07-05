import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by jason on 7/5/17.
 */
public class MultiChoiceQuestion extends Question{
    public MultiChoiceQuestion(int i){
        this(new String[i]);
    }
    public MultiChoiceQuestion(String[] s){
        this.options = s;
    }

}
