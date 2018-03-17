import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class PuzzleJava {
    public ArrayList<Integer> greaterThan10(int[] arr) {
        ArrayList<Integer> returnArray = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0;i<arr.length;i++) {
            sum += arr[i];
            if(arr[i] > 10) {
                returnArray.add(10);
            }
        }
        System.out.println(sum);
        return returnArray;
    }

    public ArrayList<String> shuffleNames(String[] arr) {
        for(int i = 0;i<arr.length;i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, arr.length);
            String tmp = arr[i];
            arr[i] = arr[randomNum];
            arr[randomNum] = tmp;
        }
        ArrayList<String> returnArray = new ArrayList<String>();
        for(int i = 0;i<arr.length;i++) {
            //if(arr[i].length() > 5) {
            returnArray.add(arr[i]);
            //}
            System.out.println(arr[i]);
        }
        return returnArray;
    }

    public void allLetters() {
        String[] arr;
        arr = new String[26];
        for(int i = 0; i<26;i++) {
            arr[i] = String.valueOf((char)(i + 65));
        }
        for(int i = 0;i<arr.length;i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, arr.length);
            String tmp = arr[i];
            arr[randomNum] = arr[i];
            arr[i] = tmp;
        }
        System.out.println(arr[arr.length-1]);
        String vowels = "AEIOU";
        if(vowels.contains(arr[0])) {
            System.out.println("First letter is a vowel");
        }
        System.out.println(arr[0]);
    }

    public int[] randomNums() {
        int[] arr;
        arr = new int[10];
        for(int i = 0;i<arr.length;i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(55,100);
            arr[i] = randomNum;
        }
        return arr;
    }

    public int[] sortedRandomNums() {
        int[] arr;
        arr = new int[10];
        for(int i = 0;i<arr.length;i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(55,100);
            arr[i] = randomNum;
        }
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
        return arr;
    }

    public String randomString() {
        String str;
        str = "";
        for(int i = 0;i<5;i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0,255);
            str += String.valueOf((char)(randomNum));
        }
        return str;
    }

    public String[] arrayOfRandomStrings() {
        String[] arr;
        arr = new String[10];
        for(int j = 0;j<10;j++) {
            String str;
            str = "";
            for(int i = 0;i<5;i++) {
                int randomNum = ThreadLocalRandom.current().nextInt(0,255);
                str += String.valueOf((char)(randomNum));
            }
            arr[j] = str;
        }
        return arr;
    }
}