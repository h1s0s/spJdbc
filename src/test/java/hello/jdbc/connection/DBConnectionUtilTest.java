package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.assertj.core.api.Assertions.*;

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
public class DBConnectionUtilTest {

    /**
     * DBConnetionUtil로 호출한 구현체가 NotNull인가
     */
    @Test
    void connection() {
        Connection connection = DBConnectionUtil.getConnection();
        assertThat(connection).isNotNull();
    }
}
