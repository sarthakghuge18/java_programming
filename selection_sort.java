public class selection_sort {
    public static void sort (int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min_idx=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp=arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=temp;
        }
    }


    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    public static void main(String args[]){

        int arr[]={6,5,4,3,2,1};

        System.out.println("array before the sorting : ");
        display(arr);

        sort(arr);

        System.out.println("array after the sorting : ");
        display(arr);
    }
}
