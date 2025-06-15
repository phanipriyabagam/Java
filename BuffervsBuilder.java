public class BuffervsBuilder {
    public static void main(String[] args) {
        long startTime, endTime;

        // StringBuffer
        StringBuffer sbf = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sbf.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ms");

        // StringBuilder
        StringBuilder sbl = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sbl.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ms");
    }
}

