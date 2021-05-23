public class Main {
    public static void main(String[] args) {
        inRaSo(10);
        int[] arr = new int[]{1,6,4,2,4,7};
        inRaMang(arr, 0);
    }
    public static void inRaSo(int i){
        // Break point
        if(i==100) return;
        System.out.println("In ra so: " + i);

        // Recursive
        inRaSo(i+2);
    }

    public static void inRaMang(int[] arr, int index){
        // neo
        if(index==arr.length) return;
        // de quy
        System.out.println("arr: " + arr[index]);
        inRaMang(arr,index+1);
    }

    // giai thua: n! = 1.2.3.4....n

    public static int gt(int n){
        if(n<1){
            return 1;
        } else {
            return n * gt(n-1);
        }
    }

    // divide and conquer

    public static int giaiThua(int n){
        return n > 1 ? giaiThua(n-1)*n : 1;
    }

}
