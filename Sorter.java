public class Sorter{
    public static void main(String[] args) {
        int[] array = {4,1,2,7,8,9,10};
        selectionSort(array);
        printarrayay(array);

    }
    public static void sort(int[] array){
        selectionSort(array);
    }

    public static void selectionSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_element = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_element])
                    min_element = j;
            int temp = array[min_element];
            array[min_element] = array[i];
            array[i] = temp;
        }
    }

    public static void sortInsertion(int [] sort_arr){

        for(int i=0;i<sort_arr.length;++i){

          int j = i;

          while(j > 0 && sort_arr[j-1]>sort_arr[j]){

            int key = sort_arr[j];
            sort_arr[j] = sort_arr[j-1];
            sort_arr[j-1] = key;
            j = j-1; 

          }
        }
    }

    // Method to print the elements of an array
    public static void printarrayay(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}