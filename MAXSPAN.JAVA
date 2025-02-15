public int maxSpan(int[] nums) {
    int ans = 0;
    for(int i =0 ; i < nums.length; i++){
      for(int j =0; j < nums.length; j++){
              if (nums[i] == nums[j]) {
          int temp = j-i+1;
        if(temp > ans){
          ans = temp;
        }
                
              }
      }
    }
    return ans;
  }
  