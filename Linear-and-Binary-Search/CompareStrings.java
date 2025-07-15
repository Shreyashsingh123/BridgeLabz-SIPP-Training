public class CompareStrings {
    public static void main(String[] args) {
        int n = 1000000;

        long t1 = System.nanoTime();
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < n; i++) sb1.append("hello");
        long t2 = System.nanoTime();
        System.out.println("StringBuffer time: " + (t2 - t1) + " ns");

        long t3 = System.nanoTime();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < n; i++) sb2.append("hello");
        long t4 = System.nanoTime();
        System.out.println("StringBuilder time: " + (t4 - t3) + " ns");
    }
}
