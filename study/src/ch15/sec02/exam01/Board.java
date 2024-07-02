package ch15.sec02.exam01;

import lombok.*;

//필드 전부를 가지고 있는 생성자를 만들겠다
@AllArgsConstructor
// 기본 생성자를 만들겠다.
//@NoArgsConstructor
//@Getter
//@Setter
// @Data는 getter, setter, toString, 기본 생성자, hashCode, equals가 포함되어있다
@Data
public class Board {
    private String subject;
    private String content;
    private String writer;
}
