/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sourceforge.schemaspy.Revision;

public class RevisionEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.Revision.toString()Ljava/lang/String;: root-Branch
   * 2 net.sourceforge.schemaspy.Revision.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Revision revision0 = new Revision();
      String string0 = revision0.toString();
      assertEquals("Unknown", string0);
  }
}
