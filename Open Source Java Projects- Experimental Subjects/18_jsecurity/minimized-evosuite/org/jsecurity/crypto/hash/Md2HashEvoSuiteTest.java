/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.crypto.hash;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.codec.CodecSupport;
import org.jsecurity.crypto.hash.Md2Hash;

public class Md2HashEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md2Hash.fromBase64String(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Md2Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Md2Hash.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Md2Hash md2Hash0 = Md2Hash.fromBase64String("");
      assertEquals("", md2Hash0.toHex());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md2Hash.fromHexString(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Md2Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Md2Hash.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      String string0 = CodecSupport.PREFERRED_ENCODING;
      // Undeclared exception!
      try {
        Md2Hash.fromHexString(string0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Odd number of characters.
         */
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md2Hash.<init>(Ljava/lang/Object;)V: root-Branch
   * 2 org.jsecurity.crypto.hash.Md2Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Md2Hash md2Hash0 = new Md2Hash((Object) "UTF-8");
      assertEquals("6e7125b78644568854bc55d4e8b8a497", md2Hash0.toString());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md2Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;I)V: root-Branch
   * 2 org.jsecurity.crypto.hash.Md2Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      Md2Hash md2Hash0 = new Md2Hash((Object) "MD2", (Object) "MD2", 1269);
      assertEquals("MD2", md2Hash0.getAlgorithmName());
  }
}
