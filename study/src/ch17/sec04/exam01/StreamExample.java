package ch17.sec04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // List 컬렉션 생성
        List<Product> list = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
//            5개의 product 객체를 생성해서 List에 추가
            Product product = new Product(i, "상품"+i,"멋진회사",(int)(10000*Math.random()));
            list.add(product);
        }

        // 객체 스트림 얻기, stream()으로 list를 Stream으로 만듬
//        list와 Stream의 타입은 동일해야 한다
        Stream<Product> stream = list.stream();
//        stream의 요소를 p라고 꺼내면서 출력
        stream.forEach(p->System.out.println(p));
    }
}
