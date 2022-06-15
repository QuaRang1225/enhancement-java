class A {
    public void method(I i){            //인터체이스 I를 구현한 클래스만 이용 가능
        i.method();
    
    }
}
interface I{
    public void method();
}
class B implements I{

    public void method(){
        System.out.println("B클래스의 메서드");
    }
}
class C{                    //클래스 A에서 매개변수값을 바꿔야 사용 가능
    public void method(){
        System.out.println("C클래스의 메서드");
    }
}

public class Inter {
    public static void main(String[] args) {
        
        A a = new A();
        a.method(new B());          //A가 B를 사용(의존)
    }  
}
