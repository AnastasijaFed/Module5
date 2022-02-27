public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Jack", 33);
        h1.goEat();
        h1.goWork();
        h1.goDrink();
        h1.goWork();
        h1.goEat();
        h1.goSleep();
        h1.printProperties();


    }
}
class Human{
    String name1;
    int age1;
    private int power = 100, hunger = 0,thirst = 0, fitness = 0, happiness = 100;
    public Human(String name, int age){
        this.name1 = name;
        this.age1 = age;
    }
    public void goWork() {
        if(power<5||hunger>90||thirst>70||happiness<10){
            System.out.println("You can't work!");
        }
       else{
           power=power-5;
           hunger=hunger+10;
           thirst=thirst+30;
           happiness=happiness-10;

        }

    }

    public void goEat() {
        if(hunger==0){
            System.out.println("You're full");
        }
        else if(hunger < 40){
             hunger = 0;
            thirst=thirst+5;
            if(power == 100)power = 100;
            else power = power + 10;
        }
        else if(hunger > 40){
            hunger=hunger-40;
            thirst=thirst+5;
           if(power==100) power =100;
           else power = power + 10;
        }
    }

    public void printProperties() {
        System.out.println("Hunger is "+hunger);
        System.out.println("Power is "+power);
        System.out.println("Thirst is "+thirst);
    }

    public void goDrink() {
        if(thirst==0){
            System.out.println("There is no need to drink");
        }
        else if (thirst < 20){
            thirst = 0;
            if(power==100) power =100;
            else power =power + 5;
        }
        else {
            thirst = thirst - 20;
            if(power==100) power =100;
            else power = power + 5;
        }
    }

    public void goSleep() {
        if(power == 100){
            System.out.println("You won't fall asleep, try exercising");
            goExercise();
        }
        else power = 100;

    }

    public void goExercise() {
        if(power<10){
            System.out.println("You can't exercise, go take a nap");
            goSleep();
        }
        else power = power - 10;
    }
}
