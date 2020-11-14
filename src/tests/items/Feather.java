package tests.items;

public class Feather extends AbstractItem {
    @Override
    public int getWeight() {
        return 0;
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
