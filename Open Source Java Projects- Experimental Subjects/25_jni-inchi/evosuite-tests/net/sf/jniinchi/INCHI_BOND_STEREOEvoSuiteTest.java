/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_BOND_STEREO;

public class INCHI_BOND_STEREOEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_BOND_STEREO.getIndx()I: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.DOUBLE_EITHER;
      int int0 = iNCHI_BOND_STEREO0.getIndx();
      assertEquals(3, int0);
  }

  //Test case number: 1
  /*
   * 14 covered goals:
   * 1 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 1 TABLESWITCH L90 Case -6 - true
   * 2 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 2 TABLESWITCH L90 Case -5 - false
   * 3 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 3 TABLESWITCH L90 Case -4 - false
   * 4 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 4 TABLESWITCH L90 Case -3 - false
   * 5 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 5 TABLESWITCH L90 Case -2 - false
   * 6 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 6 TABLESWITCH L90 Case -1 - false
   * 7 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 7 TABLESWITCH L90 Case 0 - false
   * 8 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 8 TABLESWITCH L90 Case 1 - false
   * 9 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 9 TABLESWITCH L90 Case 2 - false
   * 10 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 10 TABLESWITCH L90 Case 3 - false
   * 11 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 11 TABLESWITCH L90 Case 4 - false
   * 12 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 12 TABLESWITCH L90 Case 5 - false
   * 13 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 13 TABLESWITCH L90 Case 6 - false
   * 14 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 14 TABLESWITCH L90 Default-Case - false
   */
  @Test
  public void test1()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.getValue((-6));
      assertEquals(INCHI_BOND_STEREO.SINGLE_2DOWN, iNCHI_BOND_STEREO0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 1 TABLESWITCH L90 Case -6 - false
   * 2 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 3 TABLESWITCH L90 Case -4 - true
   */
  @Test
  public void test2()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.getValue((-4));
      assertEquals(INCHI_BOND_STEREO.SINGLE_2EITHER, iNCHI_BOND_STEREO0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 5 TABLESWITCH L90 Case -2 - true
   */
  @Test
  public void test3()  throws Throwable  {
      INCHI_BOND_STEREO.getValue((-2));
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 6 TABLESWITCH L90 Case -1 - true
   */
  @Test
  public void test4()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.getValue((-1));
      assertEquals(INCHI_BOND_STEREO.SINGLE_2UP, iNCHI_BOND_STEREO0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 7 TABLESWITCH L90 Case 0 - true
   */
  @Test
  public void test5()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.getValue(0);
      assertEquals(INCHI_BOND_STEREO.NONE, iNCHI_BOND_STEREO0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 8 TABLESWITCH L90 Case 1 - true
   */
  @Test
  public void test6()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.getValue(1);
      assertEquals(INCHI_BOND_STEREO.SINGLE_1UP, iNCHI_BOND_STEREO0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 9 TABLESWITCH L90 Case 2 - true
   */
  @Test
  public void test7()  throws Throwable  {
      INCHI_BOND_STEREO.getValue(2);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 10 TABLESWITCH L90 Case 3 - true
   */
  @Test
  public void test8()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.getValue(3);
      assertEquals(INCHI_BOND_STEREO.DOUBLE_EITHER, iNCHI_BOND_STEREO0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 11 TABLESWITCH L90 Case 4 - true
   */
  @Test
  public void test9()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.getValue(4);
      assertEquals(INCHI_BOND_STEREO.SINGLE_1EITHER, iNCHI_BOND_STEREO0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 12 TABLESWITCH L90 Case 5 - true
   */
  @Test
  public void test10()  throws Throwable  {
      INCHI_BOND_STEREO.getValue(5);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 13 TABLESWITCH L90 Case 6 - true
   * 2 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 14 TABLESWITCH L90 Default-Case - false
   */
  @Test
  public void test11()  throws Throwable  {
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.getValue(6);
      assertEquals(INCHI_BOND_STEREO.SINGLE_1DOWN, iNCHI_BOND_STEREO0);
  }

  //Test case number: 12
  /*
   * 14 covered goals:
   * 1 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 14 TABLESWITCH L90 Default-Case - true
   * 2 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 1 TABLESWITCH L90 Case -6 - false
   * 3 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 2 TABLESWITCH L90 Case -5 - false
   * 4 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 3 TABLESWITCH L90 Case -4 - false
   * 5 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 4 TABLESWITCH L90 Case -3 - false
   * 6 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 5 TABLESWITCH L90 Case -2 - false
   * 7 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 6 TABLESWITCH L90 Case -1 - false
   * 8 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 7 TABLESWITCH L90 Case 0 - false
   * 9 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 8 TABLESWITCH L90 Case 1 - false
   * 10 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 9 TABLESWITCH L90 Case 2 - false
   * 11 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 10 TABLESWITCH L90 Case 3 - false
   * 12 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 11 TABLESWITCH L90 Case 4 - false
   * 13 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 12 TABLESWITCH L90 Case 5 - false
   * 14 net.sf.jniinchi.INCHI_BOND_STEREO.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_STEREO;: I3 Branch 13 TABLESWITCH L90 Case 6 - false
   */
  @Test
  public void test12()  throws Throwable  {
      INCHI_BOND_STEREO.getValue(1259);
  }
}
