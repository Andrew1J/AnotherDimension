public class ArrayOps{
    public static int sum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static int largest(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            max = Math.max(arr[i],max);
        }
        return max;
    }
    public static int[] sumRows(int[][] matrix){
        int[] sums = new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            sums[i] = sum(matrix[i]);
        }
        return sums;
    }
    public static int[] largestInRows(int[][] matrix){
        int[] large = new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            large[i] = largest(matrix[i]);
        }
        return large;
    }
    public static int sum(int[][] arr){
        return sum(sumRows(arr));
    }
}
