import tests.*;

public class Test {
    private final int tests = 100;
    private final int n = 800000;

    public void run() {
        testNTimes("Enum", new EnumTest()).showResult();
        testNTimes("Map", new MapTest()).showResult();
        testNTimes("Class", new ClassTest()).showResult();
    }

    private TestResult testNTimes(String testName, AbstractTest test) {
        long timeTotal = 0;
        long ramTotal = 0;

        for (int i = 0; i < tests; i++) {
            TestResult result = test.runTest(n);
            timeTotal += result.getTime();
            ramTotal += result.getRam();
        }

        return new TestResult(testName, timeTotal / tests, ramTotal / tests);
    }
}