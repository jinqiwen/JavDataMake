public class SelectionSort {
    public static void  sort(Comparable[] arr){
        int n=arr.length;

        for(int i=0; i<n;i++){
            //i在[i,n）之间排序
            for(int j =i+1;j<n;j++){
                if(arr[i].compareTo(arr[j])<0){
                    BigToLess(arr,i ,j);
                }
            }
        }

    }
    public static void BigToLess(Object[] arr,int i ,int j){
        Object t= arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

    public static void main(String[] args) {
          int n =20000;
          Integer[] arr= SortHelper.generatorArr(n,0,10000);
          /*SortHelper.testSort("InsertSort",arr);*/
          SortHelper.testSort("SelectionSort",arr);

    }

}
