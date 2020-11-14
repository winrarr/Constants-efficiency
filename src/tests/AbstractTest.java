package tests;

public abstract class AbstractTest {
    public abstract TestResult runTest(int numberOfObjects);

    protected long getRam() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }
}
