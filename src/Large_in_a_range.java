import java.util.*;


public class Large_in_a_range
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array_1 element : ");
        int size_1 = sc.nextInt();
        int[] arr = new int[size_1];
        System.out.print("Enter the array Element : ");
        for(int i=0;i<size_1;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> lst = new ArrayList<Integer>();
        int min = Integer.MIN_VALUE;
        for(int i=size_1-1;i>=0;i--){
            if (min<=arr[i]){
                lst.add(arr[i]);
                min = arr[i];
            }
        }
        reverse(lst);
    }
    public static void reverse(ArrayList lst)
    {
        int i = 0;
        int j = lst.size()-1;
        while(i<j)
        {
            int temp = (int) lst.get(i);
            lst.set(i,lst.get(j));
            lst.set(j,temp);
            i++;
            j--;
        }
        System.out.println(lst);

    }
}
