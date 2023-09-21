class Solution{
  public static void printMaxActivities(int[] s, int[] f, int n) {
		int i=0,j;
		System.out.print(i+" ");
		
		for(j=0; j<n; j++) {
			if(s[j] >= f[i]) {
				System.out.print(j+" ");
				i = j;
			}
		}
	}
}
