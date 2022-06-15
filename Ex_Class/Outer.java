class Out{
    private int outerIv = 0;
    static int outerCv = 0;
 
    class InstanceInner{
         int iiv = outerIv;         //외부 클래스의 private맴버도 접근 가능
         int iiv2 = outerCv;
    }
    static class StaticInner{       
     //int siv = outerIv;           //스태틱 클래스는 외부 클래스의 인스턴스 맴버에 접근 불거능
     static int scv = 300;
    }
    void myMethod(){
     int lv =0;     //선언 후 값이 바뀌지 않는 변수는 상수로 간주
     final int Lv = 0;      //jdk1.8부터 final 생략 가능 ^위에 말 참고
 
       class LocalInner{
         
         int liv = outerIv;     
         int liv2 = outerCv;
         //외부클래스의 지역변수는 final이 붙은 상수만 접근할수 있음
         int liv3 = lv;
         int live4 = Lv;
         
        }
        System.out.println("outerCv : " + Out.this.outerCv);
     
     }
 }
 public class Outer{
    public static void main(String[] args) {


        Out oc =new Out();
        Out.InstanceInner ii = oc.new InstanceInner();
        System.out.println("ii.iv : " + ii.iiv);
        oc.myMethod();
        System.out.println("Out.StaticInner.cv : " + Out.StaticInner.scv);
        Out.StaticInner si = new Out.StaticInner();
        System.out.println("si.scv : " + si.scv);
    }
 }

