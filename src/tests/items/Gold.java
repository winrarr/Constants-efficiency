package tests.items;

public class Gold extends AbstractItem {
    @Override
    public int getWeight() {
        return 1;
    }
    @Override
    public boolean isDroppable() {
        return true;
    }
    @Override
    public boolean isUsedForCrafting() {
        return false;
    }
}
