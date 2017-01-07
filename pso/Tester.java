// javac -classpath :jcommon.jar:jfreechart.jar Tester.java
// java -cp :jcommon.jar:jfreechart.jar Tester

public class Tester {
  ParticleSwarmOptimization pso;

  public void test(int particleCount, int demension, int epochs, double minShreshold, double maxShreshold, String objType) {
    pso = new ParticleSwarmOptimization(particleCount, demension, epochs, minShreshold, maxShreshold, objType);
    pso.algorithm();
  }

  public static void main(String[] args) {
    Tester tester = new Tester();
    tester.test(40, 2, 100, -5, 5, "shpere");
    // argument: (particleCount, demension, minShreshold, maxShreshold, epochs, objType)
    // objType: shpere, threshold: [-5.0, 5.0]
    // objType: rastrigin, threshold: [-5.0, 5.0]
    // objType: rosenbrock, threshold: [-5.0, 5.0]
    // objType: griewank, threshold: [-600.0, 600.0]
    // objType: alpine, threshold: [-10.0, 10.0]
    // objType: minima, threshold: [-5.0, 5.0]
  }
}
