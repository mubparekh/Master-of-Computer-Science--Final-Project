/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.crypto.hash;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.crypto.hash.Sha384Hash;

public class Sha384HashEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha384Hash.fromBase64String(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Sha384Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha384Hash.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Sha384Hash sha384Hash0 = Sha384Hash.fromBase64String("SHA-384");
      assertEquals("SHA3AAA=", sha384Hash0.toBase64());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha384Hash.<init>(Ljava/lang/Object;)V: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha384Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Sha384Hash sha384Hash0 = new Sha384Hash((Object) "UTF-8");
      assertEquals("yrZQ9NCRVOcfAB1mtzjinEi2XP1B2g3NkXaQ59S0R8Oh8HevZUR6dq960k5Y29Gw", sha384Hash0.toBase64());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha384Hash.fromHexString(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Sha384Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha384Hash.<init>()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        Sha384Hash.fromHexString((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Sha384Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;)V: root-Branch
   * 2 org.jsecurity.crypto.hash.Sha384Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      Sha384Hash sha384Hash0 = new Sha384Hash((Object) "SHA-384", (Object) "SHA3AAA=");
      assertEquals("b566761e5938e7e9ba6c4827c9cd66908789a8c3981f93d532a2959a97db087ba1d8bb30026cc7f20a072efb50b032ff", sha384Hash0.toHex());
  }
}
