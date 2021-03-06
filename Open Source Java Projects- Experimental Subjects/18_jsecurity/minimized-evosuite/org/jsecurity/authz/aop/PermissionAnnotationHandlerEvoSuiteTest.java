/*
 * This file was automatically generated by EvoSuite
 */

package org.jsecurity.authz.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.lang.annotation.Annotation;
import org.jsecurity.authz.AuthorizationException;
import org.jsecurity.authz.aop.PermissionAnnotationHandler;

public class PermissionAnnotationHandlerEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.aop.PermissionAnnotationHandler.getAnnotationValue(Ljava/lang/annotation/Annotation;)Ljava/lang/String;: root-Branch
   * 2 org.jsecurity.authz.aop.PermissionAnnotationHandler.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      PermissionAnnotationHandler permissionAnnotationHandler0 = new PermissionAnnotationHandler();
      // Undeclared exception!
      try {
        permissionAnnotationHandler0.getAnnotationValue((Annotation) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.jsecurity.authz.aop.PermissionAnnotationHandler.assertAuthorized(Ljava/lang/annotation/Annotation;)V: I4 Branch 1 IFNE L68 - false
   * 2 org.jsecurity.authz.aop.PermissionAnnotationHandler.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      PermissionAnnotationHandler permissionAnnotationHandler0 = new PermissionAnnotationHandler();
      permissionAnnotationHandler0.assertAuthorized((Annotation) null);
  }
}
