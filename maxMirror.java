public int maxMirror(int[] nums) {
  int n = nums.length; int count = 0; int max = 0;
  for(int i =0; i < n ;i++){
    count = 0;
    for(int j=n-1; j >=0 && i+count < n; j-- ){
      if(nums[i+count] == nums[j]){
        count++;
      }
      else{
        if(count > 0){
          max = Math.max(max,count);
          count = 0;
        }
      }
    }
    max = Math.max(max,count);
  }
  return max;
}
