 // code here
        ArrayList<int[]> ans = new ArrayList<>();
        boolean inserted = false;
        for(int[] interval : intervals){
            if(interval[1]<newInterval[0])
            ans.add(interval);
            else if(interval[0]>newInterval[1]){
                if(!inserted){
                    ans.add(newInterval);
                    inserted=true;
                }
                ans.add(interval);
            }
            else{
                newInterval[0]=Math.min(newInterval[0], interval[0]);
                newInterval[1]=Math.max(newInterval[1], interval[1]);
            }
        }
        if(!inserted)
            ans.add(newInterval);
        return ans;
