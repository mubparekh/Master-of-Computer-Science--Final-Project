/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import net.sourceforge.schemaspy.util.LogFormatter;

public class LogFormatterEvoSuiteTest {


  //Test case number: 0
  /*
   * 5 covered goals:
   * 1 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I69 Branch 1 IF_ICMPLE L96 - true
   * 2 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I86 Branch 2 IF_ICMPGE L99 - true
   * 3 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I86 Branch 2 IF_ICMPGE L99 - false
   * 4 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I110 Branch 3 IFNULL L105 - true
   * 5 net.sourceforge.schemaspy.util.LogFormatter.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      LogFormatter logFormatter0 = new LogFormatter();
      assertNotNull(logFormatter0);
      
      Level level0 = Level.ALL;
      LogRecord logRecord0 = new LogRecord(level0, "'AOA'");
      // Undeclared exception!
      try {
        logFormatter0.format(logRecord0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I110 Branch 3 IFNULL L105 - false
   * 2 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I132 Branch 4 IFLT L112 - true
   * 3 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I157 Branch 6 IFNULL L116 - true
   * 4 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I196 Branch 7 IFNULL L125 - true
   */
  @Test
  public void test1()  throws Throwable  {
      LogFormatter logFormatter0 = new LogFormatter();
      assertNotNull(logFormatter0);
      
      Level level0 = Level.WARNING;
      LogRecord logRecord0 = new LogRecord(level0, "");
      logRecord0.setSourceClassName("");
      String string0 = logFormatter0.format(logRecord0);
      assertEquals(4486L, logRecord0.getSequenceNumber());
      assertEquals("18:55:21.464 WARNING:  - \n", string0);
  }

  //Test case number: 2
  /*
   * 7 covered goals:
   * 1 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I157 Branch 6 IFNULL L116 - false
   * 2 net.sourceforge.schemaspy.util.LogFormatter.<init>()V: root-Branch
   * 3 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I69 Branch 1 IF_ICMPLE L96 - true
   * 4 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I86 Branch 2 IF_ICMPGE L99 - true
   * 5 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I110 Branch 3 IFNULL L105 - false
   * 6 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I132 Branch 4 IFLT L112 - true
   * 7 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I196 Branch 7 IFNULL L125 - true
   */
  @Test
  public void test2()  throws Throwable  {
      LogFormatter logFormatter0 = new LogFormatter();
      assertNotNull(logFormatter0);
      
      Level level0 = Level.WARNING;
      LogRecord logRecord0 = new LogRecord(level0, "");
      logRecord0.setSourceClassName("");
      logRecord0.setSourceMethodName("18:55:14.178 WARNING:  - \n");
      String string0 = logFormatter0.format(logRecord0);
      assertEquals(1433984128126L, logRecord0.getMillis());
      assertEquals("18:55:28.126 WARNING: .18:55:14.178 WARNING:  - \n - \n", string0);
  }
}
