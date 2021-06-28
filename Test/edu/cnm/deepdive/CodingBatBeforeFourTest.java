package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatBeforeFour.pre4;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatBeforeFourTest {

  private int[][] preParams = {
      {1, 2, 4, 1},
      {3, 1, 4},
      {1, 4, 4},
      {1, 4, 4, 2},
      {1, 3, 4, 2, 4},
      {4, 4},
      {3, 3, 4},
      {1, 2, 1, 4},
      {2, 1, 4, 2},
      {2, 1, 2, 1, 4, 2}
  };

  private int[][] preExpected = {
      {1, 2},
      {3, 1},
      {1},
      {1},
      {1, 3},
      {},
      {3, 3},
      {1, 2, 1},
      {2, 1},
      {2, 1, 2, 1}
  };

  @Test
  void preTest() {
    for (int i = 0; i < preParams.length; i++) {
      String actual = Arrays.toString(pre4(preParams[i]));
      Assertions.assertEquals(actual, Arrays.toString(preExpected[i]));
    }
  }

}