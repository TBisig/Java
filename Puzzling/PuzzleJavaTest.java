import java.util.ArrayList;
public class PuzzleJavaTest{
    public static void main(String[] args) {
        PuzzleJava pj = new PuzzleJava();
        int[] myArray = {3,5,1,7,9,8,13,25,32};
        ArrayList<Integer> newArray = pj.greaterThan10(myArray);
        String[] nameArray = {"Tyler", "Elliot", "Britt", "Jeff"};
        ArrayList<String> shuffledArray = pj.shuffleNames(nameArray);
        pj.allLetters();
        int[] randomNums = pj.randomNums();
        int[] sortedNums = pj.sortedRandomNums();
        String randomString = pj.randomString();
        String[] randomStrings = pj.arrayOfRandomStrings();
    }
}