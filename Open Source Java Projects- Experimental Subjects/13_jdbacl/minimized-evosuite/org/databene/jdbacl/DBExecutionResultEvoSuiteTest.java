/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.databene.jdbacl.DBExecutionResult;

public class DBExecutionResultEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.databene.jdbacl.DBExecutionResult.<init>(Ljava/lang/Object;Ljava/lang/Boolean;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DBExecutionResult dBExecutionResult0 = new DBExecutionResult((Object) "false", (Boolean) false);
      assertNotNull(dBExecutionResult0);
  }
}
