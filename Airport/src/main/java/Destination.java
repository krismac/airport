public enum Destination {


    GLASGOW(50),
    EDINBURGH(100),
    LONDON(150),
    DUBLIN(200);


    private final int price;

    Destination(int price) {
        this.price = price;
    }

    //function that will return price
    public int getPrice() {
        return this.price;
    }

}
