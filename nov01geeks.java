 Arrays.sort(arr);
        int n = arr.length;
        
        long[] reordered = new long[n];
        int left = 0;
        int right = n-1;
        for(int i=0; i<n; i++){
            reordered[i] = (i%2==0) ? arr[left++] : arr[right--];
        }
        
        long maxSum = 0;
        for(int i=0; i<n; i++){
            maxSum += Math.abs(reordered[i] - reordered[(i+1)%n]);
        }
        
        return maxSum;
