
public class tugas2d 
{
   static class CountingSort 
   {

        void sort(String arr[]) 
        {

            int n = arr.length;
            int num[] = new int[n];
            int max = 0;

            for (int i = 0; i < n; i++) {
                String s = arr[i].toLowerCase(); 
                num[i] = Integer.parseInt(s.replaceAll("[^0-9]", ""));
                if (num[i] > max)
                    max = num[i];
            }
            int count[] = new int[max + 1];
            String output[] = new String[n];

            for (int i = 0; i <= max; i++)
                count[i] = 0;

            for (int i = 0; i < n; i++)
                count[num[i]]++;

            for (int i = 1; i <= max; i++)
                count[i] += count[i - 1];

            for (int i = n - 1; i >= 0; i--) {
                output[count[num[i]] - 1] = arr[i];
                count[num[i]]--;
            }

            for (int i = 0; i < n; i++)
                arr[i] = output[i];

            for (int i = 0; i < n / 2; i++) {
                String temp = arr[i];
                arr[i] = arr[n - 1 - i];
                arr[n - 1 - i] = temp;
            }
        }

        public static void main(String args[]) 
        {

            CountingSort ob = new CountingSort();
            
            String arr[] = {"A7", "a3", "B1", "a10", "C2", "f6", "A5"};

            ob.sort(arr);

            System.out.print("Sorted String array (DESC) : ");
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

    
