/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.xtree;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.IOException;
import nu.staldal.xtree.Element;
import nu.staldal.xtree.ElementHandler;
import nu.staldal.xtree.SequentialTreeBuilder;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.ext.Locator2Impl;
import org.xml.sax.helpers.AttributesImpl;

public class SequentialTreeBuilderEvoSuiteTest {


  //Test case number: 0
  /*
   * 6 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.parseXMLSequential(Lorg/xml/sax/InputSource;ZLnu/staldal/xtree/ElementHandler;)Lnu/staldal/xtree/Element;: root-Branch
   * 2 nu.staldal.xtree.SequentialTreeBuilder.startDocument()V: root-Branch
   * 3 nu.staldal.xtree.SequentialTreeBuilder.<init>(Lnu/staldal/xtree/ElementHandler;)V: root-Branch
   * 4 nu.staldal.xtree.SequentialTreeBuilder.fatalError(Lorg/xml/sax/SAXParseException;)V: root-Branch
   * 5 nu.staldal.xtree.SequentialTreeBuilder.<init>(Lnu/staldal/xtree/ElementHandler;Ljava/net/URL;)V: root-Branch
   * 6 nu.staldal.xtree.SequentialTreeBuilder.setDocumentLocator(Lorg/xml/sax/Locator;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      InputSource inputSource0 = new InputSource("");
      try {
        SequentialTreeBuilder.parseXMLSequential(inputSource0, false, (ElementHandler) null);
        fail("Expecting exception: SAXParseException");
      } catch(SAXParseException e) {
        /*
         * Content is not allowed in prolog.
         */
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.warning(Lorg/xml/sax/SAXParseException;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.warning((SAXParseException) null);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.endDocument()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.endDocument();
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.error(Lorg/xml/sax/SAXParseException;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      // Undeclared exception!
      try {
        sequentialTreeBuilder0.error((SAXParseException) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.endPrefixMapping(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.endPrefixMapping("nmp*s$.pt!Vj)l");
  }

  //Test case number: 5
  /*
   * 6 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.getRootElement()Lnu/staldal/xtree/Element;: I4 Branch 1 IFNONNULL L155 - true
   * 2 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 2 IFNONNULL L189 - false
   * 3 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I20 Branch 3 IFNULL L192 - true
   * 4 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I49 Branch 4 IFNULL L198 - true
   * 5 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I63 Branch 5 IF_ICMPGE L199 - true
   * 6 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I134 Branch 8 IFNULL L217 - true
   */
  @Test
  public void test5()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      sequentialTreeBuilder0.startElement("-", "-", "-", (Attributes) attributesImpl0);
      Element element0 = sequentialTreeBuilder0.getRootElement();
      assertEquals("", element0.getTextContentOrNull());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.getRootElement()Lnu/staldal/xtree/Element;: I4 Branch 1 IFNONNULL L155 - false
   */
  @Test
  public void test6()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      try {
        sequentialTreeBuilder0.getRootElement();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * No root element
         */
      }
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 9 IFLE L236 - false
   * 2 nu.staldal.xtree.SequentialTreeBuilder.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I18 Branch 10 IF_ICMPNE L240 - false
   * 3 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 2 IFNONNULL L189 - true
   */
  @Test
  public void test7()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      Attributes2Impl attributes2Impl0 = new Attributes2Impl((Attributes) attributesImpl0);
      sequentialTreeBuilder0.startElement("|FMJ/u&98~", "|FMJ/u&98~", "|FMJ/u&98~", (Attributes) attributes2Impl0);
      sequentialTreeBuilder0.startElement("|FMJ/u&98~", "|FMJ/u&98~", "|FMJ/u&98~", (Attributes) attributesImpl0);
      // Undeclared exception!
      try {
        sequentialTreeBuilder0.endElement("No root element", "No root element", "|FMJ/u&98~");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I20 Branch 3 IFNULL L192 - false
   * 2 nu.staldal.xtree.SequentialTreeBuilder.setDocumentLocator(Lorg/xml/sax/Locator;)V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      Locator2Impl locator2Impl0 = new Locator2Impl();
      sequentialTreeBuilder0.setDocumentLocator((Locator) locator2Impl0);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      sequentialTreeBuilder0.startElement("", "", "_!|", (Attributes) attributesImpl0);
      assertEquals(0, attributesImpl0.getLength());
  }

  //Test case number: 9
  /*
   * 3 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I134 Branch 8 IFNULL L217 - false
   * 2 nu.staldal.xtree.SequentialTreeBuilder.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 11 IFNONNULL L263 - false
   * 3 nu.staldal.xtree.SequentialTreeBuilder.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I9 Branch 12 IFNONNULL L265 - false
   */
  @Test
  public void test9()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.startPrefixMapping("default", "default");
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      sequentialTreeBuilder0.startElement("default", "XML parser configuration error: ", "3[0-GW,A!T", (Attributes) attributes2Impl0);
      assertEquals(0, attributes2Impl0.getLength());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 9 IFLE L236 - true
   */
  @Test
  public void test10()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.endElement("a08#x;eI`n", "", "nmp*s$.pt!Vj)l");
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I18 Branch 10 IF_ICMPNE L240 - true
   * 2 nu.staldal.xtree.SequentialTreeBuilder.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 9 IFLE L236 - false
   */
  @Test
  public void test11()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      sequentialTreeBuilder0.startElement("-", "-", "-", (Attributes) attributesImpl0);
      sequentialTreeBuilder0.startElement("-", "-", "-", (Attributes) attributesImpl0);
      sequentialTreeBuilder0.startElement("file:", "file:", "file:", (Attributes) attributesImpl0);
      sequentialTreeBuilder0.endElement("file:", "file:", "^&");
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 11 IFNONNULL L263 - true
   */
  @Test
  public void test12()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      sequentialTreeBuilder0.startElement("l", "l", "l", (Attributes) attributes2Impl0);
      sequentialTreeBuilder0.startPrefixMapping("", "a08#x;eI`n");
  }

  //Test case number: 13
  /*
   * 3 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I9 Branch 12 IFNONNULL L265 - true
   * 2 nu.staldal.xtree.SequentialTreeBuilder.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 11 IFNONNULL L263 - false
   * 3 nu.staldal.xtree.SequentialTreeBuilder.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I9 Branch 12 IFNONNULL L265 - false
   */
  @Test
  public void test13()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.startPrefixMapping((String) null, (String) null);
      sequentialTreeBuilder0.startPrefixMapping((String) null, (String) null);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.characters([CII)V: I4 Branch 13 IFLE L291 - true
   */
  @Test
  public void test14()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      char[] charArray0 = new char[5];
      sequentialTreeBuilder0.characters(charArray0, 435, (int) '_');
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.ignorableWhitespace([CII)V: I4 Branch 14 IFLE L298 - true
   */
  @Test
  public void test15()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      char[] charArray0 = new char[3];
      sequentialTreeBuilder0.ignorableWhitespace(charArray0, (-1), (int) '1');
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.ignorableWhitespace([CII)V: I4 Branch 14 IFLE L298 - false
   */
  @Test
  public void test16()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      sequentialTreeBuilder0.startElement("-", "-", "-", (Attributes) attributesImpl0);
      sequentialTreeBuilder0.startElement("-", "-", "-", (Attributes) attributesImpl0);
      char[] charArray0 = new char[9];
      sequentialTreeBuilder0.ignorableWhitespace(charArray0, 1685, (int) '_');
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.processingInstruction(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 15 IFLE L305 - true
   */
  @Test
  public void test17()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.processingInstruction("default", "default");
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.skippedEntity(Ljava/lang/String;)V: I4 Branch 16 IFLE L312 - true
   */
  @Test
  public void test18()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      sequentialTreeBuilder0.skippedEntity("");
  }

  //Test case number: 19
  /*
   * 9 covered goals:
   * 1 nu.staldal.xtree.SequentialTreeBuilder.skippedEntity(Ljava/lang/String;)V: I4 Branch 16 IFLE L312 - false
   * 2 nu.staldal.xtree.SequentialTreeBuilder.<init>(Lnu/staldal/xtree/ElementHandler;)V: root-Branch
   * 3 nu.staldal.xtree.SequentialTreeBuilder.<init>(Lnu/staldal/xtree/ElementHandler;Ljava/net/URL;)V: root-Branch
   * 4 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 2 IFNONNULL L189 - true
   * 5 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 2 IFNONNULL L189 - false
   * 6 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I20 Branch 3 IFNULL L192 - true
   * 7 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I49 Branch 4 IFNULL L198 - true
   * 8 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I63 Branch 5 IF_ICMPGE L199 - true
   * 9 nu.staldal.xtree.SequentialTreeBuilder.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I134 Branch 8 IFNULL L217 - true
   */
  @Test
  public void test19()  throws Throwable  {
      SequentialTreeBuilder sequentialTreeBuilder0 = new SequentialTreeBuilder((ElementHandler) null);
      AttributesImpl attributesImpl0 = new AttributesImpl();
      sequentialTreeBuilder0.startElement("-", "-", "-", (Attributes) attributesImpl0);
      sequentialTreeBuilder0.startElement("-", "-", "-", (Attributes) attributesImpl0);
      sequentialTreeBuilder0.skippedEntity("file:");
  }
}