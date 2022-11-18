import org.example.Logic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogicTest {

    @Test
    public void checkPasswordTest() {
        Logic logic = new Logic();
        var result = logic.checkPassword("qq!a");
        Assertions.assertTrue(result);
    }

    @Test
    public void insertTest() {
        Logic logic = new Logic();
        logic.insertInList();
        logic.insertInList();
        Assertions.assertEquals(logic.getList().get(1).getId(), 2);
    }

    @Test
    public void deleteTest() {
        Logic logic = new Logic();
        logic.insertInList();
        logic.insertInList();
        logic.deleteFromList(logic.getList().get(0));
        Assertions.assertEquals(logic.getList().get(0).getId(), 2);
    }
}
