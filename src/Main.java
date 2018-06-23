



public class Main {
    public static void  compareToInt(Comparable[] arr){
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
        Integer[] arr={3,2,3,5,7,9,4,2,0};
            InsertSort.sort(arr);
      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]);
      }
     /* Student[] d= new Student[4];

       d[0]=new Student("A",92);
       d[1]=new Student("B",72);
       d[2]=new Student("C",82);
       d[3]=new Student("D",88);
       compareToInt(d);
      for(int i=0;i<4;i++){
          System.out.print(d[i]);
      }*/
    }
}
