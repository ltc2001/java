
public class Pointdemo {
    int x;
    int y;
    //设置二维的坐标点
    public void set(int xx ,int yy) {
        x = xx;
        y = yy;
    }
    public double caledistanc(Pointdemo p){
        return Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
    }

    public static void main(String[] args) {
        Pointdemo p1=new Pointdemo();
        p1.set(3,4);
        Pointdemo p2=new Pointdemo();
        p2.set(5,6);
        System.out.println(p1.caledistanc(p2));
    }
}
