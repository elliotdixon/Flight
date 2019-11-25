
public enum PlaneType {
    AIRBUS(3, 150),
    BOEING(5, 250),
    SEVENFORTYSEVEN(2, 120);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacityFromEnum() {
        return capacity;
    }
}