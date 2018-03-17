
public class Basic13Test{
    public static void main(String[] args) {
        Basic13 b13 = new Basic13();
        b13.print1to255();
        b13.printOdds();
        b13.printIntsAndSum();
        int[] myArray = {4,5,6,1,-2,-5,99};
        b13.printArray(myArray);
        b13.printMax(myArray);
        b13.printAvg(myArray);
        int[] oddsArray = b13.returnOddsArray();
        int[] squared = b13.squareArray(myArray);
        b13.greaterThanY(myArray,0);
        int[] noNegs = b13.removeNegs(myArray);
        b13.printMaxMinAvg(myArray);
        int[] shifted = b13.shiftLeft(myArray);
        Object[] myMixedArray = {4,5,6,-1,-3};
        Object[] swapped = b13.swapStringForNegatives(myMixedArray);
    }
} 