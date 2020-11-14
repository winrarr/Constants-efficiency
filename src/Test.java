import java.util.*;

public class Test {
    private long start, end;
    private final int tests = 100;
    private final int n = 800000;

    public void run() {
        long enumTimeTotal = 0;
        long enumRamTotal = 0;

        long mapTimeTotal = 0;
        long mapRamTotal = 0;

        for (int i = 0; i < tests; i++) {
            TestResult result = testEnum();
            enumTimeTotal += result.getTime();
            enumRamTotal += result.getRam();
        }

        new TestResult("Enum", enumTimeTotal / tests, enumRamTotal / tests).showResult();

        for (int i = 0; i < tests; i++) {
            TestResult result = testMap();
            mapTimeTotal += result.getTime();
            mapRamTotal += result.getRam();
        }

        new TestResult("Map", mapTimeTotal / tests, mapRamTotal / tests).showResult();
    }

    private TestResult testEnum() {
        long time = 0;

        for (int i = 0; i < n; i++) {
            Item[] items = Item.values();
            Item item = items[new Random().nextInt(items.length)];
            List<ItemConstant> itemList = new ArrayList<>();

            start = System.currentTimeMillis();

            int a = item.getWeight();
            boolean b = item.isDroppable();
            boolean c = item.isUsedForCrafting();
            itemList.add(new ItemConstant(a, b, c));

            end = System.currentTimeMillis();

            time += end - start;
        }
        return new TestResult("Enum", time, getRam());
    }

    private TestResult testMap() {
        long time = 0;

        start = System.currentTimeMillis();

        Map<String, ItemConstant> attributes = new HashMap<>();

        attributes.put("feather", new ItemConstant(0));
        attributes.put("gold", new ItemConstant(1, true));
        attributes.put("metal", new ItemConstant(1));
        attributes.put("silver", new ItemConstant(1, false));
        attributes.put("stone", new ItemConstant(2));
        attributes.put("sword", new ItemConstant(5, true));
        attributes.put("wood", new ItemConstant(1, true));

        end = System.currentTimeMillis();

        time += end - start;

        for (int i = 0; i < n; i++) {
            Item[] items = Item.values();
            String item = items[new Random().nextInt(items.length)].toString().toLowerCase();
            List<ItemConstant> itemList = new ArrayList<>();

            start = System.currentTimeMillis();

            int a = attributes.get(item).getWeight();
            boolean b = attributes.get(item).isDroppable();
            boolean c = attributes.get(item).isUsedForCrafting();
            itemList.add(new ItemConstant(a, b, c));

            end = System.currentTimeMillis();

            time += end - start;
        }
        return new TestResult("Map", time, getRam());
    }

    private long getRam() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }
}