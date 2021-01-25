package polymorphic;

public class person {

    public pet buypet(int type){
        if (type==1){
            return new dog();

        }else if(type==2){
            return new cat();
        }else{
            return null;
        }
    }
    public void play(pet pet){
        pet.play();
    }

    public static void main(String[] args) {
        person p=new person();
        pet dog=new dog();
        pet cat=new cat();
        p.play(dog);
        p.play(cat);
        pet pet=p.buypet(1);
        if(pet instanceof cat){
            System.out.println("买的是一只猫");
        }else if(pet instanceof dog){
            System.out.println("买的是一只狗");
        }


    }

}
