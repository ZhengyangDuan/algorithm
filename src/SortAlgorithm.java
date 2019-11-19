



public class SortAlgorithm {
	public static void main(String[ ] args) {
        
        int[] arr={8,7,6,5,4,3,2,1,0};
        arr = bubble(arr);
        printArray(arr);
        arr = select(arr);
        printArray(arr);
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
    
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
}
