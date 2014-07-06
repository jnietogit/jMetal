//  MOCellTest.java
//
//  Author:
//       Antonio J. Nebro <antonio@lcc.uma.es>
//
//  Copyright (c) 2014 Antonio J. Nebro
//
//  This program is free software: you can redistribute it and/or modify
//  it under the terms of the GNU Lesser General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or
//  (at your option) any later version.
//
//  This program is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public License
//  along with this program.  If not, see <http://www.gnu.org/licenses/>.

package org.uma.test.metaheuristic.multiobjective.mocell;

import org.junit.Test;
import org.uma.jmetal.core.Algorithm;
import org.uma.jmetal.core.SolutionSet;
import org.uma.jmetal.experiment.settings.MOCellSettings;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Created by Antonio J. Nebro on 30/06/14.
 */
public class MOCellTest {
  Algorithm algorithm;

  @Test
  public void testNumberOfReturnedSolutionsInEasyProblemWithAsyncMOCell1() throws IOException, ClassNotFoundException {
    algorithm = new MOCellSettings("Kursawe").configure("AsyncMOCell1") ;

    SolutionSet solutionSet = algorithm.execute() ;
    /*
    Rationale: the default problem is Kursawe, and usually AsyncMOCell1, configured with standard
    settings, should return 100 solutions
     */
    int defaultMaxEvaluations = 25000 ;
    assertTrue(solutionSet.size() >= 98) ;
    //assertEquals(defaultMaxEvaluations, ((NSGAII) algorithm).getEvaluations());
  }

  @Test
  public void testNumberOfReturnedSolutionsInEasyProblemWithAsyncMOCell2() throws IOException, ClassNotFoundException {
    algorithm = new MOCellSettings("Kursawe").configure("AsyncMOCell2") ;

    SolutionSet solutionSet = algorithm.execute() ;
    /*
    Rationale: the default problem is Kursawe, and usually AsyncMOCell2, configured with standard
    settings, should return 100 solutions
     */
    int defaultMaxEvaluations = 25000 ;
    assertTrue(solutionSet.size() >= 98) ;
    //assertEquals(defaultMaxEvaluations, ((NSGAII) algorithm).getEvaluations());
  }

  @Test
  public void testNumberOfReturnedSolutionsInEasyProblemWithAsyncMOCell3() throws IOException, ClassNotFoundException {
    algorithm = new MOCellSettings("Kursawe").configure("AsyncMOCell3") ;

    SolutionSet solutionSet = algorithm.execute() ;
    /*
    Rationale: the default problem is Kursawe, and usually AsyncMOCell3, configured with standard
    settings, should return 100 solutions
     */
    int defaultMaxEvaluations = 25000 ;
    assertTrue(solutionSet.size() >= 98) ;
    //assertEquals(defaultMaxEvaluations, ((NSGAII) algorithm).getEvaluations());
  }

  @Test
  public void testNumberOfReturnedSolutionsInEasyProblemWithAsyncMOCell4() throws IOException, ClassNotFoundException {
    algorithm = new MOCellSettings("Kursawe").configure("AsyncMOCell4") ;

    SolutionSet solutionSet = algorithm.execute() ;
    /*
    Rationale: the default problem is Kursawe, and usually AsyncMOCell4, configured with standard
    settings, should return 100 solutions
     */
    int defaultMaxEvaluations = 25000 ;
    assertTrue(solutionSet.size() >= 98) ;
    //assertEquals(defaultMaxEvaluations, ((NSGAII) algorithm).getEvaluations());
  }

  @Test
  public void testNumberOfReturnedSolutionsInEasyProblemWithSyncMOCell1() throws IOException, ClassNotFoundException {
    algorithm = new MOCellSettings("Kursawe").configure("SyncMOCell1") ;

    SolutionSet solutionSet = algorithm.execute() ;
    /*
    Rationale: the default problem is Kursawe, and usually SyncMOCell1, configured with standard
    settings, should return 100 solutions
     */
    int defaultMaxEvaluations = 25000 ;
    assertTrue(solutionSet.size() >= 98) ;
    //assertEquals(defaultMaxEvaluations, ((NSGAII) algorithm).getEvaluations());
  }

  public void testNumberOfReturnedSolutionsInEasyProblemWithSyncMOCell2() throws IOException, ClassNotFoundException {
    algorithm = new MOCellSettings("Kursawe").configure("SyncMOCell2") ;

    SolutionSet solutionSet = algorithm.execute() ;
    /*
    Rationale: the default problem is Kursawe, and usually SyncMOCell2, configured with standard
    settings, should return 100 solutions
     */
    int defaultMaxEvaluations = 25000 ;
    assertTrue(solutionSet.size() >= 98) ;
    //assertEquals(defaultMaxEvaluations, ((NSGAII) algorithm).getEvaluations());
  }
}