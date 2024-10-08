  int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(a<arr[i]){
                b = a;
                a = arr[i];
            }
            else if(b<arr[i]){
                b = arr[i];
            }
        }
        return a+b;
