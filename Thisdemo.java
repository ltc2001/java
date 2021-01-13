import javax.xml.namespace.QName;

public class Thisdemo {
    String name;
    int age;

    public Thisdemo(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void test1(){
        System.out.println("test1");

    }
    public void test2(){
        System.out.println("test2");
        this.test1();
    }

    public static void main(String[] args) {
        Thisdemo td = new Thisdemo("zhangsan",20 );
        System.out.println(td.name);
        System.out.println(td.age);
        td.test2();


    }
}
