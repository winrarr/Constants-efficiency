package tests.items;

public class Silver extends AbstractItem {
    @Override
    public int getWeight() {
        return 1;
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
