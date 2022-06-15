public class Test {
    public static void main(String[] args) {

        Number n = new Number(1,2,3);
        Number n1 = new Number(4,5,6); 
        n.ShowResult();
        n1.ShowResult();
        
        
    }
}
class Number{

    int first;
    int second;
    int third;
    
    void Nuber(){}

    Number(int first,int second,int third){

        this.first = first;
        this.second = second;
        this.third = third;
    }

    void ShowResult(){
        System.out.println("합쳐진 숫자 : " + first + second + third);
        
    }

}