class Product {
    
    int price;
    int bonus;
    int num;


    Product(int price,int num) {
        this.price = price;             //구매 가격
        this.bonus = price/10;          //보너스 금액은 구매 금액의 10%
        this.num = num;                 //구매 개수
    }

}
class Tv extends Product{               //제품 가격과 구매개수 입력
    Tv(){
        super(100,1);       //생성자 첫줄에는 무조건 생성자를 호출해야함(기본생성자라면 알아서 부모의 기본 생성자super삽입)
   }
    public String toString(){           //toString()은 Object클래스의 메서드중하나
        return "Tv";                    //toString()메서드를 사용하지 않을경우 Tv@1252323 등으로 출력이 됨
    }

}
class LabTop extends Product{
    LabTop(){
        super(200,2);
    }
    public String toString(){
        return "LabTop";
    }
}
class Phone extends Product{
    Phone(){
        super(150,5);
    }
    public String toString(){
        return "Phone";
    }
}
class Buyer{

    int money = 10000;                  //처음 보유 잔액
    int bonus =0;                       //처음 보유 보너스금액
    int arr[] = new int[10];            //개수를 저장할 배열 생성
    Product[] cart = new Product[10];   //참조변수를 저장할 배열 생성
    int i=0;

    void buy(Product p){
        if(money<p.price){
            System.out.println("돈이 부족합니다.");     
        }
        
        money -= p.price*p.num;
        bonus += p.bonus*p.num;

        arr[i] = p.num;                 //배열의 구매 개수 저장
        cart[i] = p;                    //다른 맴버변수를 호출해도 다른 객체가 아니기 때문에 같은 메모리를 사용
        
        System.out.println(p+ " : " + p.price + "원");
        System.out.println(arr[i] +"개를 구매하셨습니다.");
        i++;                            //한 배열안에 저장후 1씩 증가
        

    }
    void calculate(){

        int sum =0;
        String list = "";   //Stirng 타입으로 문장을 저장할 공간 생성

        for(int i =0;i<cart.length;i++){        //cart.length는 생성한 객체의 길이 ex)총 3번 배열이 생성되었음으로 3
            if(cart[i]==null) break;            //빈 배열이 나올경우 나옴
            sum += cart[i].price*arr[i];        //구입 금액 계산
            list += cart[i] + " " +  Integer.toString(arr[i]) + "개, ";     //문장 하나씩 저장, Integer.toString()메서드는 정수형태에서 String으로 바꿔주는 메서드 
        }
        list = list.substring(0, list.length() -2);         //시작점으로로 부터 2개 글자 삭제

        System.out.println("구입 금액: " +  sum + "원, 남은 잔액: " + money + "원, 보너스 금액: "+bonus);
        System.out.println("현재 구입한 목록은 " + list +  "입니다.");
        System.out.println("총 보유금액은 " + (bonus+money) + "원입니다.");
    }

}


public class HiMart {
    public static void main(String[] args) {

        Buyer b = new Buyer();
      
  
        b.buy(new Tv());
        b.buy(new LabTop());
        b.buy(new Phone());
        b.calculate();
    }

        
}
