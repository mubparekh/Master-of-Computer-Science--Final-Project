/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.realm.jndi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.TreeSet;
import org.jsecurity.realm.jndi.JndiRealmFactory;

public class JndiRealmFactoryEvoSuiteTest {


  //Test case number: 0
  /*
   * 5 covered goals:
   * 1 org.jsecurity.realm.jndi.JndiRealmFactory.getRealms()Ljava/util/Collection;: I8 Branch 2 IFNULL L103 - false
   * 2 org.jsecurity.realm.jndi.JndiRealmFactory.getRealms()Ljava/util/Collection;: I11 Branch 3 IFLE L103 - false
   * 3 org.jsecurity.realm.jndi.JndiRealmFactory.setJndiNames(Ljava/util/Collection;)V: root-Branch
   * 4 org.jsecurity.realm.jndi.JndiRealmFactory.<init>()V: root-Branch
   * 5 org.jsecurity.realm.jndi.JndiRealmFactory.getJndiNames()Ljava/util/Collection;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      JndiRealmFactory jndiRealmFactory0 = new JndiRealmFactory();
      TreeSet<String> treeSet0 = new TreeSet<String>();
      jndiRealmFactory0.setJndiNames((Collection<String>) treeSet0);
      try {
        jndiRealmFactory0.getRealms();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * One or more jndi names must be specified for the org.jsecurity.realm.jndi.JndiRealmFactory to locate Realms.
         */
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.jsecurity.realm.jndi.JndiRealmFactory.getJndiNames()Ljava/util/Collection;: root-Branch
   * 2 org.jsecurity.realm.jndi.JndiRealmFactory.getRealms()Ljava/util/Collection;: I8 Branch 2 IFNULL L103 - true
   */
  @Test
  public void test1()  throws Throwable  {
      JndiRealmFactory jndiRealmFactory0 = new JndiRealmFactory();
      try {
        jndiRealmFactory0.getRealms();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * One or more jndi names must be specified for the org.jsecurity.realm.jndi.JndiRealmFactory to locate Realms.
         */
      }
  }

  //Test case number: 2
  /*
   * 6 covered goals:
   * 1 org.jsecurity.realm.jndi.JndiRealmFactory.getRealms()Ljava/util/Collection;: I11 Branch 3 IFLE L103 - true
   * 2 org.jsecurity.realm.jndi.JndiRealmFactory.getRealms()Ljava/util/Collection;: I50 Branch 4 IFEQ L109 - false
   * 3 org.jsecurity.realm.jndi.JndiRealmFactory.setJndiNames(Ljava/util/Collection;)V: root-Branch
   * 4 org.jsecurity.realm.jndi.JndiRealmFactory.getJndiNames()Ljava/util/Collection;: root-Branch
   * 5 org.jsecurity.realm.jndi.JndiRealmFactory.setJndiNames(Ljava/lang/String;)V: I8 Branch 1 IFNONNULL L82 - true
   * 6 org.jsecurity.realm.jndi.JndiRealmFactory.getRealms()Ljava/util/Collection;: I8 Branch 2 IFNULL L103 - false
   */
  @Test
  public void test2()  throws Throwable  {
      JndiRealmFactory jndiRealmFactory0 = new JndiRealmFactory();
      jndiRealmFactory0.setJndiNames("<1UcJ}g0_NioaICy2");
      try {
        jndiRealmFactory0.getRealms();
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Unable to look up realm with jndi name '<1UcJ}g0_NioaICy2'.
         */
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.jsecurity.realm.jndi.JndiRealmFactory.setJndiNames(Ljava/lang/String;)V: I8 Branch 1 IFNONNULL L82 - false
   * 2 org.jsecurity.realm.jndi.JndiRealmFactory.<init>()V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      JndiRealmFactory jndiRealmFactory0 = new JndiRealmFactory();
      try {
        jndiRealmFactory0.setJndiNames((String) null);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * One or more comma-delimited jndi names must be specified for the org.jsecurity.realm.jndi.JndiRealmFactory to locate Realms.
         */
      }
  }
}
