/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xisemele.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.xisemele.api.Formatter;
import net.sf.xisemele.impl.FormatterProviderImpl;

public class FormatterProviderImplEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.FormatterProviderImpl.setFormatter(Ljava/lang/Class;Lnet/sf/xisemele/api/Formatter;)V: root-Branch
   * 2 net.sf.xisemele.impl.FormatterProviderImpl.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      FormatterProviderImpl formatterProviderImpl0 = new FormatterProviderImpl();
      Class<?> class0 = FormatterProviderImpl.class;
      formatterProviderImpl0.setFormatter(class0, (Formatter<?>) null);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.FormatterProviderImpl.getFormatter(Ljava/lang/Class;)Lnet/sf/xisemele/api/Formatter;: root-Branch
   * 2 net.sf.xisemele.impl.FormatterProviderImpl.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      FormatterProviderImpl formatterProviderImpl0 = new FormatterProviderImpl();
      Class<?> class0 = FormatterProviderImpl.class;
      Formatter<Integer> formatter0 = formatterProviderImpl0.getFormatter(class0);
      assertNull(formatter0);
  }
}
