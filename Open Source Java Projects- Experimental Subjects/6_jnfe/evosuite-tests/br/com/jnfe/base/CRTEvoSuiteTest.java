/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import br.com.jnfe.base.CRT;

public class CRTEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.CRT.getValue()C: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      CRT cRT0 = CRT.SIMPLES_NACIONAL;
      char char0 = cRT0.getValue();
      assertEquals('1', char0);
  }
}