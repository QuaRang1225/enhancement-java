abstract class Lower{

    abstract void move(int x);
    void start(){   System.out.println("운동시작!"); }
}
interface  Upper{                     
    void move(int x,int y);      //public abstract가 생략상태
    void OneRm(Upper a);
    
}
class Body extends Lower implements Upper{

    String sentence = "";

    String MakeSentence(Body s){
        sentence = s.toString().substring(0, s.toString().length() -9);
        return sentence;
    }
    public void move(int x){                    //오버라이딩 : 조상보다 접근제어자의 범위가 좁으면 안됨
        System.out.println("스쿼트 : " + x +"kg");
    }
    public void move(int x,int y){                      //move 메서드 오버로딩
        System.out.println("벤치프레스 : " + x +"kg");
        System.out.println("데드리프트 : " + y + "kg");
    }
    public void OneRm(Upper a){

        MakeSentence((Body)a);
        System.out.println("");
        System.out.println(sentence+" 3대측정완료");
    }
 
    Upper UpperGrow(){
        
        Upper u = new Body();
        return u;
    }
    Lower LowerGrow(){
        Lower l = new Body();
        return l;
    }
}
public class InterFace {
    public static void main(String[] args) {

        Body b = new Body();                //자식 클래스 객체 생성

        //Upper upper = b.UpperGrow();           //인터페이스 타입의 변수에 자식 클래스 객체 생성
        //Lower lower = b.LowerGrow();

        //String up = b.MakeSentence((Body)upper);
        //String lo = b.MakeSentence((Body)lower);
        
        String up = b.MakeSentence((Body)b.UpperGrow());
        String lo = b.MakeSentence((Body)b.LowerGrow());

        Lower l = new Body();               //추상메서드 형태의 객체를 생성하면 자식 클래스에서 구현부 사용 불가
        Upper u = new Body();               //인터페이스 형태의 객체를 생성하면 자식 클래스에서 구현부 사용 불가
        
        l.start();
        l.move(250);
        System.out.println(lo + " 하체 측정 성공!");

        u.move(200,300);
        System.out.println(up+ " 상체 측정 성공!");

        u.OneRm(new Body());
        
        
    }
}
