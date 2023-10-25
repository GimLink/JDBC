package hello.jdbc.repository;

import hello.jdbc.domain.Member;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoruV0Test {

    MemberRepositoruV0 repository = new MemberRepositoruV0();

    @Test
    void crud() throws SQLException {
        Member member = new Member("memberV0", 10000);
        repository.save(member);
    }
}