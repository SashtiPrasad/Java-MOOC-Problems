public class Timer {
    private ClockHand Hseconds;
    private ClockHand seconds;

    public Timer(){
        this.Hseconds=new ClockHand(100);
        this.seconds=new ClockHand(60);
    }

    public void advance(){
        this.Hseconds.advance();

        if(this.Hseconds.value() ==0){
            this.seconds.advance();
        }
    }

    public String toString(){
        return seconds+":"+Hseconds;
    }
}
