class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int previous = 0;
        int n = intervals.length;
        int ans = 0;
        for(int current=1; current<n; current++){
            if(intervals[current][0] < intervals[previous][1]){
                ans++;
                if(intervals[current][1]<=intervals[previous][1])
                previous = current;
            }
            else{
                previous = current;
            }
        }
        return ans;
    }
}
