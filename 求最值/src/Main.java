public class Main {
    public static void main(String[] args) {
        //定义数组求最大值
        //1.定义数组用来存储
        int[] arr={33,5,22,44,55};
        //2.定义一个变量max用来存储最大值
        int max=arr[0]; //临时认为0索引的数据是最大的
        //3.循环获取数组中的每一个元素
        //拿着每一个元素跟max进行比较
        for(int i=1;i<arr.length;i++){ //循环的开始条件如果是0(int i=0)，那么第一次循环的时候是自己跟自己比一下，对结果没有任何影响，但是效率偏低
            //i 索引 arr[i] 元素
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //4.当循环结束后max记录的就是数组中的最大值
        System.out.println(max);
    }
}
