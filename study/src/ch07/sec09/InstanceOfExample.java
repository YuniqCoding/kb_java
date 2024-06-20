package ch07.sec09;

public class InstanceOfExample {
    //main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
    public static void personInfo(Person person){
        System.out.println("name: " + person.name);
        person.walk();

        //instanceof : person이 참조하는 객체가 Student 타입인지 확인
        if(person instanceof Student){
            //Student 객체일 경우 강제 타입 변환
            Student student = (Student) person;
            //Student 객체만 가지고 있는 필드 및 메소드 사용, person에서는 사용 불가
            System.out.println("studentNo: "+student.studentNo);
            student.study();
        }

        // 위 코드와 동일한 기능
        // Java 12 버전부터 사용 가능한 코드
//        if(person instanceof Student student){
//            System.out.println("studentNo: "+student.studentNo);
//            student.study();
//        }
    }

    public static void main(String[] args) {
        //Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p1 = new Person("홍길동");
//        Person 객체는 Student 타입이 아니기 때문에 if문에 들어가지 않는다
        personInfo(p1);

        System.out.println();

        //Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p2 = new Student("김길동",10);
        personInfo(p2);
    }
}
