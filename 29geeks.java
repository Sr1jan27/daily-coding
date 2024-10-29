public static int partition(ArrayList<Integer> arr, int low, int high) {
    // Median-of-three pivot selection
        int mid = low + (high - low) / 2;
        int pivotIndex = low;
        
        if (arr.get(low) > arr.get(mid)) {
            pivotIndex = mid;
        }
        if (arr.get(low) > arr.get(high)) {
            pivotIndex = high;
        }
        if (arr.get(mid) > arr.get(high)) {
            pivotIndex = high;
        }
    
        // Move pivot to the start
        int pivot = arr.get(pivotIndex);
        Collections.swap(arr, low, pivotIndex);
    
        int left = low + 1;
        int right = high;
    
        while (true) {
            while (left <= high && arr.get(left) <= pivot) {
                left++;
            }
            while (right > low && arr.get(right) > pivot) {
                right--;
            }
            if (left >= right) {
                break;
            }
            Collections.swap(arr, left, right);
        }
        
        Collections.swap(arr, low, right);
        return right; // Return the index of the pivot
    }
    
    public static void quicksort(ArrayList<Integer> arr, int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);
            quicksort(arr, low, pidx - 1);
            quicksort(arr, pidx + 1, high);
        }
    }

    public static ArrayList<Integer> qs(ArrayList<Integer> arr) {
        if (arr.size() <= 1) return arr;
        quicksort(arr, 0, arr.size() - 1);
        return arr;
    }

    public static Node quickSort(Node node) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        Node temp = node;
        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }
        
        ArrayList<Integer> sortedArr = qs(arr);
        
        Node dummy = new Node(-1);
        Node current = dummy;
        
        for (Integer value : sortedArr) {
            current.next = new Node(value);
            current = current.next;
        }
        
        return dummy.next;
    }
