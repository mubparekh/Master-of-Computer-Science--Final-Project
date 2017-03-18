/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.xmlutil;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.EmptyStackException;
import nu.staldal.xmlutil.DocumentHandlerAdapter;
import org.xml.sax.Attributes;
import org.xml.sax.DocumentHandler;
import org.xml.sax.HandlerBase;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.LocatorImpl;

public class DocumentHandlerAdapterEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endPrefixMapping(Ljava/lang/String;)V: root-Branch
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.<init>(Lorg/xml/sax/DocumentHandler;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.endPrefixMapping("Gg[hk:xYx8_@!,zh7");
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.processingInstruction(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.processingInstruction(";y[rh", ";y[rh");
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.skippedEntity(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.skippedEntity("Ep-Zs]B-(.)");
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startDocument()V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.startDocument();
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.characters([CII)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      char[] charArray0 = new char[8];
      documentHandlerAdapter0.characters(charArray0, (int) '\u0000', (int) '\u0000');
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.setDocumentLocator(Lorg/xml/sax/Locator;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      LocatorImpl locatorImpl0 = new LocatorImpl();
      documentHandlerAdapter0.setDocumentLocator((Locator) locatorImpl0);
      assertNull(locatorImpl0.getSystemId());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.ignorableWhitespace([CII)V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      char[] charArray0 = new char[8];
      documentHandlerAdapter0.ignorableWhitespace(charArray0, (int) '\u0000', (int) '[');
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endDocument()V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.endDocument();
  }

  //Test case number: 8
  /*
   * 8 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 1 IFNE L102 - true
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I18 Branch 2 IFNULL L109 - false
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I21 Branch 3 IFLE L109 - true
   * 4 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I38 Branch 4 IFNONNULL L114 - false
   * 5 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I42 Branch 5 IFNULL L116 - false
   * 6 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I46 Branch 6 IF_ICMPGE L116 - true
   * 7 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I62 Branch 7 IFNULL L123 - true
   * 8 nu.staldal.xmlutil.DocumentHandlerAdapter.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 25 IFNE L217 - false
   */
  @Test
  public void test8()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.startPrefixMapping("", "");
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      // Undeclared exception!
      try {
        documentHandlerAdapter0.startElement("Gg[hk:xYx8_@!,zh7", "", "", (Attributes) attributes2Impl0);
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * no prefix for 'Gg[hk:xYx8_@!,zh7'
         */
      }
  }

  //Test case number: 9
  /*
   * 6 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I18 Branch 2 IFNULL L109 - true
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I46 Branch 6 IF_ICMPGE L116 - false
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I95 Branch 9 IFNE L130 - false
   * 4 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I127 Branch 10 IF_ICMPGE L134 - true
   * 5 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I227 Branch 15 IFEQ L157 - true
   * 6 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 1 IFNE L102 - false
   */
  @Test
  public void test9()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      documentHandlerAdapter0.startElement("", "", (String) null, (Attributes) attributes2Impl0);
      assertEquals(0, attributes2Impl0.getLength());
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I21 Branch 3 IFLE L109 - false
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 1 IFNE L102 - false
   */
  @Test
  public void test10()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      documentHandlerAdapter0.startElement("", "", "no pref)ix for '", (Attributes) attributes2Impl0);
      assertEquals(0, attributes2Impl0.getLength());
  }

  //Test case number: 11
  /*
   * 4 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I38 Branch 4 IFNONNULL L114 - true
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I95 Branch 9 IFNE L130 - true
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I227 Branch 15 IFEQ L157 - false
   * 4 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I245 Branch 16 IFNE L161 - true
   */
  @Test
  public void test11()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.startPrefixMapping("Gg[hk:xYx8_@!,zh7", "Gg[hk:xYx8_@!,zh7");
      Attributes2Impl attributes2Impl0 = new Attributes2Impl();
      documentHandlerAdapter0.startElement("Gg[hk:xYx8_@!,zh7", "", "", (Attributes) attributes2Impl0);
      assertEquals(0, attributes2Impl0.getLength());
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I62 Branch 7 IFNULL L123 - false
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I66 Branch 8 IFLE L123 - true
   */
  @Test
  public void test12()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.startPrefixMapping("", ";y[rh");
      AttributesImpl attributesImpl0 = new AttributesImpl();
      // Undeclared exception!
      try {
        documentHandlerAdapter0.startElement("m", "", "", (Attributes) attributesImpl0);
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * no prefix for 'm'
         */
      }
  }

  //Test case number: 13
  /*
   * 13 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I66 Branch 8 IFLE L123 - false
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I245 Branch 16 IFNE L161 - false
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I4 Branch 1 IFNE L102 - true
   * 4 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I18 Branch 2 IFNULL L109 - false
   * 5 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I21 Branch 3 IFLE L109 - true
   * 6 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I38 Branch 4 IFNONNULL L114 - false
   * 7 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I42 Branch 5 IFNULL L116 - false
   * 8 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I46 Branch 6 IF_ICMPGE L116 - true
   * 9 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I62 Branch 7 IFNULL L123 - false
   * 10 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I95 Branch 9 IFNE L130 - false
   * 11 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I127 Branch 10 IF_ICMPGE L134 - true
   * 12 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I227 Branch 15 IFEQ L157 - true
   * 13 nu.staldal.xmlutil.DocumentHandlerAdapter.startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V: I227 Branch 15 IFEQ L157 - false
   */
  @Test
  public void test13()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.startPrefixMapping("", "cm");
      AttributesImpl attributesImpl0 = new AttributesImpl();
      documentHandlerAdapter0.startElement("cm", "", "", (Attributes) attributesImpl0);
      assertEquals(0, attributesImpl0.getLength());
  }

  //Test case number: 14
  /*
   * 5 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I3 Branch 17 IFNULL L182 - true
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I23 Branch 19 IFNONNULL L187 - false
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I27 Branch 20 IFNULL L189 - false
   * 4 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I31 Branch 21 IF_ICMPGE L189 - true
   * 5 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I47 Branch 22 IFNULL L196 - true
   */
  @Test
  public void test14()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      // Undeclared exception!
      try {
        documentHandlerAdapter0.endElement("^Sk^!(I", (String) null, (String) null);
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * no prefix for '^Sk^!(I'
         */
      }
  }

  //Test case number: 15
  /*
   * 2 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I3 Branch 17 IFNULL L182 - false
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I6 Branch 18 IFLE L182 - false
   */
  @Test
  public void test15()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      // Undeclared exception!
      try {
        documentHandlerAdapter0.endElement("uCW~Rh !H:C3;~3Es", "uCW~Rh !H:C3;~3Es", "uCW~Rh !H:C3;~3Es");
        fail("Expecting exception: EmptyStackException");
      } catch(EmptyStackException e) {
      }
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I6 Branch 18 IFLE L182 - true
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I47 Branch 22 IFNULL L196 - true
   */
  @Test
  public void test16()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      // Undeclared exception!
      try {
        documentHandlerAdapter0.endElement(";y[rh", "", "");
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * no prefix for ';y[rh'
         */
      }
  }

  //Test case number: 17
  /*
   * 2 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I23 Branch 19 IFNONNULL L187 - true
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I80 Branch 24 IFNE L203 - true
   */
  @Test
  public void test17()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.startPrefixMapping("xmlns:", "");
      documentHandlerAdapter0.endElement("", "", "");
  }

  //Test case number: 18
  /*
   * 2 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I31 Branch 21 IF_ICMPGE L189 - false
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I80 Branch 24 IFNE L203 - false
   */
  @Test
  public void test18()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      // Undeclared exception!
      try {
        documentHandlerAdapter0.endElement("", "", "");
        fail("Expecting exception: EmptyStackException");
      } catch(EmptyStackException e) {
      }
  }

  //Test case number: 19
  /*
   * 3 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I47 Branch 22 IFNULL L196 - false
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I51 Branch 23 IFLE L196 - false
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I80 Branch 24 IFNE L203 - false
   */
  @Test
  public void test19()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.startPrefixMapping("", ";y[rh");
      documentHandlerAdapter0.endElement(";y[rh", "", "");
  }

  //Test case number: 20
  /*
   * 7 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I51 Branch 23 IFLE L196 - true
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I3 Branch 17 IFNULL L182 - false
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I6 Branch 18 IFLE L182 - true
   * 4 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I23 Branch 19 IFNONNULL L187 - false
   * 5 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I27 Branch 20 IFNULL L189 - false
   * 6 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I31 Branch 21 IF_ICMPGE L189 - true
   * 7 nu.staldal.xmlutil.DocumentHandlerAdapter.endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: I47 Branch 22 IFNULL L196 - false
   */
  @Test
  public void test20()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.startPrefixMapping("", ";y[rh");
      // Undeclared exception!
      try {
        documentHandlerAdapter0.endElement("cm", "", "");
        fail("Expecting exception: Error");
      } catch(Error e) {
        /*
         * no prefix for 'cm'
         */
      }
  }

  //Test case number: 21
  /*
   * 3 covered goals:
   * 1 nu.staldal.xmlutil.DocumentHandlerAdapter.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 25 IFNE L217 - true
   * 2 nu.staldal.xmlutil.DocumentHandlerAdapter.<init>(Lorg/xml/sax/DocumentHandler;)V: root-Branch
   * 3 nu.staldal.xmlutil.DocumentHandlerAdapter.startPrefixMapping(Ljava/lang/String;Ljava/lang/String;)V: I4 Branch 25 IFNE L217 - false
   */
  @Test
  public void test21()  throws Throwable  {
      HandlerBase handlerBase0 = new HandlerBase();
      DocumentHandlerAdapter documentHandlerAdapter0 = new DocumentHandlerAdapter((DocumentHandler) handlerBase0);
      documentHandlerAdapter0.startPrefixMapping("", "");
      documentHandlerAdapter0.startPrefixMapping("Gg[hk:xYx8_@!,zh7", "Gg[hk:xYx8_@!,zh7");
  }
}
