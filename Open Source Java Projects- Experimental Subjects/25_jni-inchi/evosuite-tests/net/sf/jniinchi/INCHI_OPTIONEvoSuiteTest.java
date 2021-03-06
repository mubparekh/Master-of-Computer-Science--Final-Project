/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_OPTION;

public class INCHI_OPTIONEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase(Ljava/lang/String;)Lnet/sf/jniinchi/INCHI_OPTION;: I14 Branch 1 IF_ICMPGE L146 - true
   * 2 net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase(Ljava/lang/String;)Lnet/sf/jniinchi/INCHI_OPTION;: I14 Branch 1 IF_ICMPGE L146 - false
   * 3 net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase(Ljava/lang/String;)Lnet/sf/jniinchi/INCHI_OPTION;: I25 Branch 2 IFLE L147 - true
   */
  @Test
  public void test0()  throws Throwable  {
      INCHI_OPTION.valueOfIgnoreCase("S-SE;O/(TYh#1");
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase(Ljava/lang/String;)Lnet/sf/jniinchi/INCHI_OPTION;: I25 Branch 2 IFLE L147 - false
   * 2 net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase(Ljava/lang/String;)Lnet/sf/jniinchi/INCHI_OPTION;: I14 Branch 1 IF_ICMPGE L146 - false
   * 3 net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase(Ljava/lang/String;)Lnet/sf/jniinchi/INCHI_OPTION;: I25 Branch 2 IFLE L147 - true
   */
  @Test
  public void test1()  throws Throwable  {
      INCHI_OPTION iNCHI_OPTION0 = INCHI_OPTION.valueOfIgnoreCase("SRac");
      assertEquals(INCHI_OPTION.SRac, iNCHI_OPTION0);
  }
}
