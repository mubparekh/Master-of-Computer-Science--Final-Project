/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import nu.staldal.lagoon.util.Wildcard;

public class WildcardEvoSuiteTest {


  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.util.Wildcard.isWildcard(Ljava/lang/String;)Z: I5 Branch 1 IFGE L66 - false
   * 2 nu.staldal.lagoon.util.Wildcard.isWildcard(Ljava/lang/String;)Z: I9 Branch 2 IFLT L66 - true
   */
  @Test
  public void test1()  throws Throwable  {
      boolean boolean0 = Wildcard.isWildcard("$]e7f");
      assertEquals(false, boolean0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.util.Wildcard.isWildcard(Ljava/lang/String;)Z: I9 Branch 2 IFLT L66 - false
   * 2 nu.staldal.lagoon.util.Wildcard.isWildcard(Ljava/lang/String;)Z: I5 Branch 1 IFGE L66 - false
   */
  @Test
  public void test2()  throws Throwable  {
      boolean boolean0 = Wildcard.isWildcard(";");
      assertEquals(true, boolean0);
  }

  //Test case number: 3
  /*
   * 7 covered goals:
   * 1 nu.staldal.lagoon.util.Wildcard.matchWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I12 Branch 3 IFEQ L82 - true
   * 2 nu.staldal.lagoon.util.Wildcard.matchWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I12 Branch 3 IFEQ L82 - false
   * 3 nu.staldal.lagoon.util.Wildcard.matchWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I27 Branch 4 IFGE L87 - true
   * 4 nu.staldal.lagoon.util.Wildcard.matchWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I27 Branch 4 IFGE L87 - false
   * 5 nu.staldal.lagoon.util.Wildcard.matchWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I33 Branch 5 IFLE L89 - true
   * 6 nu.staldal.lagoon.util.Wildcard.matchWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I45 Branch 6 IFGT L93 - true
   * 7 nu.staldal.lagoon.util.Wildcard.matchWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I58 Branch 7 IFGT L96 - false
   */
  @Test
  public void test3()  throws Throwable  {
      String string0 = Wildcard.matchWildcard("5*P{A#S-*;D]vA8F4l6", "5*P{A#S-*;D]vA8F4l6");
      assertNull(string0);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.util.Wildcard.matchWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I33 Branch 5 IFLE L89 - false
   * 2 nu.staldal.lagoon.util.Wildcard.matchWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I27 Branch 4 IFGE L87 - false
   */
  @Test
  public void test4()  throws Throwable  {
      String string0 = Wildcard.matchWildcard(")", ")");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.util.Wildcard.matchWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I45 Branch 6 IFGT L93 - false
   * 2 nu.staldal.lagoon.util.Wildcard.matchWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I12 Branch 3 IFEQ L82 - true
   */
  @Test
  public void test5()  throws Throwable  {
      String string0 = Wildcard.matchWildcard("jj*", "j*");
      assertNull(string0);
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 nu.staldal.lagoon.util.Wildcard.matchWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I58 Branch 7 IFGT L96 - true
   * 2 nu.staldal.lagoon.util.Wildcard.matchWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I12 Branch 3 IFEQ L82 - false
   * 3 nu.staldal.lagoon.util.Wildcard.matchWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I27 Branch 4 IFGE L87 - true
   * 4 nu.staldal.lagoon.util.Wildcard.matchWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I45 Branch 6 IFGT L93 - true
   */
  @Test
  public void test6()  throws Throwable  {
      String string0 = Wildcard.matchWildcard("j*", "jjj*");
      assertEquals("jj*", string0);
      assertNotNull(string0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.util.Wildcard.instantiateWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I9 Branch 8 IFGE L122 - true
   */
  @Test
  public void test7()  throws Throwable  {
      String string0 = Wildcard.instantiateWildcard("j*", "j*");
      assertEquals("jj*", string0);
      assertNotNull(string0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.util.Wildcard.instantiateWildcard(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I9 Branch 8 IFGE L122 - false
   */
  @Test
  public void test8()  throws Throwable  {
      String string0 = Wildcard.instantiateWildcard("$]e7f", "$]e7f");
      assertEquals("$]e7f", string0);
      assertNotNull(string0);
  }
}
