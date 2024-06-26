package ch12.sec03.exam05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// @Data : RequiredArgsConstructor, Getter, Setter, Equals, HashCode, ToString 메소드 모두 포함
// @NoArgsConstructor : 기본 생성자 만들어줌
// @AllArgsConstructor : 모든 필드 포함시키는 생성자 만들어줌
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private String id;
    private String name;
    private int age;
}
