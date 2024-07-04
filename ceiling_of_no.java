public class ceiling_of_no {

        public static void main(String[] args) {
            int[] nums={4,12,15,19,20};
            int target=16;
            int ans=findEle(nums,target);
            System.out.println(ans);

        }
    public static int findEle(int nums[], int target) {
        if(target>nums[nums.length-1]){
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}

