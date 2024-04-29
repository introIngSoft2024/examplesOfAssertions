package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExamplesOfjUnit5AssertionsTest {
  private final double EPSILON = 0.0000001;

  @Test
  @DisplayName("Examples of jUnit assertions")
  void simpleAssertionExamples() {
    assertEquals(4, 3 + 1);
    assertEquals(4.0, 3.0 + 1.0, EPSILON);
    assertNotEquals(4, 5 + 2);

    assertTrue(6 > 5);
    assertTrue("hello".startsWith("h")) ;
    assertTrue("hello".contains("e")) ;
    assertFalse("hello".contains("v"));

    assertTimeout(Duration.ofMillis(600), () -> Thread.sleep(500)) ; ;

    double[] expectedArray = new double[]{1.0, 5.0, 5.2} ;
    assertArrayEquals(expectedArray, new double[]{1.0, 5.0, 5.2});

    double[] anotherArray = expectedArray ;
    assertSame(expectedArray, anotherArray);

    Object nullObject = null ;
    assertNull(nullObject) ;
  }

  @Test
  @DisplayName("Examples of jUnit assertions using only assertTrue (to avoid)")
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



