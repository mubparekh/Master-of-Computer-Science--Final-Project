/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.awt.TextArea;
import java.io.IOException;
import nu.staldal.lagoon.TextAreaWriter;

public class TextAreaWriterEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.TextAreaWriter.write(I)V: root-Branch
   * 2 nu.staldal.lagoon.TextAreaWriter.<init>(Ljava/awt/TextArea;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      TextAreaWriter textAreaWriter0 = new TextAreaWriter((TextArea) null);
      TextAreaWriter textAreaWriter1 = (TextAreaWriter)textAreaWriter0.append('\u0000');
      assertSame(textAreaWriter0, textAreaWriter1);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.TextAreaWriter.flush()V: I11 Branch 1 IF_ICMPNE L664 - true
   * 2 nu.staldal.lagoon.TextAreaWriter.write([CII)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      TextAreaWriter textAreaWriter0 = new TextAreaWriter((TextArea) null);
      textAreaWriter0.write("xskLO/3Nv$XBS");
      // Undeclared exception!
      try {
        textAreaWriter0.flush();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.TextAreaWriter.close()V: root-Branch
   * 2 nu.staldal.lagoon.TextAreaWriter.<init>(Ljava/awt/TextArea;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      TextAreaWriter textAreaWriter0 = new TextAreaWriter((TextArea) null);
      // Undeclared exception!
      try {
        textAreaWriter0.close();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      } catch(StringIndexOutOfBoundsException e) {
        /*
         * String index out of range: -2
         */
      }
  }
}
