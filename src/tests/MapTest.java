package tests;

import java.util.*;

public class MapTest extends AbstractTest {
    @Override
    public TestResult runTest(int numerOfObjects) {
        long time = 0;

        start = System.currentTimeMillis();

        Map<String, ItemConstant> attributes = new HashMap<>();

        attributes.put("FEATHER", new ItemConstant(0));
        attributes.put("GOLD", new ItemConstant(1, true));
        attributes.put("METAL", new ItemConstant(1));
        attributes.put("SILVER", new ItemConstant(1, false));
        attributes.put("STONE", new ItemConstant(2));
        attributes.put("SWORD", new ItemConstant(5, true));
        attributes.put("WOOD", new ItemConstant(1, true));

        end = System.currentTimeMillis();

        time += end - start;

        Item[] items = Item.values();
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
