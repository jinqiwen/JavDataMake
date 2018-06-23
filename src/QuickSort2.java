/**
 * 快速排序-双路排序
 */
public class QuickSort2 {

    // 我们的算法类不允许产生任何实例
    private QuickSort2() {
    }
     static  void   quickSort1(Integer a[] , int start ,int end){
         int temp,i ,j;
         if(start>end)
             return;

         temp = a[start] ; //temp中存的就是基准数
         j=end;
         i =start;
         while(i!=j){
             //从右向左遍历，找到比基准值小的值
            while(temp<=a[j] && i<j )
                 j--;
                 //从左向右遍历，找到比基准值大的值
            while (temp >= a[i] && i < j)
                     i++;
            if (i < j)
                //交换两个数在数组中的位置
                swap(a, i, j);

         }
         //最终将基准数归位
         a[start]=a[i];
         a[i]=temp;

        quickSort1(a,start,i-1);//继续处理左边的，这里是一个递归的过程
        quickSort1(a,i+1,end);//继续处理右边的 ，这里是一个递归的过程
    }
    //用于打印数组方法
   static void ArraytoString(Object arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    //交换数组中指定元素的位置
    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    // 测试 QuickSort1
    public static void main(String[] args) {
         Integer[] a  = {3,2,5,6,4,9,7};
        quickSort1(a,0,a.length-1);
        ArraytoString(a);

    }
}