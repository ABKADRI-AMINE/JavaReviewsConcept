public class tri {
    public static void selectionSort(int arr[]){
        int taille= arr.length;
        for(int i=0;i<taille-1;i++){
            int minIndex=i;
            for(int j=i+1;j<taille;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArray(int arr[]){
        int taille=arr.length;
        for(int i=0;i<taille;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={64,25,12,22,11};
        System.out.println("Tableau avant le tri : ");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Tableau après le tri par sélection : ");
        printArray(arr);
    }
}
