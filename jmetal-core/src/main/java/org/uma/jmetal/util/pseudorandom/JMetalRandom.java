package org.uma.jmetal.util.pseudorandom;

import org.uma.jmetal.util.pseudorandom.impl.JavaRandomGenerator;

/**
 * Created by ajnebro on 24/10/14.
 */
public class JMetalRandom {
  private static JMetalRandom instance ;
  private PseudoRandomGenerator randomGenerator ;

  private JMetalRandom() {
    randomGenerator = new JavaRandomGenerator() ;
  }

  public static JMetalRandom getInstance() {
    if (instance == null) {
      instance = new JMetalRandom() ;
    }
    return instance ;
  }

  public void setRandomGenerator(PseudoRandomGenerator randomGenerator) {
    this.randomGenerator = randomGenerator;
  }

  public int nextInt(int lowerBound, int upperBound) {
    return randomGenerator.nextInt(lowerBound, upperBound) ;
  }

  public double nextDouble() {
    return nextDouble(0.0, 1.0) ;
  }

  public double nextDouble(double lowerBound, double upperBound) {
    return randomGenerator.nextDouble(lowerBound, upperBound) ;
  }

  public void setSeed(long seed) {
    randomGenerator.setSeed(seed);
  }

  public long getSeed() {
    return randomGenerator.getSeed() ;
  }

  public String getGeneratorName() {
    return randomGenerator.getName() ;
  }
}
