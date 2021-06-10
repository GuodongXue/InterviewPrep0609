import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static int[] twoSum(int[] nums, int target){

        if(nums.length==0){
            return null;
        }
        for(int i = 0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){

                    /*res[0]= i;
                    res[1]=j;*/
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public static int[] twoSum1(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], i);

        }
        for(int i = 0; i<nums.length; i++){
            int res = target-nums[i];
            if(map.containsKey(res) && map.get(res)!=i){
                return new int[]{i, map.get(res)};
            }

        }
        return null;
    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        int res[] = twoSum1(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
