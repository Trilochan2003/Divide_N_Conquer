
  class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int currFuel = 0;
        int TotalCost = 0, TotalFuel = 0;

        for(int i=0; i<gas.length; i++)
        TotalFuel += gas[i];

        for(int i=0; i<cost.length; i++)
        TotalCost += cost[i];

        if(TotalFuel < TotalCost)
        return -1;

        for(int i=0; i<gas.length; i++){
            currFuel += (gas[i]-cost[i]);
            if(currFuel < 0){
                start = i+1;
                currFuel = 0;
            }
        }
        return start;
    }
}
