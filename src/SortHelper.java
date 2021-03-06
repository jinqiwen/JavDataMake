import java.lang.reflect.Method;

public class SortHelper {
    /**
     * 构造随机数组生成器
     * @param n 返回的数组元素个数
     * @param start   起始数字位置
     * @param end 末尾数字位置
     * @return  数组
     */
    public static Integer[] generatorArr(int n,int start, int end){
         Integer[] arr=new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=(int)(Math.random()*(end-start+1)+end);

        }
        return arr;
    }
    //遍历打印arr的内容
    public static void printArray(Object arr[]){
            int n =arr.length;
            for(int i=0;i<n;i++){
                System.out.print(arr[i]);
            }
    }
    //判断arr数组是否有序
    public static boolean isSorted(Comparable arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i].compareTo(arr[i+1])>0){
                return false;
            }
        }
        return true;
    }
    // 测试sortClassName所对应的排序算法排序arr数组所得到结果的正确性和算法运行时间
    public static void testSort(String sortClassName, Comparable[] arr){

        // 通过Java的反射机制，通过排序的类名，运行排序函数
        // * 依然是，使用反射机制并不是这个课程的重点, 大家也完全可以使用自己的方式书写代码, 最终只要能够测试出自己书写的算法的效率即可
        // * 推荐大家阅读我在问答区向大家分享的一个学习心得: 【学习心得分享】请大家抓大放小，不要纠结于C++语言的语法细节
        // * 链接: http://coding.imooc.com/learn/questiondetail/4100.html
        try{
            // 通过sortClassName获得排序函数的Class对象
            Class sortClass = Class.forName(sortClassName);
            // 通过排序函数的Class对象获得排序方法
            Method sortMethod = sortClass.getMethod("sort",new Class[]{Comparable[].class});
            // 排序参数只有一个，是可比较数组arr
            Object[] params = new Object[]{arr};

            long startTime = System.currentTimeMillis();
            // 调用排序函数
            sortMethod.invoke(null,params);
            long endTime = System.currentTimeMillis();

            assert isSorted( arr );

            System.out.println( sortClass.getSimpleName()+ " : " + (endTime-startTime) + "ms" );
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
