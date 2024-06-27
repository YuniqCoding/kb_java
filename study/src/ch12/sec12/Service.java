package ch12.sec12;

public class Service {
//    설정값이 없으므로 value="-", number=15로 설정됨
    @PrintAnnotation
    public void method1(){
        System.out.println("실행 내용1");
    }

//    기본값인 value만 설정되므로 value="*", number=15로 설정됨
    @PrintAnnotation("*")
    public void method2(){
        System.out.println("실행 내용2");
    }

//    value="#", number = 20으로 설정됨
    @PrintAnnotation(value = "#",number = 20)
    public void method3(){
        System.out.println("실행 내용3");
    }
}
