public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Jack", 33);
        h1.goWork();
        h1.goEat();


    }
}
class Human{
    String name1;
    int age1;
    int power = 100, hunger = 0,thirst = 0;
    public Human(String name, int age){
        this.name1 = name;
        this.age1 = age;
    }
    public void goWork() {
        if(power<5||hunger>90||thirst>70){
            System.out.println("You can't work!");
        }
       else{
           power=-5;
           hunger=+10;
           thirst=+30;
        }

    }

    public void goEat() {
        if(hunger<10){

        }
    }
}
