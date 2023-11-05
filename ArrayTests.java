import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    assertArrayEquals(new int[]{ 3 }, ArrayExamples.reverseInPlace(input1));

    int[] input2 = { 3, 6 , 5, 7 };
    assertArrayEquals(new int[]{ 7, 5, 6, 3 }, ArrayExamples.reverseInPlace(input2));
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = { 3, 6 , 5, 7 };
    assertArrayEquals(new int[]{ 7, 5, 6, 3 }, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest_Failure(){
    double[] input = {1.0, 1.0, 3.0, 4.0};
    double result = ArrayExamples.averageWithoutLowest(input);
    assertEquals(3.5, result, 0.0001);
  }

  @Test
  public void testAverageWithoutLowerst_Success(){
    double[] input = {2.0, 3.0, 4.0};
    double result = ArrayExamples.averageWithoutLowest(input);
    assertEquals(3.5, result, 0.0001);

  }
  
}
