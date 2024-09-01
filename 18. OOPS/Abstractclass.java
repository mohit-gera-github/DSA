public class Abstractclass {
    public static void main(String[] args) {
        horse h1 = new horse();
        h1.walk();
        h1.eat();

        mustang m1 = new mustang();
    }
}

abstract class animal{
    
    String color;
    animal(){
        color= "brown";
        System.out.println("Constructor of Animal is called");
    }
    void eat(){
        System.out.println("Animal eats..");
    }
    abstract void walk();
}

class horse extends animal{
    horse(){
        System.out.println("Constructor of horse is called");
    }
    void walk(){
        System.out.println("4 legs");
    }
    void changecolor(String str){
        color = str;
    }
}

class chicken extends animal{

    void walk(){
        System.out.println("2 legs");
    }
    void changecolor(String str){
        color = str;
    }
}

class mustang extends horse{
    mustang(){
        System.out.println("Constructor of mustang is called");
    }
}
