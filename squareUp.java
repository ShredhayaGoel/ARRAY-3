public int[] squareUp(int n) {
  int arr[] = new int[n*n];
 for(int i =1; i<= n; i++){
   for(int j =0;j <i; j++){
     arr[n*i-j-1] = j+1;
   }
 }
 return arr;
}