package src.chapter4.ifExample;

public class ifExample2 {
    public static void main(String[] args) {

        int age = 25;
        int charge = 0;

        if(age <= 8){
            charge = 1000;
            System.out.println("취학 전 아동");
        }
        else if(age < 14){
            charge = 2000;
            System.out.println("초등학생");
        }
        else if(age < 19){
            charge = 2500;
            System.out.println("중,고등학생");
        }
        else{
            charge = 3000;
            System.out.println("성인");
        }
        System.out.println(charge + "원");
    }
}
