package test;

public abstract class vehicle {
    private int num;
    private String brand;
    public abstract int time(int day);
    public vehicle(){

    }
    public vehicle(int num,String brand){
        this.num=num;
        this.brand=brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setNum(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }

}
