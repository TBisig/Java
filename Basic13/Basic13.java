public class Basic13 {
    public void print1to255() {
        for(int i = 1; i < 256;i++) {
            System.out.println(i);
        }
    }

    public void printOdds() {
        for(int i = 1;i < 256;i+=2) {
            System.out.println(i);
        }
    }
    
    public void printIntsAndSum() {
        int sum = 0;
        for(int i = 0;i<256;i++) {
            sum = sum + i;
            System.out.println(i);
            System.out.println(sum);
        }
    }
    public void printArray(int[] arr) {
        for(int i = 0; i < arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public void printMax(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public void printAvg(int[] arr) {
        int sum = 0;
        for(int i = 0;i< arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
    }

    public int[] returnOddsArray() {
        int[] arr;
        int index = 0;
        arr = new int[128];
        for(int i = 1;i<256;i += 2) {
            arr[index] = i;
            index++;
        }
        return arr;
    }
    public int[] squareArray(int[] arr) {
        for(int i = 0;i<arr.length;i++) {
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }

    public void greaterThanY(int[] arr, int y) {
        int count = 0;
        for(int i = 0;i< arr.length;i++) {
            if(arr[i] > y) {
                count++;
            }
        }
        System.out.println(count);
    }

    public int[] removeNegs(int[] arr) {
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < 0) {
                arr[i] = 0;
            }
        }
        return arr;
    }
    public void printMaxMinAvg(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum / arr.length);
    }

    public int[] shiftLeft(int[] arr) {
        for(int i = 0;i < arr.length - 1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = 0;
        return arr;
    }

    public Object[] swapStringForNegatives(Object[] arr) {
        for(int i = 0;i<arr.length;i++) {
            int x = (int) arr[i];
            if(x < 0) {
                arr[i] = "Dojo";
            }
        }
        return arr;
    }
}