class solution{
public static void arrange(int[] arr){
    int idx = 0;
    for(int i=0; i<arr.length; i++){
      if(arr[i] < 0){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
        idx++;
      }
    }
}
}
      
