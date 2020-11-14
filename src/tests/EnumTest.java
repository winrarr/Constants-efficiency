package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnumTest extends AbstractTest {
    @Override
    public TestResult runTest(int numerOfObjects) {
        long time = 0;

        for (int i = 0; i < numerOfObjects; i++) {
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
}