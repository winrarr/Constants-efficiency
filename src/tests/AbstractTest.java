package tests;

public abstract class AbstractTest {
    protected long start, end;
    public abstract TestResult runTest(int numerOfObjects);
    protected long getRam() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }
}
