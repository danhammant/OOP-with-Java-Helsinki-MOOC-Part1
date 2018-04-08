
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        return new Money(this.euros + added.euros, this.cents + added.cents);
    }

    public Money minus(Money decremented) {
        int newEuros = this.euros - decremented.euros;
        int newCents = this.cents - decremented.cents;
        Money minus = new Money (newEuros, newCents);
        if (minus.cents < 0) {
            minus = new Money ((newEuros) -1, 100 + newCents);
        }

        if (minus.euros < 0) {
            minus = new Money(0, 0);
        }


        return minus;
    }

    public boolean less(Money compared) {
        return (this.euros < compared.euros || this.euros == compared.euros && this.cents < compared.cents);
    }

}
