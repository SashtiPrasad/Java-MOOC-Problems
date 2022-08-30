public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        int numberCount=0;
        this.count=numberCount;
    }

    public void addNumber(int number) {
        this.count+=1;
        int sum=number;
        this.sum+=sum;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if(this.sum == 0 && this.count == 0){
            double avg=0.0;
            return avg;
        }else{
            double avg=(double)this.sum/this.count;
            return avg;
        }
        
        
    }
}