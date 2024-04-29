package org.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ExamplesOfjUnit5AssertionsTest {
  private final double EPSILON = 0.0000001;

  @Test
  void simpleAssertionExamples() {
    assertEquals(4, 3 + 1);
    assertEquals(4.0, 3.0 + 1.0, EPSILON);
    assertNotEquals(4, 5 + 2);

    assertTrue(6 > 5);
    assertTrue("hello".startsWith("h")) ;
    assertTrue("hello".contains("e")) ;
    assertFalse("hello".contains("v"));

    double[] expectedArray = new double[]{1.0, 5.0, 5.2} ;
    assertArrayEquals(expectedArray, new double[]{1.0, 5.0, 5.2});

    double[] anotherArray = expectedArray ;
    assertSame(expectedArray, anotherArray);

    Object nullObject = null ;
    assertNull(nullObject) ;
  }

  @Test
  void simpleAssertionExamplesWithAssertTrue() {
    assertTrue(4 == 3 + 1);
    assertTrue(4.0 == 3.0 + 1.0);
    assertTrue(4 != 5 + 2);

    assertTrue(6 > 5);
    assertTrue("hello".startsWith("h")) ;
    assertTrue("hello".contains("e")) ;
    assertTrue(!"hello".contains("v"));

    double[] expectedArray = new double[]{1.0, 5.0, 5.2} ;
    assertTrue(Arrays.equals(expectedArray, new double[]{1.0, 5.0, 5.2})) ;

    double[] anotherArray = expectedArray ; assertTrue(expectedArray == anotherArray); assertTrue(expectedArray.equals(anotherArray));
    Object nullObject = null ;
    assertTrue(null == nullObject) ;
  }
}



