package tests;

public class ItemConstant {
    private final int weight;
    private final boolean droppable;
    private final boolean usedForCrafting;

    public ItemConstant(int weight) {
        this(weight, false, false);
    }

    public ItemConstant(int weight, boolean droppable) {
        this(weight, droppable, false);
    }

    public ItemConstant(int weight, boolean droppable, boolean usedForCrafting) {
        this.weight = weight;
        this.droppable = droppable;
        this.usedForCrafting = usedForCrafting;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isDroppable() {
        return droppable;
    }

    public boolean isUsedForCrafting() {
        return usedForCrafting;
    }
}
