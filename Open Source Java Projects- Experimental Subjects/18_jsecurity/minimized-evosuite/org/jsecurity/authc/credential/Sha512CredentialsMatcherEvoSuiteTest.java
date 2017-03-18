/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authc.credential;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.authc.credential.Sha512CredentialsMatcher;
import org.jsecurity.codec.CodecException;
import org.jsecurity.crypto.hash.Sha512Hash;

public class Sha512CredentialsMatcherEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authc.credential.Sha512CredentialsMatcher.newHashInstance()Lorg/jsecurity/crypto/hash/AbstractHash;: root-Branch
   * 2 org.jsecurity.authc.credential.Sha512CredentialsMatcher.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Sha512CredentialsMatcher sha512CredentialsMatcher0 = new Sha512CredentialsMatcher();
      Sha512Hash sha512Hash0 = (Sha512Hash)sha512CredentialsMatcher0.newHashInstance();
      assertNotNull(sha512Hash0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authc.credential.Sha512CredentialsMatcher.hashProvidedCredentials(Ljava/lang/Object;Ljava/lang/Object;I)Lorg/jsecurity/crypto/hash/Hash;: root-Branch
   * 2 org.jsecurity.authc.credential.Sha512CredentialsMatcher.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Sha512CredentialsMatcher sha512CredentialsMatcher0 = new Sha512CredentialsMatcher();
      Object object0 = new Object();
      // Undeclared exception!
      try {
        sha512CredentialsMatcher0.hashProvidedCredentials((Object) "[]", object0, 0);
        fail("Expecting exception: CodecException");
      } catch(CodecException e) {
        /*
         * The org.jsecurity.crypto.hash.Sha512Hash implementation only supports conversion to byte[] if the source is of type byte[], char[] or String.  The instance provided as a method argument is of type [java.lang.Object].  If you would like to convert this argument type to a byte[], you can 1) convert the argument to a byte[], char[] or String yourself and then use that as the method argument or 2) subclass org.jsecurity.crypto.hash.Sha512Hash and override the objectToBytes(Object o) method.
         */
      }
  }
}