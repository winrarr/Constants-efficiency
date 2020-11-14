package tests;

import tests.items.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class ClassTest extends AbstractTest {

    @Override
    public TestResult runTest(int numberOfObjects) {
        long time = 0;

        ArrayList<Supplier<AbstractItem>> items = new ArrayList<>();

        items.add(Feather::new);
        items.add(Gold::new);
        items.add(Metal::new);
        items.add(Silver::new);
        items.add(Stone::new);
        items.add(Sword::new);
        items.add(Wood::new);

        Random rand = new Random();
        for (int i = 0; i < numberOfObjects; i++) {
            AbstractItem itemClass = items.get(rand.nextInt(items.size())).get();
            List<ItemConstant> itemList = new ArrayList<>();

            long start = System.currentTimeMillis();

            AbstractItem item = itemClass;
            int a = item.getWeight();
            boolean b = item.isDroppable();
            boolean c = item.isUsedForCrafting();
            itemList.add(new ItemConstant(a, b, c));

            long end = System.currentTimeMillis();

            time += end - start;
        }
        return new TestResult("Class", time, getRam());
    }
}
