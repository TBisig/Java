import java.util.ArrayList;
import java.util.HashMap;
public class ExceptionsPractice{
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("goodbye world");
        for(int i = 0;i<myList.size();i++) {
            Integer c = myList.get(i);
        }
    }
}