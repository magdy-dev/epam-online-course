package test4.time;

public class Time {
    private int  hour;
    private int  mint ;
    private int  second;

    public void setTime(int  hour,int mint,int second ){
        this.hour=((hour < 0 && hour > 24 ) ? 0:hour);
        this.mint=((mint < 0 && mint > 60 ) ? 0:mint);
        this.second=((second < 0 && second > 60 ) ? 0:second);

    }

    public String toMilitary(){
        return  String.format("%o2d:%o2d:%o2d",hour,mint,second);
    }

public  String  toString(){
        return String.format("%d:%o2d:%o2d",((hour==0||hour==12)?12:hour%12),mint,second,(hour<12?"AM":"PM"));
}
}