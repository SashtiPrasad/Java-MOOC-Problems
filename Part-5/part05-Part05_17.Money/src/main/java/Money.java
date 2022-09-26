
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){
        Money newMoney = new Money((this.euros+addition.euros),(this.cents+addition.cents));
        return newMoney;
    }

    public boolean lessThan(Money compared){
        if(this.euros==compared.euros){
            return this.cents<compared.cents;
        }
        return this.euros<compared.euros;
    }
    

    public Money minus(Money decreaser){
        Money newMoney = new Money(euros,cents);

        if(this.euros>decreaser.euros && this.cents<decreaser.cents){
            int calcCents=(this.cents+100)-decreaser.cents;
            int calcEuros=this.euros-decreaser.euros-1;
            newMoney= new Money(calcEuros, calcCents);
        }
        
        if(this.euros>=decreaser.euros && (this.cents>=decreaser.cents)){
            int calcCents=this.cents-(decreaser.cents);
            if(decreaser.cents==0 && this.cents!=0){
                calcCents=(decreaser.cents+100)-this.cents;
            }
            int calcEuros=this.euros-decreaser.euros;
            newMoney= new Money(calcEuros, calcCents);
        }
        
        if(this.lessThan(decreaser)){
            newMoney= new Money(0,00);
        }

        return newMoney;
    }
}
