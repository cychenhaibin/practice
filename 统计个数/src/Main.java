public class Main {
    public static void main(String[] args) {
        //遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字
        //1.定义一个数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //定义一个变量，用来统计次数
        int count=0;
        //2.遍历数组得到
        for(int i=0;i<arr.length;i++){
            //i 表示数组里面的每一个索引
            //arr[i] 表示数组里面的每一个元素
            //3.判断当前的元素是否为3的倍数，如果是那么统计变量就需要自增一次
            if(arr[i]%3==0){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("数组中能被3整除的数字有"+count+"个");
    }
}