public class insertion_sort {
    public static void sort (int arr[]){

        for (int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                }
            }
            arr[j+1]=temp;
        }
    }


    public static void display (int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println( );
    }


    public static void main (String args[]){

        int arr[]={6,5,4,3,2,1};

        System.out.println("array before the sorting : ");
        display(arr);

        sort(arr);

        System.out.println("array after the sorting : ");
        display(arr);
    }
}
