public class NumerosArray {
    public static void main(String[] args) {
        int[] a={1,2,1,2,1,2,3,4,54,6};
        int i=0;
        try {
            for (; ; ) {
                System.out.println(a[i++]);
            }
        } catch (ArrayIndexOutOfBoundsException ai){

        }

    }
}
