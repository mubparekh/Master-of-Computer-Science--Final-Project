/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sourceforge.schemaspy.ui.DbTypeSelectorModel;

public class DbTypeSelectorModelEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.ui.DbTypeSelectorModel.<init>(Ljava/lang/String;)V: I39 Branch 1 IFEQ L42 - false
   * 2 net.sourceforge.schemaspy.ui.DbTypeSelectorModel.<init>(Ljava/lang/String;)V: I64 Branch 2 IFLE L46 - true
   */
  @Test
  public void test0()  throws Throwable  {
      DbTypeSelectorModel dbTypeSelectorModel0 = null;
      try {
        dbTypeSelectorModel0 = new DbTypeSelectorModel("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}