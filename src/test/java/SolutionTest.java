import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void missingNumberExample1() {
    assertEquals(2, sol.missingNumber(new int[]{3,0,1}));
  }
  @Test
  void missingNumberExample2() {
    assertEquals(2, sol.missingNumber(new int[]{0,1}));
  }
  @Test
  void missingNumberExample3() {
    assertEquals(8, sol.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
  }
  @Test
  void missingNumberXORExample1() {
    assertEquals(2, sol.missingNumberXOR(new int[]{3,0,1}));
  }
  @Test
  void missingNumberXORExample2() {
    assertEquals(2, sol.missingNumberXOR(new int[]{0,1}));
  }
  @Test
  void missingNumberXORExample3() {
    assertEquals(8, sol.missingNumberXOR(new int[]{9,6,4,2,3,5,7,0,1}));
  }
}