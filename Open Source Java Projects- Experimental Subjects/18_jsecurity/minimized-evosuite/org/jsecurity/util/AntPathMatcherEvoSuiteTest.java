/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.util.AntPathMatcher;

public class AntPathMatcherEvoSuiteTest {


  //Test case number: 0
  /*
   * 13 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.matches(Ljava/lang/String;Ljava/lang/String;)Z: root-Branch
   * 2 org.jsecurity.util.AntPathMatcher.<init>()V: root-Branch
   * 3 org.jsecurity.util.AntPathMatcher.match(Ljava/lang/String;Ljava/lang/String;)Z: root-Branch
   * 4 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I12 Branch 4 IF_ICMPEQ L112 - true
   * 5 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I57 Branch 5 IF_ICMPGT L125 - false
   * 6 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I60 Branch 6 IF_ICMPGT L125 - false
   * 7 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I72 Branch 7 IFLE L127 - true
   * 8 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I84 Branch 8 IFNE L130 - false
   * 9 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I50 Branch 40 IF_ICMPGE L258 - true
   * 10 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I50 Branch 40 IF_ICMPGE L258 - false
   * 11 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I59 Branch 41 IF_ICMPNE L259 - true
   * 12 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I74 Branch 42 IFNE L265 - false
   * 13 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I79 Branch 43 IF_ICMPEQ L267 - false
   */
  @Test
  public void test0()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.matches("(", "o.MpMW?XkF;=71#O1{");
      assertEquals(false, boolean0);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.matchStart(Ljava/lang/String;Ljava/lang/String;)Z: root-Branch
   * 2 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I79 Branch 43 IF_ICMPEQ L267 - true
   * 3 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I91 Branch 44 IF_ICMPGT L270 - false
   * 4 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I102 Branch 45 IF_ICMPEQ L272 - false
   * 5 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I109 Branch 46 IF_ICMPEQ L273 - false
   */
  @Test
  public void test1()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.matchStart("X", "5");
      assertEquals(false, boolean0);
  }

  //Test case number: 3
  /*
   * 13 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I185 Branch 54 IF_ICMPEQ L300 - false
   * 2 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I59 Branch 41 IF_ICMPNE L259 - false
   * 3 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I74 Branch 42 IFNE L265 - true
   * 4 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I125 Branch 47 IFNE L282 - true
   * 5 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I139 Branch 48 IF_ICMPEQ L287 - true
   * 6 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I139 Branch 48 IF_ICMPEQ L287 - false
   * 7 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I142 Branch 49 IF_ICMPGT L287 - false
   * 8 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I147 Branch 50 IF_ICMPEQ L288 - false
   * 9 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I154 Branch 51 IF_ICMPEQ L289 - true
   * 10 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I170 Branch 52 IF_ICMPLE L296 - false
   * 11 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I178 Branch 53 IF_ICMPGT L299 - false
   * 12 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I185 Branch 54 IF_ICMPEQ L300 - true
   * 13 org.jsecurity.util.AntPathMatcher.setPathSeparator(Ljava/lang/String;)V: I4 Branch 1 IFNULL L80 - false
   */
  @Test
  public void test3()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      antPathMatcher0.setPathSeparator(",");
      boolean boolean0 = antPathMatcher0.matches("(*/", "(");
      assertEquals(false, boolean0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.isPattern(Ljava/lang/String;)Z: I6 Branch 2 IF_ICMPNE L85 - false
   * 2 org.jsecurity.util.AntPathMatcher.isPattern(Ljava/lang/String;)Z: I11 Branch 3 IF_ICMPEQ L85 - true
   */
  @Test
  public void test5()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.isPattern(",");
      assertEquals(false, boolean0);
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.isPattern(Ljava/lang/String;)Z: I11 Branch 3 IF_ICMPEQ L85 - false
   * 2 org.jsecurity.util.AntPathMatcher.isPattern(Ljava/lang/String;)Z: I6 Branch 2 IF_ICMPNE L85 - false
   */
  @Test
  public void test6()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.isPattern("o.MpMW?XkF;=71#O1{");
      assertEquals(true, boolean0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I12 Branch 4 IF_ICMPEQ L112 - false
   */
  @Test
  public void test7()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      antPathMatcher0.setPathSeparator("(");
      boolean boolean0 = antPathMatcher0.matches("(", "o.MpMW?XkF;=71#O1{");
      assertEquals(false, boolean0);
  }

  //Test case number: 8
  /*
   * 9 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I60 Branch 6 IF_ICMPGT L125 - true
   * 2 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I107 Branch 10 IF_ICMPLE L139 - true
   * 3 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I135 Branch 13 IFNE L143 - true
   * 4 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I144 Branch 14 IF_ICMPNE L146 - false
   * 5 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I150 Branch 15 IFLE L146 - false
   * 6 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I155 Branch 16 IFLE L146 - true
   * 7 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I167 Branch 17 IF_ICMPGT L150 - false
   * 8 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I175 Branch 18 IFGT L151 - false
   * 9 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I102 Branch 9 IF_ICMPLE L137 - false
   */
  @Test
  public void test8()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.matches("*", " ");
      assertEquals(false, boolean0);
  }

  //Test case number: 9
  /*
   * 12 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I72 Branch 7 IFLE L127 - false
   * 2 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I102 Branch 9 IF_ICMPLE L137 - true
   * 3 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I192 Branch 19 IF_ICMPLE L156 - true
   * 4 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I200 Branch 20 IFNE L159 - true
   * 5 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I215 Branch 22 IF_ICMPGT L165 - false
   * 6 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I218 Branch 23 IF_ICMPGT L165 - false
   * 7 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I230 Branch 24 IFLE L167 - false
   * 8 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I260 Branch 26 IF_ICMPLE L176 - true
   * 9 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I293 Branch 29 IF_ICMPEQ L186 - true
   * 10 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I457 Branch 38 IF_ICMPGT L226 - true
   * 11 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I457 Branch 38 IF_ICMPGT L226 - false
   * 12 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I465 Branch 39 IFGT L227 - true
   */
  @Test
  public void test9()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.match("**", "**");
      assertEquals(true, boolean0);
  }

  //Test case number: 10
  /*
   * 8 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I125 Branch 12 IFGT L140 - true
   * 2 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I59 Branch 41 IF_ICMPNE L259 - false
   * 3 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I74 Branch 42 IFNE L265 - true
   * 4 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I125 Branch 47 IFNE L282 - false
   * 5 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I57 Branch 5 IF_ICMPGT L125 - true
   * 6 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I84 Branch 8 IFNE L130 - true
   * 7 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I107 Branch 10 IF_ICMPLE L139 - false
   * 8 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I114 Branch 11 IFLE L140 - true
   */
  @Test
  public void test10()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.doMatch("*", "(*/", true);
      assertEquals(false, boolean0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I135 Branch 13 IFNE L143 - false
   */
  @Test
  public void test11()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.matchStart("sjDQLfkH", "");
      assertEquals(true, boolean0);
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I155 Branch 16 IFLE L146 - false
   * 2 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I150 Branch 15 IFLE L146 - false
   */
  @Test
  public void test13()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      antPathMatcher0.setPathSeparator("");
      boolean boolean0 = antPathMatcher0.matches("*", " ");
      assertEquals(true, boolean0);
  }

  //Test case number: 14
  /*
   * 8 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I167 Branch 17 IF_ICMPGT L150 - true
   * 2 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I175 Branch 18 IFGT L151 - true
   * 3 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I60 Branch 6 IF_ICMPGT L125 - true
   * 4 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I107 Branch 10 IF_ICMPLE L139 - true
   * 5 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I135 Branch 13 IFNE L143 - true
   * 6 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I144 Branch 14 IF_ICMPNE L146 - false
   * 7 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I150 Branch 15 IFLE L146 - true
   * 8 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I167 Branch 17 IF_ICMPGT L150 - false
   */
  @Test
  public void test14()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.match("**", "");
      assertEquals(true, boolean0);
  }

  //Test case number: 15
  /*
   * 3 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I192 Branch 19 IF_ICMPLE L156 - false
   * 2 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I91 Branch 44 IF_ICMPGT L270 - true
   * 3 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I109 Branch 46 IF_ICMPEQ L273 - true
   */
  @Test
  public void test15()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      antPathMatcher0.setPathSeparator("(*/nZ;n*-z%0S>aT:S>'0S");
      boolean boolean0 = antPathMatcher0.doMatch("=}(.;:\"eA0`", "=}(.;:\"eA0`*/nZ=}(.;:\"eA0`n*-z%", true);
      assertEquals(false, boolean0);
  }

  //Test case number: 16
  /*
   * 5 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I200 Branch 20 IFNE L159 - false
   * 2 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I206 Branch 21 IFLE L159 - false
   * 3 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I72 Branch 7 IFLE L127 - false
   * 4 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I102 Branch 9 IF_ICMPLE L137 - true
   * 5 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I192 Branch 19 IF_ICMPLE L156 - true
   */
  @Test
  public void test16()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.doMatch("**", "**", false);
      assertEquals(true, boolean0);
  }

  //Test case number: 17
  /*
   * 9 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I102 Branch 45 IF_ICMPEQ L272 - true
   * 2 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I50 Branch 40 IF_ICMPGE L258 - true
   * 3 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I74 Branch 42 IFNE L265 - false
   * 4 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I79 Branch 43 IF_ICMPEQ L267 - true
   * 5 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I91 Branch 44 IF_ICMPGT L270 - true
   * 6 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I91 Branch 44 IF_ICMPGT L270 - false
   * 7 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I102 Branch 45 IF_ICMPEQ L272 - false
   * 8 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I109 Branch 46 IF_ICMPEQ L273 - true
   * 9 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I125 Branch 12 IFGT L140 - false
   */
  @Test
  public void test17()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.doMatch("?KTv", "?KTv", false);
      assertEquals(true, boolean0);
  }

  //Test case number: 18
  /*
   * 11 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I125 Branch 47 IFNE L282 - true
   * 2 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I139 Branch 48 IF_ICMPEQ L287 - true
   * 3 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I139 Branch 48 IF_ICMPEQ L287 - false
   * 4 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I142 Branch 49 IF_ICMPGT L287 - false
   * 5 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I147 Branch 50 IF_ICMPEQ L288 - false
   * 6 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I154 Branch 51 IF_ICMPEQ L289 - true
   * 7 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I170 Branch 52 IF_ICMPLE L296 - false
   * 8 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I178 Branch 53 IF_ICMPGT L299 - true
   * 9 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I178 Branch 53 IF_ICMPGT L299 - false
   * 10 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I185 Branch 54 IF_ICMPEQ L300 - true
   * 11 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I114 Branch 11 IFLE L140 - false
   */
  @Test
  public void test18()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.matches("(*/", "(");
      assertEquals(true, boolean0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I154 Branch 51 IF_ICMPEQ L289 - false
   */
  @Test
  public void test20()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.doMatch("Y]Vs%SURO:(towWY]Vs%SURO:(towW**", "JR", true);
      assertEquals(false, boolean0);
  }

  //Test case number: 21
  /*
   * 4 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I206 Branch 55 IF_ICMPEQ L308 - false
   * 2 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I209 Branch 56 IF_ICMPGT L308 - false
   * 3 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I214 Branch 57 IF_ICMPEQ L309 - false
   * 4 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I221 Branch 58 IF_ICMPEQ L310 - false
   */
  @Test
  public void test21()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      antPathMatcher0.setPathSeparator(",");
      boolean boolean0 = antPathMatcher0.matchStart("*/", ")HE:AOl``V,7");
      assertEquals(false, boolean0);
  }

  //Test case number: 22
  /*
   * 5 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I214 Branch 57 IF_ICMPEQ L309 - true
   * 2 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I221 Branch 58 IF_ICMPEQ L310 - true
   * 3 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I206 Branch 55 IF_ICMPEQ L308 - false
   * 4 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I209 Branch 56 IF_ICMPGT L308 - false
   * 5 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I214 Branch 57 IF_ICMPEQ L309 - false
   */
  @Test
  public void test22()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.match("T*qS? qCTr11u^0%", "T*qS? qCTr11u^0%");
      assertEquals(true, boolean0);
  }

  //Test case number: 23
  /*
   * 15 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I269 Branch 62 IF_ICMPEQ L330 - false
   * 2 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I272 Branch 63 IF_ICMPGT L330 - false
   * 3 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I286 Branch 64 IF_ICMPGT L332 - false
   * 4 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I293 Branch 65 IF_ICMPNE L333 - true
   * 5 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I293 Branch 65 IF_ICMPNE L333 - false
   * 6 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I311 Branch 66 IF_ICMPNE L338 - true
   * 7 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I347 Branch 67 IF_ICMPGT L349 - false
   * 8 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I355 Branch 68 IF_ICMPGE L350 - true
   * 9 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I355 Branch 68 IF_ICMPGE L350 - false
   * 10 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I370 Branch 69 IF_ICMPEQ L352 - true
   * 11 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I370 Branch 69 IF_ICMPEQ L352 - false
   * 12 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I381 Branch 70 IF_ICMPEQ L353 - true
   * 13 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I381 Branch 70 IF_ICMPEQ L353 - false
   * 14 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I406 Branch 71 IF_ICMPNE L363 - true
   * 15 org.jsecurity.util.AntPathMatcher.matchStart(Ljava/lang/String;Ljava/lang/String;)Z: root-Branch
   */
  @Test
  public void test23()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.matchStart("u2*?vu&stSBZ*", "u2*?vu&stSBZ*");
      assertEquals(true, boolean0);
  }

  //Test case number: 24
  /*
   * 16 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I311 Branch 66 IF_ICMPNE L338 - false
   * 2 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I57 Branch 5 IF_ICMPGT L125 - true
   * 3 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I84 Branch 8 IFNE L130 - true
   * 4 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I102 Branch 9 IF_ICMPLE L137 - false
   * 5 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I107 Branch 10 IF_ICMPLE L139 - false
   * 6 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I114 Branch 11 IFLE L140 - true
   * 7 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I125 Branch 12 IFGT L140 - false
   * 8 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I59 Branch 41 IF_ICMPNE L259 - true
   * 9 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I139 Branch 48 IF_ICMPEQ L287 - false
   * 10 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I142 Branch 49 IF_ICMPGT L287 - false
   * 11 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I147 Branch 50 IF_ICMPEQ L288 - false
   * 12 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I154 Branch 51 IF_ICMPEQ L289 - true
   * 13 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I269 Branch 62 IF_ICMPEQ L330 - true
   * 14 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I431 Branch 72 IF_ICMPGT L373 - true
   * 15 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I431 Branch 72 IF_ICMPGT L373 - false
   * 16 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I438 Branch 73 IF_ICMPEQ L374 - true
   */
  @Test
  public void test24()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.matches("Y]Vs%SURO:(towWY]Vs%SURO:(towW**", "Y]Vs%SURO:(towWY]Vs%SURO:(towW**");
      assertEquals(true, boolean0);
  }

  //Test case number: 25
  /*
   * 27 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I347 Branch 67 IF_ICMPGT L349 - true
   * 2 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I406 Branch 71 IF_ICMPNE L363 - false
   * 3 org.jsecurity.util.AntPathMatcher.matches(Ljava/lang/String;Ljava/lang/String;)Z: root-Branch
   * 4 org.jsecurity.util.AntPathMatcher.match(Ljava/lang/String;Ljava/lang/String;)Z: root-Branch
   * 5 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I12 Branch 4 IF_ICMPEQ L112 - true
   * 6 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I57 Branch 5 IF_ICMPGT L125 - false
   * 7 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I60 Branch 6 IF_ICMPGT L125 - false
   * 8 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I72 Branch 7 IFLE L127 - true
   * 9 org.jsecurity.util.AntPathMatcher.doMatch(Ljava/lang/String;Ljava/lang/String;Z)Z: I84 Branch 8 IFNE L130 - false
   * 10 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I50 Branch 40 IF_ICMPGE L258 - false
   * 11 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I59 Branch 41 IF_ICMPNE L259 - false
   * 12 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I74 Branch 42 IFNE L265 - true
   * 13 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I125 Branch 47 IFNE L282 - true
   * 14 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I139 Branch 48 IF_ICMPEQ L287 - true
   * 15 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I170 Branch 52 IF_ICMPLE L296 - true
   * 16 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I206 Branch 55 IF_ICMPEQ L308 - true
   * 17 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I237 Branch 59 IF_ICMPLE L317 - true
   * 18 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I269 Branch 62 IF_ICMPEQ L330 - false
   * 19 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I272 Branch 63 IF_ICMPGT L330 - false
   * 20 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I286 Branch 64 IF_ICMPGT L332 - false
   * 21 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I293 Branch 65 IF_ICMPNE L333 - true
   * 22 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I293 Branch 65 IF_ICMPNE L333 - false
   * 23 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I311 Branch 66 IF_ICMPNE L338 - true
   * 24 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I347 Branch 67 IF_ICMPGT L349 - false
   * 25 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I355 Branch 68 IF_ICMPGE L350 - false
   * 26 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I370 Branch 69 IF_ICMPEQ L352 - false
   * 27 org.jsecurity.util.AntPathMatcher.matchStrings(Ljava/lang/String;Ljava/lang/String;)Z: I381 Branch 70 IF_ICMPEQ L353 - false
   */
  @Test
  public void test25()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      boolean boolean0 = antPathMatcher0.matches("*3;*", ".p9eZJ/M[");
      assertEquals(false, boolean0);
  }

  //Test case number: 26
  /*
   * 11 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I45 Branch 75 IF_ICMPGT L408 - false
   * 2 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I50 Branch 76 IF_ICMPLE L408 - true
   * 3 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I61 Branch 78 IFGT L409 - true
   * 4 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I32 Branch 74 IF_ICMPGE L406 - true
   * 5 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I32 Branch 74 IF_ICMPGE L406 - false
   * 6 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I45 Branch 75 IF_ICMPGT L408 - true
   * 7 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I57 Branch 77 IF_ICMPLT L408 - false
   * 8 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I61 Branch 78 IFGT L409 - false
   * 9 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I63 Branch 79 IFNE L409 - false
   * 10 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I69 Branch 80 IFGT L409 - false
   * 11 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I101 Branch 81 IF_ICMPGE L418 - true
   */
  @Test
  public void test26()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      antPathMatcher0.setPathSeparator("=}(.;:\"eA0`");
      String string0 = antPathMatcher0.extractPathWithinPattern("(*/nZ;n*-z%0S>aT:S>'0S", "(*/nZ;n*-z%0S>aT:S>'0S");
      assertNotNull(string0);
      assertEquals("=}(.;:\"eA0`*/nZ=}(.;:\"eA0`n*-z%", string0);
  }

  //Test case number: 30
  /*
   * 8 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I69 Branch 80 IFGT L409 - true
   * 2 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I101 Branch 81 IF_ICMPGE L418 - false
   * 3 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I105 Branch 82 IFGT L419 - true
   * 4 org.jsecurity.util.AntPathMatcher.setPathSeparator(Ljava/lang/String;)V: I4 Branch 1 IFNULL L80 - false
   * 5 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I45 Branch 75 IF_ICMPGT L408 - true
   * 6 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I57 Branch 77 IF_ICMPLT L408 - false
   * 7 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I61 Branch 78 IFGT L409 - false
   * 8 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I63 Branch 79 IFNE L409 - false
   */
  @Test
  public void test30()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      antPathMatcher0.setPathSeparator("Y]Vs%SURO:(towW");
      String string0 = antPathMatcher0.extractPathWithinPattern("Y]Vs%SURO:(towW*3;*", ";X~G1:Tso|!J");
      assertEquals(";X~G1Y]Vs%SURO:(towWTY]Vs%SURO:(towW|!J", string0);
      assertNotNull(string0);
  }

  //Test case number: 32
  /*
   * 6 covered goals:
   * 1 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I107 Branch 83 IFLE L419 - true
   * 2 org.jsecurity.util.AntPathMatcher.<init>()V: root-Branch
   * 3 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I32 Branch 74 IF_ICMPGE L406 - true
   * 4 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I101 Branch 81 IF_ICMPGE L418 - true
   * 5 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I101 Branch 81 IF_ICMPGE L418 - false
   * 6 org.jsecurity.util.AntPathMatcher.extractPathWithinPattern(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I105 Branch 82 IFGT L419 - false
   */
  @Test
  public void test32()  throws Throwable  {
      AntPathMatcher antPathMatcher0 = new AntPathMatcher();
      String string0 = antPathMatcher0.extractPathWithinPattern("", "][*~UFcm3}{:*A.2l.p");
      assertEquals("][*~UFcm3}{:*A.2l.p", string0);
      assertNotNull(string0);
  }
}
