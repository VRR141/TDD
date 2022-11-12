import org.example.PhoneBook;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

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
    public void testAddClass(){
        Class<Integer> expected = Integer.class;
        var actual = phoneBook.add("someString", "someString");
        Assertions.assertInstanceOf(expected, actual);
    }

    @Test
    public void testAddResult() {
        int randomCounter = 10;
        int expected = 0;

        for (int i = 0; i < new Random().nextInt()*randomCounter; i++){
            expected = phoneBook.add(String.valueOf(i), String.valueOf(i));
        }

        int actual = phoneBook.getContactsSize();

        Assertions.assertEquals(expected, phoneBook.getContactsSize());
    }

}
