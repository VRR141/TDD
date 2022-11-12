import org.example.PhoneBook;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    private PhoneBook phoneBook;

    @BeforeEach
    public void initialize(){
        phoneBook = new PhoneBook();
    }
    @AfterEach
    public void close(){
        phoneBook = null;
    }

    @Test
    public void add(){
        PhoneBook phoneBook = new PhoneBook();
        var b = phoneBook.add();
        Assertions.assertInstanceOf(Integer.class, b);
    }


}
