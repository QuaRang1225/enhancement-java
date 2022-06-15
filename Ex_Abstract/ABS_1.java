abstract class Move{

    abstract void go(int pos);

     void stop(){
        System.out.println("멈춥니다.");
    }
}

class GoMove extends Move{

    void go(int pos){
        System.out.println((pos+10) + "만큼 앞으로 걸어갑니다.");
    }
  
 
        
}

class FlyMove extends Move{

    void go(int pos){
        System.out.println(pos+20 + "만큼 앞으로 걸어갑니다.");
    }
    void fly(int pos){
        System.out.println(pos+20 + "만큼 앞으로 날어갑니다.");
    }      
}      
    

class CrawlMove extends Move{

    void go(int pos){
        System.out.println(pos+30 + "만큼 앞으로 걸어갑니다.");
    }
    void crawl(int pos){
        System.out.println(pos+20 + "만큼 앞으로 기어갑니다.");
    }      
}

public class ABS_1 {
    public static void main(String[] args) {

           Move[] go = new Move[3];
           
           go[0] = new GoMove();
           go[1] = new FlyMove();
           go[2] = new CrawlMove();
           
           for(int i=0;i<go.length;i++){
               go[i].go(50);
           }       
        
    }
}
