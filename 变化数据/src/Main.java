public class Main {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //2.遍历数组得到每一个元素
        for(int i=0;i<arr.length;i++){
            //i 依次表示数组里的每一个索引
            //arr[i] 依次表示数组里的每一个元素
            //3.对每一个元素进行判断
            if(arr[i]%2==0){
                //偶数变成二分之一
                arr[i]=arr[i]/2;
            }else{
                //奇数扩大两倍
                arr[i]=arr[i]*2;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}