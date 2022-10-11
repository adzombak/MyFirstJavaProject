public class DataTypesDemo {
    public static void main(String[] args) {

        int[] a = new int[] { 13, 6, 9, 12, 211};
        int max = a[0];
        for(int i = 1; i < a.length;i++) { if(a[i] > max)
        {
            max = a[i];
        }
        }


        System.out.println("The Largest Number is: " + max);
    }
}