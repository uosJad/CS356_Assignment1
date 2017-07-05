
/**
 * Created by jason on 7/5/17.
 *
 * Abstract class used since shared functionality between questions
 */
public abstract class Question {

    protected String[] options;

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] s) {
        options = s;
    }

    public void setOption(int i, String s) {
        if (i < options.length || i > -1){
            options[i] = s;
        }
        else{
            throw new RuntimeException("Invalid option");
        }
    }

}
