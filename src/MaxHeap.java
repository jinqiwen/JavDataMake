/**
 * 堆排序
 * @param <Item>
 */
public class MaxHeap<Item extends Comparable> {
   protected Item[] data;
   protected int capacity;
   protected int count;
    /**
     * 初始化
     */
    public MaxHeap(int capacity){
        data=((Item[])new Comparable[capacity+1]);
        count =0;//数组虽然有空间，但内容为空
        this.capacity=capacity;
    }

    /**
     * 最大堆
     * @param
     */
    //shiftUp
    public  void shiftUp(int k){
             while(k>1&&data[k/2].compareTo(data[k])<0){
                  swap(k,k/2);
                    k/=2;
             }
    }

    //向最大堆中插入一个元素item
    public  void insert(Item item){
        data[count+1]=item;
        count++;
         shiftUp(count);

    }
    // 返回堆中的元素个数
    public int size(){
        return count;
    }

    // 返回一个布尔值, 表示堆中是否为空
    public boolean isEmpty(){
        return count == 0;
    }
    public void swap(int i, int j){
        Item t = data[i];
        data[i]=data[j];
        data[j]=t;
    }

   /* public static void main(String[] args) {
        MaxHeap<Integer> maxHeap=new MaxHeap<Integer>(100);
        for(int i=0;i<15;i++){
            maxHeap.insert((int)Math.random()%100);

        }
        System.out.println(maxHeap);

     }*/
}
