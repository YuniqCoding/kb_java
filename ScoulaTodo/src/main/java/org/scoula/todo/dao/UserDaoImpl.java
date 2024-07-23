package org.scoula.todo.dao;

import org.scoula.todo.domain.UserVO;
import org.scoula.todo.common.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// UserDao 인터페이스를 구현하여 사용자 정보에 대한 실제 CRUD 작업 수행
public class UserDaoImpl implements UserDao{
    // JDBC 연결 객체를 생성해서 초기화
    Connection conn = JDBCUtil.getConnection();

    // USERS 테이블 관련 SQL 명령어
    private String USER_LIST = "SELECT * FROM users";
    private String USER_GET = "SELECT * FROM users WHERE id = ?";
    private String USER_INSERT = "INSERT INTO users VALUES (?, ?, ?, ?)";
    private String USER_UPDATE = "UPDATE USERS SET name=?, role=? WHERE id=?";
    private String USER_DELETE = "DELETE FROM users WHERE id=?";


    // 회원 등록
    @Override
    public int create(UserVO user) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(USER_INSERT)) {
            pstmt.setString(1, user.getId());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getName());
            pstmt.setString(4, user.getRole());
            return pstmt.executeUpdate();
        }
    }

    // ResultSet을 UserVO 객체로 매핑(변환)하는 메소드
    private UserVO map(ResultSet rs) throws SQLException {
        UserVO user = new UserVO();
        user.setId(rs.getString("ID"));
        user.setPassword(rs.getString("PASSWORD"));
        user.setName(rs.getString("NAME"));
        user.setRole(rs.getString("ROLE"));
        return user;
    }

    // 회원 전체 목록 조회
    @Override
    public List<UserVO> getList() throws SQLException {
        List<UserVO> userList = new ArrayList<UserVO>();
        try (PreparedStatement pstmt = conn.prepareStatement(USER_LIST);
             ResultSet rs = pstmt.executeQuery()) {
//            next()를 사용해서 ResultSet의 마지막 행까지 데이터를 가져온다
            while (rs.next()) {
                // 결과값으로 받아온 ResultSet을 UserVO로 변환해준다
                UserVO user = map(rs);
                // 변환된 UserVO를 리스트에 추가한다.
                userList.add(user);
            }
        }
        return userList;
    }

    // 특정 아이디를 가진 회원 조회
    @Override
    public Optional<UserVO> get(String id) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(USER_GET)) {
            pstmt.setString(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    // map 에서는 ResultSet -> UserVO
                    // of (팩토리 메소드) 사용해서 UserVO를 옵셔널 객체로 리턴
                    return Optional.of(map(rs));
                }
            }
        }
        // 해당 아이디를 가진 회원이 없을 때 도달하는 코드
        return Optional.empty();
    }

    // 회원 수정
    @Override
    public int update(UserVO user) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(USER_UPDATE)) {
            // 특정 아이디를 가진 회원의 이름과 역할 수정
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getRole());
            pstmt.setString(3, user.getId());
            return pstmt.executeUpdate();
        }
    }

    // 회원 삭제
    @Override
    public int delete(String id) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(USER_DELETE)) {
            // 특정 아이디를 가진 회원 삭제
            pstmt.setString(1, id);
            return pstmt.executeUpdate();
        }
    }
}
