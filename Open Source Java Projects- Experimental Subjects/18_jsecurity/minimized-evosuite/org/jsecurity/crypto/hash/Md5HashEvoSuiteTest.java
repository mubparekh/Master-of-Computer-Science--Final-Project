/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.crypto.hash;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.crypto.hash.Md5Hash;

public class Md5HashEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md5Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   * 2 org.jsecurity.crypto.hash.Md5Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Md5Hash md5Hash0 = new Md5Hash((Object) "MD5", (Object) "UTF-8");
      assertEquals("MD5", md5Hash0.getAlgorithmName());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md5Hash.<init>(Ljava/lang/Object;Ljava/lang/Object;I)V: root-Branch
   * 2 org.jsecurity.crypto.hash.Md5Hash.getAlgorithmName()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Md5Hash md5Hash0 = new Md5Hash((Object) "MD5", (Object) "YY1aj1bEIBQvlt/OCtZsHg==", (int) '+');
      assertEquals("735a43b73d097bf69008fbb06bb294f5", md5Hash0.toHex());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md5Hash.fromBase64String(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Md5Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Md5Hash.<init>()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        Md5Hash.fromBase64String((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.jsecurity.crypto.hash.Md5Hash.fromHexString(Ljava/lang/String;)Lorg/jsecurity/crypto/hash/Md5Hash;: root-Branch
   * 2 org.jsecurity.crypto.hash.Md5Hash.<init>()V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        Md5Hash.fromHexString("oVW|u0QR9n$GXEa%");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Odd number of characters.
         */
      }
  }
}
