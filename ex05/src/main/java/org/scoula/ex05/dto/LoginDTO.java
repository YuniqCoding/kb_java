package org.scoula.ex05.dto;

public class LoginDTO { // GETTER, SETTER, 필드, 생성자 가지고 있으면 Java Bean으로 사용 가능
    private String name; // attribute , 기본적으로 바깥에서 접근하기 힘듬
    private String passwd;
    public LoginDTO() {}
    public LoginDTO(String name, String passwd) {
        this.name = name;
        this.passwd = passwd;
    }

//    public String getName() { // property, getter/setter를 통해서 바깥에서 접근가능
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
