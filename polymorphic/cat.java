package polymorphic;

public class cat extends pet{
    @Override
    public void play() {

        System.out.println("猫的健康值减少10，和主人密度增加10");
    }
}
