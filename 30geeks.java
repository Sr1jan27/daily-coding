 int cnt = 0;
       Map<Integer, Integer> map = new HashMap<>();
       for(int i: arr){
           map.put(i, map.getOrDefault(i, 0)+1);
       }
       for(int i: arr){
           if(map.containsKey(i-k)){
               cnt += map.get(i-k);
           }
       }
       return cnt;
