import java.util.HashMap;

/**
 * Created by jason on 7/5/17.
 */
public class YesNoQuestion extends Question{
    public YesNoQuestion(){
        this(new String[2]);
    }
    public YesNoQuestion(String[] s){
        if (s.length != 2) throw new RuntimeException("Invalid options");
        this.options = s;
    }
}
