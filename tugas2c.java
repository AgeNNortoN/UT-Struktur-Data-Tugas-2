
public class tugas2c {
  static class MergeSort {

        void merge(String arr[], int l, int m, int r) {

            int n1 = m - l + 1;
            int n2 = r - m;

            String L[] = new String[n1];
            String R[] = new String[n2];

            for (int i = 0; i < n1; ++i)
                L[i] = arr[l + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[m + 1 + j];

            int i = 0, j = 0;
            int k = l;

            while (i < n1 && j < n2) {

                if (L[i].compareTo(R[j]) >= 0) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        void sort(String arr[], int l, int r) {
            if (l < r) {
                int m = (l + r) / 2;

                sort(arr, l, m);
                sort(arr, m + 1, r);

                merge(arr, l, m, r);
            }
        }
    }

    static void printArray(String arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

  
        String arr[] = {"a8", "a3", "a1", "a5", "a2", "a7", "a4", "a6"};

        System.out.println("Given Array:");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array (Descending):");
        printArray(arr);
    }
}


