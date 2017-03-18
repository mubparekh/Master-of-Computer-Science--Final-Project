/*
 * This file was automatically generated by EvoSuite
 */

package bierse.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import bierse.view.RunningMessagePanel;
import java.awt.event.ActionEvent;

public class RunningMessagePanelEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 bierse.view.RunningMessagePanel.setSpeed(I)V: root-Branch
   * 2 bierse.view.RunningMessagePanel.<init>(Ljava/lang/String;I)V: I55 Branch 1 IFNONNULL L40 - true
   */
  @Test
  public void test0()  throws Throwable  {
      RunningMessagePanel runningMessagePanel0 = new RunningMessagePanel("#)W{+3S>Se'k[+", 1752);
      assertNotNull(runningMessagePanel0);
      
      // Undeclared exception!
      try {
        runningMessagePanel0.setSpeed((-1680));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Invalid delay: -1680
         */
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 bierse.view.RunningMessagePanel.setMessage(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      RunningMessagePanel runningMessagePanel0 = new RunningMessagePanel("", (-16));
      assertNotNull(runningMessagePanel0);
      
      runningMessagePanel0.setMessage("");
      assertEquals(24, runningMessagePanel0.getStringHeight());
      assertEquals(0, runningMessagePanel0.getStringWidth());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 bierse.view.RunningMessagePanel.getStringWidth()I: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      RunningMessagePanel runningMessagePanel0 = new RunningMessagePanel("", 814);
      assertNotNull(runningMessagePanel0);
      
      int int0 = runningMessagePanel0.getStringWidth();
      assertEquals(24, runningMessagePanel0.getStringHeight());
      assertEquals(0, int0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 bierse.view.RunningMessagePanel.actionPerformed(Ljava/awt/event/ActionEvent;)V: I26 Branch 3 IFGE L60 - true
   * 2 bierse.view.RunningMessagePanel.<init>(Ljava/lang/String;I)V: I55 Branch 1 IFNONNULL L40 - true
   */
  @Test
  public void test3()  throws Throwable  {
      RunningMessagePanel runningMessagePanel0 = new RunningMessagePanel("", 20);
      assertNotNull(runningMessagePanel0);
      
      runningMessagePanel0.actionPerformed((ActionEvent) null);
      assertEquals(24, runningMessagePanel0.getStringHeight());
  }
}