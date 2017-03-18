/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.databene.jdbacl.ResultsWithMetadata;

public class ResultsWithMetadataEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.databene.jdbacl.ResultsWithMetadata.getResults()[[Ljava/lang/String;: root-Branch
   * 2 org.databene.jdbacl.ResultsWithMetadata.<init>([Ljava/lang/String;[[Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[6];
      String[][] stringArray1 = new String[5][3];
      ResultsWithMetadata resultsWithMetadata0 = new ResultsWithMetadata(stringArray0, stringArray1);
      String[][] stringArray2 = resultsWithMetadata0.getResults();
      assertSame(stringArray1, stringArray2);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.databene.jdbacl.ResultsWithMetadata.getColumnLabels()[Ljava/lang/String;: root-Branch
   * 2 org.databene.jdbacl.ResultsWithMetadata.<init>([Ljava/lang/String;[[Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[6];
      String[][] stringArray1 = new String[5][3];
      ResultsWithMetadata resultsWithMetadata0 = new ResultsWithMetadata(stringArray0, stringArray1);
      String[] stringArray2 = resultsWithMetadata0.getColumnLabels();
      assertSame(stringArray0, stringArray2);
  }
}
