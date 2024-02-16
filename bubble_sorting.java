public class bubble_sorting {
    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){

        int arr[]={4,6,3,7,2,7};

        System.out.println("array before sorting : ");
        display(arr);

        sort(arr);
        
        System.out.println("array after sorting : ");
        display(arr);
    }
}
