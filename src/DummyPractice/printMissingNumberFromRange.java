package DummyPractice;

public class printMissingNumberFromRange {
	public static void main(String[] args) {
	    int[] a = {1, 4, 2, 7, 9, 3};
	    int range = 10;

	    for (int i = 0; i < range; i++) {
	        for (int j = 0; j < a.length; j++) {
	            if (i == a[j]) {
	                System.out.println(a[j]);
	            }
	        }
	    }
	}}

