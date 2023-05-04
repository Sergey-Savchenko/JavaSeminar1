public class exercise2 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        int sum = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i]<0){
                sum = sum + arr[i-1];
            }
        }
        System.out.println(sum);
    } 
}