package test;

public class bus extends vehicle {
    private int seatcount;

    @Override
    public int time(int day) {
        if (seatcount>16){
            return 1500*day;
        }else {
            return 800*day;
        }
    }
    public bus(){

    }
    public bus(int seatcount){
        this.seatcount=seatcount;
    }
    public bus(int num,String brand,int seatcount){
        super(num, brand);
        this.seatcount=seatcount;
    }


    public void setSeatcount(int seatcount) {
        this.seatcount=seatcount;
    }


    public int getSeatcount() {
        return seatcount;
    }
}
