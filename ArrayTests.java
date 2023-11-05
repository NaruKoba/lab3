import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = { 3, 6 , 5, 7 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 7, 5, 6, 3 }, input2);
	}




  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = { 3, 6 , 5, 7 };
    assertArrayEquals(new int[]{ 7, 5, 6, 3 }, ArrayExamples.reversed(input2));
  }
}
