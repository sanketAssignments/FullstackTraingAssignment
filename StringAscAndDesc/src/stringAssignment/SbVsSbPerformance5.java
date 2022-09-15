package stringAssignment;

public class SbVsSbPerformance5 {

	public static void main(String[] args) {
        long Time = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("afsgsftdstdvddtdgd");
        for (int i = 0; i < 10000; i++) {
            sb.append("gdsfetefdetdfetddd");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - Time) + "ms");
        Time = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Akshay");
        for (int i = 0; i < 10000; i++) {
            sb2.append("gdsfetefdetdfetddd");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - Time) + "ms");
    }
}
