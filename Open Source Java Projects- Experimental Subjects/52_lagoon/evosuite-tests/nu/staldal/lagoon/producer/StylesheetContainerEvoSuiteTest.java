/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import nu.staldal.lagoon.producer.StylesheetContainer;

public class StylesheetContainerEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.producer.StylesheetContainer.<init>(Z)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      StylesheetContainer stylesheetContainer0 = new StylesheetContainer(true);
      assertEquals(false, stylesheetContainer0.compileDynamic);
      assertEquals(true, stylesheetContainer0.executeDynamic);
  }
}