
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;

    }

    public boolean largerThan(Apartment compared){
        return (this.squares>compared.squares);
    }

    public int priceDifference(Apartment compared){
        int price=this.squares*this.princePerSquare;
        int comparedPrice=compared.squares*compared.princePerSquare;
        int priceDifference= price-comparedPrice;

        if(priceDifference<1){
            return priceDifference*-1;
        }

        return priceDifference;
    }

    public boolean moreExpensiveThan(Apartment compared){
        return ((this.squares*this.princePerSquare)>(compared.squares*compared.princePerSquare));
    }
    // private int price() {
    //     return princePerSquare * squares;
    // }
 
    // public int priceDifference(Apartment compared) {
    //     // Math.abs returns the absolute value
    //     return Math.abs(this.price() - compared.price());
    // }
 
    // public boolean moreExpensiveThan(Apartment compared) {
    //     return this.price() > compared.price();
    // }

}
