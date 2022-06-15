abstract class Move{
    abstract void go(int pos);
    abstract void stop();
}

class GoMove extends Move{

    void go(int pos){
        System.out.println((pos+10) + "만큼 앞으로 걸어갑니다.");
    }
    void stop(){
        System.out.println("멈춥니다.");
    }
 
          
}
       
    

class FlyMove extends Move{

    void go(int pos){
        System.out.println(pos+30 + "만큼 앞으로 걸어갑니다.");
    }
    void stop(){
        System.out.println("멈춥니다.");
    }
    void fly(int pos){
        System.out.println(pos+20 + "만큼 앞으로 날어갑니다.");
    }      
}

public class ABS {
    public static void main(String[] args) {

        Move f = new FlyMove();              
        f.go(60);
        f.stop();               
        
    }
}
