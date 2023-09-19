class Solution{
  public static boolean permut(int[] arr, int[] arr2, int n, int k){
    Arrays.sort(arr1, Collections.reverseOrder());
    Arrays.sort(arr2);

    for(int i=0; i<n; i++){
      if(arr1[i]+arr2[i] < k)
        return false;
    }
    return true;
  }
}
