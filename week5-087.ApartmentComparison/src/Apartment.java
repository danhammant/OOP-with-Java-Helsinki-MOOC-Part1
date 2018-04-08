
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (this.rooms > otherApartment.rooms) {
            return true;
        }

        if (this.rooms == otherApartment.rooms && this.squareMeters > otherApartment.squareMeters) {
            return true;
        }

        return false;
    }

    public int priceDifference(Apartment otherApartment) {
        int thisApartmentPrice = this.squareMeters * this.pricePerSquareMeter;

        if (moreExpensiveThan(otherApartment)) {
            return (thisApartmentPrice - (otherApartment.squareMeters * otherApartment.pricePerSquareMeter));
        }

        return ((otherApartment.squareMeters * otherApartment.pricePerSquareMeter) - thisApartmentPrice);
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        int thisApartmentPrice = this.squareMeters * this.pricePerSquareMeter;

        if (thisApartmentPrice > (otherApartment.squareMeters * otherApartment.pricePerSquareMeter)) {
            return true;
        }

        return false;
    }
}
