import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Mintest {

	@Test
	void test() {
		JUnitTesting obj=new JUnitTesting();
		int array[]=new int[] {100,90 ,80 ,50,5,1};
		int output=obj.Min(array);
		assertEquals(1, output);
	}

}
