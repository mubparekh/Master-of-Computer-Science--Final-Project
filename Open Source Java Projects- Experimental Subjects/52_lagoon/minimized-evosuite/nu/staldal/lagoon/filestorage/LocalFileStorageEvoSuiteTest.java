/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.lagoon.filestorage;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import nu.staldal.lagoon.core.LagoonContext;
import nu.staldal.lagoon.filestorage.LocalFileStorage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class LocalFileStorageEvoSuiteTest {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
  } 

  @Before 
  public void initTestCase(){ 
  } 

  @After 
  public void doneWithTestCase(){ 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.filestorage.LocalFileStorage.close()V: root-Branch
   * 2 nu.staldal.lagoon.filestorage.LocalFileStorage.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      LocalFileStorage localFileStorage0 = new LocalFileStorage();
      localFileStorage0.close();
      assertEquals(false, localFileStorage0.needPassword());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.filestorage.LocalFileStorage$LocalOutputHandler.commit()V: root-Branch
   * 2 nu.staldal.lagoon.filestorage.LocalFileStorage$LocalOutputHandler.<init>(Ljava/io/File;Ljava/io/OutputStream;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      LocalFileStorage.LocalOutputHandler localFileStorage_LocalOutputHandler0 = new LocalFileStorage.LocalOutputHandler((File) null, (OutputStream) null);
      // Undeclared exception!
      try {
        localFileStorage_LocalOutputHandler0.commit();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.filestorage.LocalFileStorage.open(Ljava/lang/String;Lnu/staldal/lagoon/core/LagoonContext;Ljava/lang/String;)V: I13 Branch 3 IFEQ L77 - true
   */
  @Test
  public void test4()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          LocalFileStorage localFileStorage0 = new LocalFileStorage();
          // Undeclared exception!
          try {
            localFileStorage0.open("", (LagoonContext) null, "");
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (\"java.io.FilePermission\" \"\" \"write\")
             * java.lang.Thread.getStackTrace(Thread.java:1589)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             * java.io.File.mkdir(File.java:1305)
             * nu.staldal.lagoon.filestorage.LocalFileStorage.open(LocalFileStorage.java:85)
             * sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             * sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
             * sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             * java.lang.reflect.Method.invoke(Method.java:606)
             * org.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:262)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask.run(FutureTask.java:262)
             * java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
             * java.lang.Thread.run(Thread.java:745)
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.filestorage.LocalFileStorage.fileLastModified(Ljava/lang/String;)J: I19 Branch 6 IFGE L121 - true
   * 2 nu.staldal.lagoon.filestorage.LocalFileStorage.fileLastModified(Ljava/lang/String;)J: I40 Branch 7 IFNE L124 - false
   */
  @Test
  public void test5()  throws Throwable  {
      LocalFileStorage localFileStorage0 = new LocalFileStorage();
      long long0 = localFileStorage0.fileLastModified("pt*/@)");
      assertEquals(0L, long0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.filestorage.LocalFileStorage.fileLastModified(Ljava/lang/String;)J: I19 Branch 6 IFGE L121 - false
   */
  @Test
  public void test6()  throws Throwable  {
      LocalFileStorage localFileStorage0 = new LocalFileStorage();
      long long0 = localFileStorage0.fileLastModified("]g~cm^:cu]KXkQ4");
      assertEquals(0L, long0);
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.filestorage.LocalFileStorage.createFile(Ljava/lang/String;)Lnu/staldal/lagoon/core/OutputHandler;: I19 Branch 8 IFGE L144 - true
   * 2 nu.staldal.lagoon.filestorage.LocalFileStorage.createFile(Ljava/lang/String;)Lnu/staldal/lagoon/core/OutputHandler;: I40 Branch 9 IFNE L147 - false
   */
  @Test
  public void test7()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          LocalFileStorage localFileStorage0 = new LocalFileStorage();
          // Undeclared exception!
          try {
            localFileStorage0.createFile("pt*/@)");
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (\"java.io.FilePermission\" \"t*\" \"write\")
             * java.lang.Thread.getStackTrace(Thread.java:1589)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             * java.io.File.mkdir(File.java:1305)
             * nu.staldal.lagoon.filestorage.LocalFileStorage.createFile(LocalFileStorage.java:148)
             * sun.reflect.GeneratedMethodAccessor29.invoke(Unknown Source)
             * sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             * java.lang.reflect.Method.invoke(Method.java:606)
             * org.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:262)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask.run(FutureTask.java:262)
             * java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
             * java.lang.Thread.run(Thread.java:745)
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.filestorage.LocalFileStorage.createFile(Ljava/lang/String;)Lnu/staldal/lagoon/core/OutputHandler;: I19 Branch 8 IFGE L144 - false
   */
  @Test
  public void test8()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          LocalFileStorage localFileStorage0 = new LocalFileStorage();
          // Undeclared exception!
          try {
            localFileStorage0.createFile(" ");
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (\"java.io.FilePermission\" \"\" \"write\")
             * java.lang.Thread.getStackTrace(Thread.java:1589)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:209)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:171)
             * nu.staldal.lagoon.filestorage.LocalFileStorage.createFile(LocalFileStorage.java:155)
             * sun.reflect.GeneratedMethodAccessor29.invoke(Unknown Source)
             * sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             * java.lang.reflect.Method.invoke(Method.java:606)
             * org.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:262)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask.run(FutureTask.java:262)
             * java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
             * java.lang.Thread.run(Thread.java:745)
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * 1 nu.staldal.lagoon.filestorage.LocalFileStorage.deleteFile(Ljava/lang/String;)V: I19 Branch 11 IFGE L175 - true
   * 2 nu.staldal.lagoon.filestorage.LocalFileStorage.deleteFile(Ljava/lang/String;)V: I40 Branch 12 IFNE L178 - false
   */
  @Test
  public void test9()  throws Throwable  {
      LocalFileStorage localFileStorage0 = new LocalFileStorage();
      localFileStorage0.deleteFile("pt*/@)");
      assertEquals(true, localFileStorage0.isReentrant());
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * 1 nu.staldal.lagoon.filestorage.LocalFileStorage.deleteFile(Ljava/lang/String;)V: I19 Branch 11 IFGE L175 - false
   * 2 nu.staldal.lagoon.filestorage.LocalFileStorage.deleteFile(Ljava/lang/String;)V: I65 Branch 13 IFNE L183 - false
   * 3 nu.staldal.lagoon.filestorage.LocalFileStorage.<init>()V: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      LocalFileStorage localFileStorage0 = new LocalFileStorage();
      localFileStorage0.deleteFile("]g~cm^:cu]KXkQ4");
      assertEquals(false, localFileStorage0.needPassword());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 nu.staldal.lagoon.filestorage.LocalFileStorage$LocalOutputHandler.discard()V: I10 Branch 1 IFNE L215 - true
   */
  @Test
  public void test11()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          File file0 = new File("", "");
          PipedInputStream pipedInputStream0 = new PipedInputStream(1);
          PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
          LocalFileStorage.LocalOutputHandler localFileStorage_LocalOutputHandler0 = new LocalFileStorage.LocalOutputHandler(file0, (OutputStream) pipedOutputStream0);
          // Undeclared exception!
          try {
            localFileStorage_LocalOutputHandler0.discard();
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (\"java.io.FilePermission\" \"/\" \"delete\")
             * java.lang.Thread.getStackTrace(Thread.java:1589)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkDelete(SecurityManager.java:1007)
             * java.io.File.delete(File.java:1030)
             * nu.staldal.lagoon.filestorage.LocalFileStorage$LocalOutputHandler.discard(LocalFileStorage.java:216)
             * sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             * sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
             * sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             * java.lang.reflect.Method.invoke(Method.java:606)
             * org.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:262)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask.run(FutureTask.java:262)
             * java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
             * java.lang.Thread.run(Thread.java:745)
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }
}