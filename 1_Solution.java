static void sortByOneSwap(int arr[],
                          int n)
{
  
    for (int i = n - 1; i > 0; i--)
    {
       
        // is not in order
        if (arr[i] < arr[i - 1])
        {
            
            int j = i - 1;
            while (j >= 0 && arr[i] < arr[j])
                j--;
 
            
            int temp = arr[i];
            arr[i] = arr[j + 1];
            arr[j + 1] = temp;
     
            break;
        }
    }
}
