/**
 * 最简单的排序
 */
public class InsertSort {
    public static  void  sort(Comparable arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) > 0) {
                    swap(arr, j, j-1);
                } else break;
            }

        }
    }
    public static void swap(Object[] arr,int i,int j){
        Object t =arr[i] ;
          arr[i]=arr[j] ;
          arr[j]=t;
    }
}
