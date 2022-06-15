class Dog{

    String dog(){
        return "강아지";
    }

}

class Maltese extends Dog{
    String dog(){
        return "말티즈";
    }
}
class Bichon extends Dog{
    String dog(){
        return "비숑";
    }
}

public class OverRiding {
    public static void main(String[] args) {
        Dog d = new Dog();
        Maltese m = new Maltese();
        Bichon b = new Bichon();
        System.out.println(d.dog());
        System.out.println(m.dog());
        System.out.println(b.dog());
        
    }
}
