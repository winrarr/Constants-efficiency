package tests.items;

public class Sword extends AbstractItem {
    @Override
    public int getWeight() {
        return 5;
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
