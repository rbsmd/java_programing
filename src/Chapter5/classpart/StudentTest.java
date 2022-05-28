package Chapter5.classpart;

public class StudentTest {
    public static void main(String[] args){

//studentA : 지역변수
        Student studentA = new Student();    //객체, 생성자
        studentA.studentName = "한규능";
        studentA.studerntID = 100;
        studentA.address = "경기도 남양주";
        studentA.grade = 1;

        Student studentB = new Student();    //생성자
        studentB.studentName = "이유나";
        studentB.studerntID = 101;
        studentB.address = "경기도 남양주";
        studentB.grade = 1;

        studentA.showStudentInfor();
        studentB.showStudentInfor();
    }
}
