class Name{}
class Named extends Name{
    public void named(Name n){
        System.out.println("익명클래스");
    }
    
}

public class Nonameed {
    public static void main(String[] args) {
        Named n =new Named();
        n.named(new Named());
        n.named(new Name(){
            public void named(Name n){
                System.out.println("익명클래스");
            }
        });
    }
}