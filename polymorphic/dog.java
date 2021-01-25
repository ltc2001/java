package polymorphic;

public class dog extends pet {

    @Override
    public void play() {
        System.out.println("狗的健康值减少10，和主任亲密度增加5");
    }
}
