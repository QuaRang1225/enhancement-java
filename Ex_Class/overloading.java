/* 
class HighSchool{
    int grade;
    String major = null;

    HighSchool(int grade){
        this.grade = grade;
        this.major = null;
    }
 
    HighSchool(int grade,String major){
        this.grade = grade;
        this.major = major;
    }
    void showStudentInfo(){

        if(grade<4&&grade>0){
            System.out.print(grade+"학년 ");
            if (major != null&& grade !=1)
                System.out.println(major +"전공");
            else
                System.out.println("전공없음");
        }
        else
            System.out.print("누..누구세요..?");
        
    }
    
}

public class overloading {
    public static void main(String[] args) {
        HighSchool junior = new HighSchool(1L);
        HighSchool senior = new HighSchool(3,"심심한데 우리 뽀뽀나 할과");
        junior.showStudentInfo();
        senior.showStudentInfo();

    }   
}
*/
class HighSchool{
    HighSchool(int grade,int major){}
    HighSchool(int grade,Double major){}
}
public class overloading {
    public static void main(String[] args) {
        HighSchool junior = new HighSchool(1,2);
        HighSchool senior = new HighSchool(1,2D);
    }   
}