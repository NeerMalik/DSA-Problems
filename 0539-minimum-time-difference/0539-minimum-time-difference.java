import java.util.List;
import java.util.Arrays;

class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] times = new int[timePoints.size()];
int n = timePoints.size();
       
        for (int i = 0; i < timePoints.size(); i++) {
            String time = timePoints.get(i);
if (time.equals("00:00")) {
                times[i] = 1440; 
            } else {
                int minutes = Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3, 5));
                times[i] = minutes;
            }
        }

       
        Arrays.sort(times);

    
        int minDifference = Integer.MAX_VALUE;
        for (int i = 1; i < times.length; i++) {
            int diff = times[i] - times[i - 1];
            minDifference = Math.min(minDifference, diff);
        }
        int wrapAroundDiff = (1440 + times[0]) - times[n - 1];
        minDifference = Math.min(minDifference, wrapAroundDiff);

        return minDifference;

     
    }
}
