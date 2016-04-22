import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Solution {

	public static void main(String[] argh) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}

		// Write your code here
		List<String> list = new LinkedList<>();
		list = Arrays.asList(s);
		Collections.sort(list, new MyComparator());
		s = (String[]) list.toArray();
		
		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}

class MyComparator implements Comparator<String> {
    public int compare(String o1, String o2) {
    	BigDecimal bigInteger1 = new BigDecimal((String)o1);
    	BigDecimal bigInteger2 = new BigDecimal((String)o2);
    	return bigInteger2.compareTo(bigInteger1);
    }
}