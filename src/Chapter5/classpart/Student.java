package Chapter5.classpart;

public class Student {

    int studerntID;
    String studentName;
    int grade;
    String address;

    public void showStudentInfor(){
        System.out.println(studentName + " " + address);
    }


    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public static void main(String[] args){

        Student studentA = new Student();    //객체, 생성자
        studentA.studentName = "한규능";      //인스턴스
        studentA.studerntID = 100;
        studentA.address = "경기도 남양주ddd";
        studentA.grade = 1;

        Student studentB = new Student();    //생성자
        studentB.studentName = "이유나";       //인스턴스
        studentB.studerntID = 101;
        studentB.address = "경기도 남양주";
        studentB.grade = 1;

        studentA.showStudentInfor();
        studentB.showStudentInfor();
    }

}
