import java.util.Random;

/**
 * Created by jason on 7/5/17.
 */
public class Student implements Person {

    private int ID;

    public Student(int i) {
        ID = i;
    }

    @Override
    public void setID(int a) {
        ID = a;
    }

    @Override
    public int getID() {
        return ID;
    }
}
