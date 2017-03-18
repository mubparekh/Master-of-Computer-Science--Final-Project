/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.jsecurity.JSecurityException;
import org.jsecurity.config.IniConfiguration;
import org.jsecurity.io.ResourceException;

public class TextConfigurationEvoSuiteTest {


  //Test case number: 0
  /*
   * 7 covered goals:
   * 1 org.jsecurity.config.TextConfiguration.loadTextConfig(Ljava/lang/String;)V: root-Branch
   * 2 org.jsecurity.config.TextConfiguration.init()V: I17 Branch 2 IFNULL L78 - false
   * 3 org.jsecurity.config.TextConfiguration.init()V: I22 Branch 3 IFEQ L79 - false
   * 4 org.jsecurity.config.TextConfiguration.setConfig(Ljava/lang/String;)V: root-Branch
   * 5 org.jsecurity.config.TextConfiguration.getConfig()Ljava/lang/String;: root-Branch
   * 6 org.jsecurity.config.TextConfiguration.<init>()V: root-Branch
   * 7 org.jsecurity.config.TextConfiguration.init()V: I8 Branch 1 IFNONNULL L76 - false
   */
  @Test
  public void test0()  throws Throwable  {
      IniConfiguration iniConfiguration0 = new IniConfiguration();
      iniConfiguration0.setConfig("Z,Td|");
      try {
        iniConfiguration0.init();
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Unable to load from text configuration.
         */
      }
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 org.jsecurity.config.TextConfiguration.init()V: I8 Branch 1 IFNONNULL L76 - true
   * 2 org.jsecurity.config.TextConfiguration.getConfig()Ljava/lang/String;: root-Branch
   * 3 org.jsecurity.config.TextConfiguration.<init>()V: root-Branch
   * 4 org.jsecurity.config.TextConfiguration.init()V: I8 Branch 1 IFNONNULL L76 - false
   * 5 org.jsecurity.config.TextConfiguration.init()V: I17 Branch 2 IFNULL L78 - true
   */
  @Test
  public void test1()  throws Throwable  {
      IniConfiguration iniConfiguration0 = new IniConfiguration();
      iniConfiguration0.init();
      iniConfiguration0.init();
      assertNull(iniConfiguration0.getConfig());
  }
}
