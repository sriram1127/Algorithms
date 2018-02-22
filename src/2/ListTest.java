import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListTest {
	public static void main(String[] args) {
		/*
		 * ArrayList list = new ArrayList(); list.add(new Integer(1)); list.add(new
		 * Integer(2)); list.add(new Integer(3)); list.add(new Integer(4)); Iterator i =
		 * list.iterator(); Collections.reverse(list); Collections.shuffle(list);
		 * i.next(); i.remove(); while (i.hasNext()) { System.out.println(i.next()); }
		 */
		for (int i = 0; i < 25; i++) {
			char c = 'a';
			for (int j = 0; j <= i; j++, c++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
