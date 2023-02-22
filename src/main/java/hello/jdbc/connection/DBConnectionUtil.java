package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static hello.jdbc.connection.ConnectionConst.*;

/**
 * packageName  : hello.jdbc.connection
 * fileName     : DBConnectionUtil
 * author       : sshan
 * date         : 2023-02-22
 * description  :
 * ========================================================
 * DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-02-22          sshan            최초생성
 */
@Slf4j
public class DBConnectionUtil {

    /**
     * DB 연결 코드
     * @return
     */
    public static Connection getConnection(){
        try {
            //Driver가 현재 연결된 DB의 구현체를 return 해온다
            //H2, MySQL에서  Connection 구현체를 생성함
            //JDBC가 제공하는 'DriverManager'는 라이브러리에 등록된 DB 드라이버들을 관리하고, 커넥션을 획득하는 기능을 제공한다.
            //이 드라이버들에게 순서대로 다음 정보를 넘겨 커넥션을 획득할 수 있는지 확인한다.
            //현재 우리는 H@ 데이터베이스 드라이버만 라이브러리에 등록했기 때문에, H2 드라이버가 제공하는 H2 커넥션을 제공받는다.
            //물론 이 H2 커넥션은 JDBC가 제공하는 'java.sql.Connection' 인터페이스를 구현하고 있다.
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            log.info("get Connection={}, class={}", connection, connection.getClass());
            return connection;
        } catch (SQLException e) {
            throw new IllegalStateException();
        }
    }
}
