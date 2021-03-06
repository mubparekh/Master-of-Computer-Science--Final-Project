/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.List;
import net.sourceforge.schemaspy.model.Routine;
import net.sourceforge.schemaspy.model.RoutineParameter;

public class RoutineEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.model.Routine.getParameters()Ljava/util/List;: root-Branch
   * 2 net.sourceforge.schemaspy.model.Routine.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      Routine routine0 = new Routine("", "", "", "", "", false, "", "", "");
      List<RoutineParameter> list0 = routine0.getParameters();
      assertNotNull(list0);
      assertEquals(false, routine0.isDeterministic());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.Routine.getComment()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Routine routine0 = new Routine("B-%MOif", "B-%MOif", "B-%MOif", "B-%MOif", "B-%MOif", false, "B-%MOif", "B-%MOif", "B-%MOif");
      String string0 = routine0.getComment();
      assertNotNull(string0);
      assertEquals(false, routine0.isDeterministic());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.Routine.getSecurityType()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      Routine routine0 = new Routine("", "", "", "", "", false, "", "", "");
      String string0 = routine0.getSecurityType();
      assertEquals(false, routine0.isDeterministic());
      assertNotNull(string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.Routine.getDataAccess()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      Routine routine0 = new Routine("B-%MOif", "B-%MOif", "B-%MOif", "B-%MOif", "B-%MOif", false, "B-%MOif", "B-%MOif", "B-%MOif");
      String string0 = routine0.getDataAccess();
      assertEquals(false, routine0.isDeterministic());
      assertNotNull(string0);
  }

  //Test case number: 4
  /*
   * 7 covered goals:
   * 1 net.sourceforge.schemaspy.model.Routine.getType()Ljava/lang/String;: root-Branch
   * 2 net.sourceforge.schemaspy.model.Routine.getDefinition()Ljava/lang/String;: root-Branch
   * 3 net.sourceforge.schemaspy.model.Routine.getName()Ljava/lang/String;: root-Branch
   * 4 net.sourceforge.schemaspy.model.Routine.compareTo(Lnet/sourceforge/schemaspy/model/Routine;)I: I11 Branch 1 IFNE L155 - false
   * 5 net.sourceforge.schemaspy.model.Routine.compareTo(Lnet/sourceforge/schemaspy/model/Routine;)I: I23 Branch 2 IFNE L157 - false
   * 6 net.sourceforge.schemaspy.model.Routine.compareTo(Lnet/sourceforge/schemaspy/model/Routine;)I: I37 Branch 3 IFNE L159 - false
   * 7 net.sourceforge.schemaspy.model.Routine.getReturnType()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      Routine routine0 = new Routine("", "", "", "", "", true, "", "", "");
      int int0 = routine0.compareTo(routine0);
      assertEquals(true, routine0.isDeterministic());
      assertEquals(0, int0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.Routine.addParameter(Lnet/sourceforge/schemaspy/model/RoutineParameter;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      Routine routine0 = new Routine("B-%MOif", "B-%MOif", "B-%MOif", "B-%MOif", "B-%MOif", false, "B-%MOif", "B-%MOif", "B-%MOif");
      RoutineParameter routineParameter0 = new RoutineParameter("", "", "");
      routine0.addParameter(routineParameter0);
      assertEquals(false, routine0.isDeterministic());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.Routine.getDefinitionLanguage()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      Routine routine0 = new Routine("B-%MOif", "B-%MOif", "B-%MOif", "B-%MOif", "B-%MOif", false, "B-%MOif", "B-%MOif", "B-%MOif");
      String string0 = routine0.getDefinitionLanguage();
      assertNotNull(string0);
      assertEquals(false, routine0.isDeterministic());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sourceforge.schemaspy.model.Routine.isDeterministic()Z: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      Routine routine0 = new Routine("B-%MOif", "B-%MOif", "B-%MOif", "B-%MOif", "B-%MOif", false, "B-%MOif", "B-%MOif", "B-%MOif");
      boolean boolean0 = routine0.isDeterministic();
      assertEquals(false, boolean0);
  }

  //Test case number: 8
  /*
   * 5 covered goals:
   * 1 net.sourceforge.schemaspy.model.Routine.compareTo(Lnet/sourceforge/schemaspy/model/Routine;)I: I11 Branch 1 IFNE L155 - true
   * 2 net.sourceforge.schemaspy.model.Routine.compareTo(Lnet/sourceforge/schemaspy/model/Routine;)I: I23 Branch 2 IFNE L157 - true
   * 3 net.sourceforge.schemaspy.model.Routine.compareTo(Lnet/sourceforge/schemaspy/model/Routine;)I: I37 Branch 3 IFNE L159 - true
   * 4 net.sourceforge.schemaspy.model.Routine.getName()Ljava/lang/String;: root-Branch
   * 5 net.sourceforge.schemaspy.model.Routine.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      Routine routine0 = new Routine("", "", "", "", "", false, "", "", "");
      Routine routine1 = new Routine("!Yv3 '4@Kw(:-1ey90|", "!Yv3 '4@Kw(:-1ey90|", "", "", "", false, "!Yv3 '4@Kw(:-1ey90|", "", "");
      int int0 = routine0.compareTo(routine1);
      assertEquals("!Yv3 '4@Kw(:-1ey90|", routine1.getDataAccess());
      assertEquals(false, routine1.isDeterministic());
      assertEquals("", routine1.getDefinitionLanguage());
      assertEquals("", routine1.getDefinition());
      assertEquals("", routine1.getSecurityType());
      assertEquals("", routine1.getReturnType());
      assertEquals("!Yv3 '4@Kw(:-1ey90|", routine1.getName());
      assertEquals("!Yv3 '4@Kw(:-1ey90|", routine1.getType());
      assertEquals("", routine1.getComment());
      assertEquals((-19), int0);
  }
}
