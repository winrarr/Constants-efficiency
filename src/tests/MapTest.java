package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class MapTest extends AbstractTest {
    @Override
    public TestResult runTest(int numberOfObjects) {
        long time = 0;

        HashMap<String, ItemConstant> attributes = new HashMap<>();

        Item[] items = Item.values();

        for (Item item : items) {
            attributes.put(item.toString(),
                    new ItemConstant(item.getWeight(), item.isDroppable(), item.isUsedForCrafting()));
        }

        Random rand = new Random();
        for (int i = 0; i < numberOfObjects; i++) {
            String itemName = items[rand.nextInt(items.length)].toString();
            List<ItemConstant> itemList = new ArrayList<>();

            long start = System.currentTimeMillis();

            String item = itemName;
            int a = attributes.get(item).getWeight();
            boolean b = attributes.get(item).isDroppable();
            boolean c = attributes.get(item).isUsedForCrafting();
            itemList.add(new ItemConstant(a, b, c));

            long end = System.currentTimeMillis();

            time += end - start;
        }
        return new TestResult("Map", time, getRam());
    }
}
