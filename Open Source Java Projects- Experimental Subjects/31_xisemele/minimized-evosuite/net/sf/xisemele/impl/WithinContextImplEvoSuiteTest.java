/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xisemele.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.xisemele.impl.WithinContextImpl;

public class WithinContextImplEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.WithinContextImpl.stop()V: root-Branch
   * 2 net.sf.xisemele.impl.WithinContextImpl.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      WithinContextImpl withinContextImpl0 = new WithinContextImpl();
      withinContextImpl0.stop();
      assertEquals(false, withinContextImpl0.enabled());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.WithinContextImpl.start()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      WithinContextImpl withinContextImpl0 = new WithinContextImpl();
      withinContextImpl0.start();
      assertEquals(true, withinContextImpl0.enabled());
  }
}
