public class DemoArray {

    public static void makeArray() {
        final int arrayMax = 30;

        int[] arrayTest = new int[arrayMax];

        int j = 0;
        do {
            j++;
        } while (j < arrayTest.length);

        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = i*i;    
        }

        for (int i = 0; i < arrayTest.length; i++) {
            System.out.println(""+ arrayTest[i]);
        }
    }
    
}
