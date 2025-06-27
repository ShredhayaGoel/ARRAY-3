public boolean canBalance(int[] nums) {
  int sum = 0;
  for(int i =0; i < nums.length-1; i++){
    sum +=  nums[i];
      int add = 0;
    for(int j = nums.length - 1; j > i; j--){
      add += nums[j];
    }
  if(sum == add){
        return true;
  }
  }
  return false;
}
