import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everyBranchTest1() {
        List<User> users = new ArrayList<>();

        //test1
        User user = null;
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user, users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    }

    @Test
    void everyBranchTest2() {
        List<User> users = new ArrayList<>();

        //test2
        User user = new User(null, "V1@345", "VladimirKambovski");
        assertFalse(SILab2.function(user, users));
    }

    @Test
    void everyBranchTest3() {
        List<User> users = new ArrayList<>();

        //test3
        User user = new User ("Kambovski1", "V12 33", "vladimir.kambovski@students.finki.ukim.mk");
        User user1 = new User ("Kambovski1", "654321", "vladimir.kambovski@students.finki.ukim.mk");
        User user2 = new User ("Vladimir", "7654321", "vladimir.kambovski@students.finki.ukim.mk");
        User user3 = new User ("vladimir001", "11223344", "kambovski01@gmail.com");
        
        users.add(user1);
        users.add(user2);
        users.add(user3);

        assertFalse(SILab2.function(user, users));
    }

    @Test
    void everyBranchTest4() {
        List<User> users = new ArrayList<>();

        //test4
        User user = new User ("vladimir", "vladimir", "VladimirKambovski");

        assertFalse (SILab2.function(user, users));
    }

    @Test
    void everyBranchTest5() {
        List<User> users = new ArrayList<>();

        //test5
        User user = new User (null, "vladimir", "vladimir.kambovski@students.finki.ukim.mk");

        assertFalse (SILab2.function(user, users));
    }

    @Test
    void multipleConditionsTest() {
        List<User> users = new ArrayList<>();

        //TXX
        User user1 = null;
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user1, users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));


        //FTX
        User user2 = new User ("vladimir", null, null);
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user2, users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));


        //FFT
        User user3 = new User("vladimir", "123456", null);
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user3, users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));


        //FFF
        User user4 = new User("vladimir", "123456", "vladimir.kambovski@students.finki.ukim.mk");
        assertFalse(SILab2.function(user4, users));
    }
}
