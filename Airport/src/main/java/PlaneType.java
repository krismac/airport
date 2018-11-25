public enum PlaneType {


    BOEING737(189),
    AIRBUSA300(186),
    AIRBUSA320(335),
    FAIRCHILDSA227( 20),
    EMBRAER145(49);

    private final int capacity;

    PlaneType(int capacity) { this.capacity = capacity;}

    public int getCapacity() { return this.capacity; }

}
