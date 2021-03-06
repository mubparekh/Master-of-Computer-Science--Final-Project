/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import nu.staldal.lagoon.core.LagoonException;
import nu.staldal.lagoon.core.LagoonProcessor;
import nu.staldal.lagoon.core.Sitemap;
import nu.staldal.xtree.Element;
import nu.staldal.xtree.Node;
import nu.staldal.xtree.Text;

public class SitemapEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.core.Sitemap.getTargets()Ljava/util/Enumeration;: root-Branch
   * 2 nu.staldal.lagoon.core.Sitemap.<init>(Lnu/staldal/lagoon/core/LagoonProcessor;Lnu/staldal/xtree/Element;Ljava/io/File;)V: I10 Branch 1 IFGT L90 - true
   */
  @Test
  public void test0()  throws Throwable  {
      Element element0 = new Element("sitemap", "sitemap");
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, (File) null);
      Enumeration<Object> enumeration0 = sitemap0.getTargets();
      assertEquals(false, enumeration0.hasMoreElements());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.core.Sitemap.getProperty(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Element element0 = new Element("sitemap", "sitemap");
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, (File) null);
      String string0 = sitemap0.getProperty("Y6");
      assertNull(string0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.core.Sitemap.getEntries()Ljava/util/Enumeration;: root-Branch
   * 2 nu.staldal.lagoon.core.Sitemap.destroy()V: I8 Branch 34 IFEQ L291 - true
   */
  @Test
  public void test2()  throws Throwable  {
      Element element0 = new Element("sitemap", "sitemap");
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, (File) null);
      sitemap0.destroy();
      assertNull(sitemap0.getSiteName());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.core.Sitemap.<init>(Lnu/staldal/lagoon/core/LagoonProcessor;Lnu/staldal/xtree/Element;Ljava/io/File;)V: I10 Branch 1 IFGT L90 - false
   */
  @Test
  public void test4()  throws Throwable  {
      Element element0 = new Element("Y6", "Y6", (-1404));
      Sitemap sitemap0 = null;
      try {
        sitemap0 = new Sitemap((LagoonProcessor) null, element0, (File) null);
        fail("Expecting exception: LagoonException");
      } catch(LagoonException e) {
        /*
         * root element must be <sitemap>
         */
      }
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * 1 nu.staldal.lagoon.core.Sitemap.init()V: I14 Branch 2 IF_ICMPGE L113 - false
   * 2 nu.staldal.lagoon.core.Sitemap.init()V: I26 Branch 3 IFNE L116 - false
   * 3 nu.staldal.lagoon.core.Sitemap.<init>(Lnu/staldal/lagoon/core/LagoonProcessor;Lnu/staldal/xtree/Element;Ljava/io/File;)V: I10 Branch 1 IFGT L90 - true
   * 4 nu.staldal.lagoon.core.Sitemap.init()V: I14 Branch 2 IF_ICMPGE L113 - true
   */
  @Test
  public void test5()  throws Throwable  {
      Element element0 = new Element("sitemap", "sitemap");
      char[] charArray0 = new char[10];
      Sitemap sitemap0 = new Sitemap((LagoonProcessor) null, element0, (File) null);
      Text text0 = new Text(charArray0, 0, 1, true);
      element0.addChild((Node) text0);
      sitemap0.init();
      assertNull(sitemap0.getSiteName());
  }
}
