package tests;

public enum Item {
    FEATHER(0),
    GOLD(1, true),
    METAL(1),
    SILVER(1),
    STONE(2),
    SWORD(5, true),
    WOOD(1, true);

    private final int weight;
    private final boolean droppable;
    private final boolean usedForCrafting;

    Item(int weight) {
        this(weight, false, false);
    }

    Item(int weight, boolean droppable) {
        this(weight, droppable, false);
    }

    Item(int weight, boolean droppable, boolean usedForCrafting) {
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