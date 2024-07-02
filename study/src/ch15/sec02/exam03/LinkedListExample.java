package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // ArrayList 컬렉션 객체 생성
        List<String> list1 = new ArrayList<>();

        // LinkedList 컬렉션 객체 생성
        List<String> list2 = new LinkedList<>();

        // 시작 시간과 끝 시간을 저장할 변수 선언
        long startTime;
        long endTime;

        // ArrayList 컬렉션에 저장하는 시간 측정
//        삽입 메소드기 때문에 ArrayList의 경우 뒤쪽에 있는 요소들을 다 밀어야한다
//        따라서 많은 시간이 소요됨
        startTime = System.nanoTime();
        for(int i = 0; i < 100000; i++) {
            list1.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", endTime - startTime);

        // LinkedList 컬렉션에 저장하는 시간 측정
//        삽입 메소드기 때문에 LinkedList의 경우 저장된 주소값만 변경해주면 된다
        startTime = System.nanoTime();
        for(int i = 0; i < 100000; i++) {
            list2.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", endTime - startTime);
    }

}
