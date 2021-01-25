package test;

public class car extends vehicle {
    private String type;

    @Override
    public int time(int day) {
       if (type.equals("0")){
           return 600*day;
       }else if(type.equals("1")){
           return 500*day;
       }else if(type.equals("2")){
           return 300*day;
       }else
           System.out.println("类型不匹配");
           return 0;


        }
        public car(){

        }
        public car(String type){
        this.type=type;
        }
        public car(int num,String brand,String type){
        super(num,brand);
        this.type=type;
        }
        public void setType(String type){
        this.type=type;
        }
        public String getType(){
        return type;
        }


}
