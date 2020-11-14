package tests;

public class TestResult {
    private final String testName;
    private final long time;
    private final long ram;

    public TestResult(String testName, long time, long ram) {
        this.testName = testName;
        this.time = time;
        this.ram = ram;
    }

    public long getTime() {
        return time;
    }

    public long getRam() {
        return ram;
    }

    public void showResult() {
        StringBuilder print = new StringBuilder(testName + ":");
        addSpacesToNthCharacter(print, 8);
        print.append("[ RAM: ").append(ram / (1024 * 1024)).append(" mb");
        addSpacesToNthCharacter(print, 28);
        System.out.println(print + "-    Time: " + time + " ms ]");
    }

    private void addSpacesToNthCharacter(StringBuilder before, int n) {
        while (before.length() < n) {
            before.append(" ");
        }
    }
}
