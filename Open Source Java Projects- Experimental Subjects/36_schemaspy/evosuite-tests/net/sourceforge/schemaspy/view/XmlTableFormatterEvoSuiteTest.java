/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.TreeSet;
import javax.imageio.metadata.IIOMetadataNode;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.view.XmlTableFormatter;
import org.w3c.dom.Element;

public class XmlTableFormatterEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.view.XmlTableFormatter$1.<init>(Lnet/sourceforge/schemaspy/view/XmlTableFormatter;)V: root-Branch
   * 2 net.sourceforge.schemaspy.view.XmlTableFormatter.getInstance()Lnet/sourceforge/schemaspy/view/XmlTableFormatter;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      TreeSet<Table> treeSet0 = new TreeSet<Table>();
      XmlTableFormatter xmlTableFormatter0 = XmlTableFormatter.getInstance();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      // Undeclared exception!
      try {
        xmlTableFormatter0.appendTables((Element) iIOMetadataNode0, (Collection<Table>) treeSet0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
