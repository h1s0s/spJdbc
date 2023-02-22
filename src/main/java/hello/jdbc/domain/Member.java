package hello.jdbc.domain;

import lombok.Data;

/**
 * packageName  : hello.jdbc.domain
 * fileName     : Member
 * author       : sshan
 * date         : 2023-02-22
 * description  :
 * ========================================================
 * DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-02-22          sshan            최초생성
 */
@Data
public class Member {
    /* 회원 아이디 */
    private String memberId;
    /* 소지 금액 */
    private int money;

    public Member() {
    }

    public Member(String memberId, int money) {
        this.memberId = memberId;
        this.money = money;
    }
}