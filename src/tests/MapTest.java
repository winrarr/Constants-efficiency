package tests;

import java.util.*;

public class MapTest extends AbstractTest {
    @Override
    public TestResult runTest(int numerOfObjects) {
        long time = 0;

        HashMap<String, ItemConstant> attributes = new HashMap<>();

        for (Item item : items) {
            attributes.put(item.toString(),
                    new ItemConstant(item.getWeight(), item.isDroppable(), item.isUsedForCrafting()));
        }

        Random rand = new Random();
        for (int i = 0; i < numerOfObjects; i++) {
            String itemName = items[rand.nextInt(items.length)].toString();
            List<ItemConstant> itemList = new ArrayList<>();

            start = System.currentTimeMillis();

            String item = itemName;
            int a = attributes.get(item).getWeight();
            boolean b = attributes.get(item).isDroppable();
            boolean c = attributes.get(item).isUsedForCrafting();
            itemList.add(new ItemConstant(a, b, c));

            end = System.currentTimeMillis();

            time += end - start;
        }
        return new TestResult("Map", time, getRam());
    }
}
