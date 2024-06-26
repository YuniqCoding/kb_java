package ch12.sec03.exam05;

import lombok.Data;
import lombok.NonNull;
//ctrl/cmd + alt + O : 안쓰는 import 제거


@Data
public class Member2 {
    private String id;
//    @NonNull : null이면 안 되는 필수 항목,
//    따라서 @RequiredArgsConstructor에 의해 해당 필드를 포함하는 생성자가 만들어진다
    @NonNull
    private String name;
    private int age;
}
