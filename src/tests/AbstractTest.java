package tests;

public abstract class AbstractTest {
    protected Item[] items = Item.values();
    protected long start, end;

    public abstract TestResult runTest(int numberOfObjects);

    protected long getRam() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }
}
