/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.lavalamp.device;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import net.sf.lavalamp.device.Crash;
import net.sf.lavalamp.device.Device;
import net.sf.lavalamp.device.DummyDevice;

public class CrashEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.device.Crash.perform(Ljava/util/List;Lnet/sf/lavalamp/device/Device;)V: root-Branch
   * 2 net.sf.lavalamp.device.Crash.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Crash crash0 = new Crash();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      DummyDevice dummyDevice0 = new DummyDevice();
      // Undeclared exception!
      try {
        crash0.perform((List<String>) linkedList0, (Device) dummyDevice0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * error!
         */
      }
  }
}
