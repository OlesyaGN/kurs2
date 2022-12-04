import java.util.Arrays;

public class Main {
    static int[] arr = generatorRandomArray();
    public static int [] generatorRandomArray(){
        java.util.Random random = new java.util.Random();
        int[] arr = new int[10];
        for (int i = 0;i < arr.length; i ++){
            arr[i]= random.nextInt(100_000)+100_000;
        }
        return arr;
    }
    public static void main (String[] args){
        int [] arr= generatorRandomArray();
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i]+=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}




