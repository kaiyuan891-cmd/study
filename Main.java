public class Main{
    public static void main(String[] args){
        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum = sum + nums[i];
        }
        System.out.println(sum);
        //数组求和
        int max = nums[0];
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println(max);
        Person p = new Person("mike",20);
        System.out.println(p.getAge());
        p.setAge(21);
        System.out.println(p.getAge());
    }
}