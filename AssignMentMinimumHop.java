package com.info.psguide.utility;

public class AssignMentMinimumHop {
   public static int minHops(int arr[], int src, int destination)
    {
        // Base case: when source
        // and destination are same
        if (destination == src)
            return 0;

        // When nothing is reachable
        // from the given source
        if (arr[src] == 0)
            return Integer.MAX_VALUE;

        // Traverse through all the points
        // reachable from arr[l]. Recursively
        // get the minimum number of jumps
        // needed to reach arr[h] from these
        // reachable points.
        int min = Integer.MAX_VALUE;
        for (int i = src + 1; i <= destination
                && i <= src + arr[src];
             i++) {
            int jumps = minHops(arr, i, destination);
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
                min = jumps + 1;
        }
        return min;
    }
}
