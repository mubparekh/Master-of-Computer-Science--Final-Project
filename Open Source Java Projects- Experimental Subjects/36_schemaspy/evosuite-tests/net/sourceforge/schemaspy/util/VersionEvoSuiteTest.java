/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sourceforge.schemaspy.util.Version;

public class VersionEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 net.sourceforge.schemaspy.util.Version.hashCode()I: root-Branch
   * 2 net.sourceforge.schemaspy.util.Version.<init>(Ljava/lang/String;)V: I23 Branch 1 IFNULL L41 - false
   * 3 net.sourceforge.schemaspy.util.Version.<init>(Ljava/lang/String;)V: I36 Branch 2 IFEQ L44 - true
   */
  @Test
  public void test0()  throws Throwable  {
      Version version0 = new Version("");
      assertNotNull(version0);
      
      int int0 = version0.hashCode();
      assertEquals(0, int0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.util.Version.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Version version0 = new Version("");
      String string0 = version0.toString();
      assertEquals("", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.util.Version.<init>(Ljava/lang/String;)V: I23 Branch 1 IFNULL L41 - true
   */
  @Test
  public void test2()  throws Throwable  {
      Version version0 = new Version((String) null);
      assertNull(version0.toString());
  }

  //Test case number: 3
  /*
   * 8 covered goals:
   * 1 net.sourceforge.schemaspy.util.Version.compareTo(Lnet/sourceforge/schemaspy/util/Version;)I: I17 Branch 3 IF_ICMPGE L61 - false
   * 2 net.sourceforge.schemaspy.util.Version.compareTo(Lnet/sourceforge/schemaspy/util/Version;)I: I43 Branch 4 IFEQ L65 - true
   * 3 net.sourceforge.schemaspy.util.Version.equals(Ljava/lang/Object;)Z: I17 Branch 9 IFNE L80 - false
   * 4 net.sourceforge.schemaspy.util.Version.compareTo(Lnet/sourceforge/schemaspy/util/Version;)I: I60 Branch 5 IF_ICMPNE L69 - false
   * 5 net.sourceforge.schemaspy.util.Version.<init>(Ljava/lang/String;)V: I36 Branch 2 IFEQ L44 - false
   * 6 net.sourceforge.schemaspy.util.Version.equals(Ljava/lang/Object;)Z: I3 Branch 7 IFNULL L78 - false
   * 7 net.sourceforge.schemaspy.util.Version.equals(Ljava/lang/Object;)Z: I6 Branch 8 IFNE L78 - true
   * 8 net.sourceforge.schemaspy.util.Version.compareTo(Lnet/sourceforge/schemaspy/util/Version;)I: I17 Branch 3 IF_ICMPGE L61 - true
   */
  @Test
  public void test3()  throws Throwable  {
      Version version0 = new Version("+8");
      assertNotNull(version0);
      
      boolean boolean0 = version0.equals((Object) version0);
      assertEquals(true, boolean0);
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * 1 net.sourceforge.schemaspy.util.Version.compareTo(Lnet/sourceforge/schemaspy/util/Version;)I: I60 Branch 5 IF_ICMPNE L69 - true
   * 2 net.sourceforge.schemaspy.util.Version.compareTo(Lnet/sourceforge/schemaspy/util/Version;)I: I73 Branch 6 IF_ICMPLE L71 - false
   * 3 net.sourceforge.schemaspy.util.Version.equals(Ljava/lang/Object;)Z: I17 Branch 9 IFNE L80 - true
   * 4 net.sourceforge.schemaspy.util.Version.equals(Ljava/lang/Object;)Z: I6 Branch 8 IFNE L78 - true
   */
  @Test
  public void test4()  throws Throwable  {
      Version version0 = new Version("");
      assertNotNull(version0);
      
      Version version1 = new Version("0");
      assertNotNull(version1);
      
      boolean boolean0 = version1.equals((Object) version0);
      assertEquals(false, boolean0);
      assertFalse(version0.equals(version1));
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * 1 net.sourceforge.schemaspy.util.Version.compareTo(Lnet/sourceforge/schemaspy/util/Version;)I: I73 Branch 6 IF_ICMPLE L71 - true
   * 2 net.sourceforge.schemaspy.util.Version.<init>(Ljava/lang/String;)V: I36 Branch 2 IFEQ L44 - false
   * 3 net.sourceforge.schemaspy.util.Version.compareTo(Lnet/sourceforge/schemaspy/util/Version;)I: I17 Branch 3 IF_ICMPGE L61 - true
   * 4 net.sourceforge.schemaspy.util.Version.compareTo(Lnet/sourceforge/schemaspy/util/Version;)I: I60 Branch 5 IF_ICMPNE L69 - true
   */
  @Test
  public void test5()  throws Throwable  {
      Version version0 = new Version("");
      assertNotNull(version0);
      
      Version version1 = new Version("0");
      assertNotNull(version1);
      
      int int0 = version0.compareTo(version1);
      assertFalse(version1.equals(version0));
      assertEquals((-1), int0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.util.Version.equals(Ljava/lang/Object;)Z: I3 Branch 7 IFNULL L78 - true
   */
  @Test
  public void test6()  throws Throwable  {
      Version version0 = new Version("");
      assertNotNull(version0);
      
      boolean boolean0 = version0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 7
  /*
   * 4 covered goals:
   * 1 net.sourceforge.schemaspy.util.Version.equals(Ljava/lang/Object;)Z: I6 Branch 8 IFNE L78 - false
   * 2 net.sourceforge.schemaspy.util.Version.<init>(Ljava/lang/String;)V: I23 Branch 1 IFNULL L41 - false
   * 3 net.sourceforge.schemaspy.util.Version.<init>(Ljava/lang/String;)V: I36 Branch 2 IFEQ L44 - true
   * 4 net.sourceforge.schemaspy.util.Version.equals(Ljava/lang/Object;)Z: I3 Branch 7 IFNULL L78 - false
   */
  @Test
  public void test7()  throws Throwable  {
      Version version0 = new Version("");
      assertNotNull(version0);
      
      boolean boolean0 = version0.equals((Object) "");
      assertEquals(false, boolean0);
  }
}
