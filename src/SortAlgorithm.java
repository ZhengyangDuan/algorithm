
public class SortAlgorithm {
	public static void main(String[ ] args) {
        
        int[] arr={10,9,8,7,6,5,4,3,2,1,0};
        printArray(quicksort(arr,0,arr.length-1));
        printArray(bubble(arr));
        printArray(select(arr));
        printArray(heapsort(arr)); 
        
    }
    static int[] bubble(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                int temp = arr[j];
                if (temp>arr[j+1]){
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    } 
    
    static int[] select(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int temp = arr[i];
            for(int j=i;j<n;j++){
                if(arr[j]<arr[i]){
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            
        }
        
        return arr;
    }
    static int[] heapsort(int[] arr) {
    	 int n = arr.length; 
    	  
         for (int i = n / 2 - 1; i >= 0; i--) 
             heapify(arr, n, i); 
   
         for (int i=n-1; i>=0; i--) 
         { 

             int temp = arr[0]; 
             arr[0] = arr[i]; 
             arr[i] = temp; 
   
   
             heapify(arr, i, 0); 
         }
         return arr;
    }
    static void heapify(int[] arr, int n, int i) {
    	int largest = i;
        int l = 2*i + 1; 
        int r = 2*i + 2; 
  
 
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 

        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
  
        if (largest != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
  
            heapify(arr, n, largest); 
        }
    } 
    static int partition(int[] arr, int low, int high) {
    	int pivot = arr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1;
    }
    
    static int[] quicksort(int[] arr, int low, int high) {
    	if (low < high) 
        { 

            int pi = partition(arr, low, high); 
            quicksort(arr, low, pi-1); 
            quicksort(arr, pi+1, high); 
        } 
    	return arr;
    }
    
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
}
