package tests.items;

public class Stone extends AbstractItem {
    @Override
    public int getWeight() {
        return 2;
    }
    @Override
    public boolean isDroppable() {
        return false;
    }
    @Override
    public boolean isUsedForCrafting() {
        return false;
    }
}
