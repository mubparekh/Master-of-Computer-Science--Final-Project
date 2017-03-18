/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.io.DefaultSerializer;
import org.jsecurity.io.SerializationException;

public class DefaultSerializerEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.jsecurity.io.DefaultSerializer.deserialize([B)Ljava/lang/Object;: I3 Branch 2 IFNONNULL L53 - true
   * 2 org.jsecurity.io.DefaultSerializer.serialize(Ljava/lang/Object;)[B: I3 Branch 1 IFNONNULL L32 - true
   * 3 org.jsecurity.io.DefaultSerializer.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      byte[] byteArray0 = defaultSerializer0.serialize((Object) "CW2C");
      String string0 = (String)defaultSerializer0.deserialize(byteArray0);
      assertEquals("CW2C", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.jsecurity.io.DefaultSerializer.serialize(Ljava/lang/Object;)[B: I3 Branch 1 IFNONNULL L32 - false
   */
  @Test
  public void test1()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      // Undeclared exception!
      try {
        defaultSerializer0.serialize((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * argument cannot be null.
         */
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.io.DefaultSerializer.deserialize([B)Ljava/lang/Object;: I3 Branch 2 IFNONNULL L53 - false
   * 2 org.jsecurity.io.DefaultSerializer.<init>()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DefaultSerializer defaultSerializer0 = new DefaultSerializer();
      // Undeclared exception!
      try {
        defaultSerializer0.deserialize((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * argument cannot be null.
         */
      }
  }
}
