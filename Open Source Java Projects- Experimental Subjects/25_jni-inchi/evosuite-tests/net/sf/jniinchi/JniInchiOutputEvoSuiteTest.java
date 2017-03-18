/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_RET;
import net.sf.jniinchi.JniInchiOutput;

public class JniInchiOutputEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 net.sf.jniinchi.JniInchiOutput.getMessage()Ljava/lang/String;: root-Branch
   * 2 net.sf.jniinchi.JniInchiOutput.<init>(Lnet/sf/jniinchi/INCHI_RET;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * 3 net.sf.jniinchi.JniInchiOutput.<init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput((-1158), "K", "K", "K", "");
      String string0 = jniInchiOutput0.getMessage();
      assertNotNull(string0);
      assertEquals("InChI_Output: null/K/K/K/", jniInchiOutput0.toString());
      assertEquals("K", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.getAuxInfo()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput((-1158), "K", "K", "K", "");
      String string0 = jniInchiOutput0.getAuxInfo();
      assertNotNull(string0);
      assertEquals("InChI_Output: null/K/K/K/", jniInchiOutput0.toString());
      assertEquals("K", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput(1167, "", "", "", "");
      String string0 = jniInchiOutput0.toString();
      assertEquals("InChI_Output: null////", string0);
      assertNotNull(string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.getLog()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput((-1158), "K", "K", "K", "");
      String string0 = jniInchiOutput0.getLog();
      assertEquals("InChI_Output: null/K/K/K/", jniInchiOutput0.toString());
      assertNotNull(string0);
      assertEquals("", string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.getReturnStatus()Lnet/sf/jniinchi/INCHI_RET;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput((-1158), "K", "K", "K", "");
      jniInchiOutput0.getReturnStatus();
      assertEquals("InChI_Output: null/K/K/K/", jniInchiOutput0.toString());
      assertEquals("", jniInchiOutput0.getLog());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.setInchi(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput((-1158), "K", "K", "K", "");
      jniInchiOutput0.setInchi("K");
      assertEquals("InChI_Output: null/K/K/K/", jniInchiOutput0.toString());
      assertEquals("", jniInchiOutput0.getLog());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.setLog(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput((-1158), "K", "K", "K", "");
      assertEquals("InChI_Output: null/K/K/K/", jniInchiOutput0.toString());
      
      jniInchiOutput0.setLog("K");
      assertEquals("K", jniInchiOutput0.getMessage());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.setAuxInfo(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput((-1158), "K", "K", "K", "");
      assertEquals("K", jniInchiOutput0.getAuxInfo());
      
      jniInchiOutput0.setAuxInfo("");
      assertEquals("", jniInchiOutput0.getLog());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.setRetStatus(Lnet/sf/jniinchi/INCHI_RET;)V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.FATAL;
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput((-1158), "K", "K", "K", "");
      jniInchiOutput0.setRetStatus(iNCHI_RET0);
      assertEquals("InChI_Output: FATAL/K/K/K/", jniInchiOutput0.toString());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.getInchi()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput((-1158), "K", "K", "K", "");
      String string0 = jniInchiOutput0.getInchi();
      assertEquals("InChI_Output: null/K/K/K/", jniInchiOutput0.toString());
      assertNotNull(string0);
      assertEquals("K", string0);
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * 1 net.sf.jniinchi.JniInchiOutput.setMessage(Ljava/lang/String;)V: root-Branch
   * 2 net.sf.jniinchi.JniInchiOutput.<init>(Lnet/sf/jniinchi/INCHI_RET;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * 3 net.sf.jniinchi.JniInchiOutput.<init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput(1167, "", "", "", "");
      jniInchiOutput0.setMessage("");
      assertEquals("", jniInchiOutput0.getAuxInfo());
  }
}