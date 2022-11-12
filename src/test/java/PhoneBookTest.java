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

    @Test
    public void testFindByNumberResult(){
        int contactSize = 10;

        String expected = String.valueOf(contactSize - 2);

        for (int i = 0; i < contactSize; i++){
            phoneBook.add(String.valueOf(i), String.valueOf(i));
        }
        
        String actual = phoneBook.findByNumber(String.valueOf(contactSize - 2));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindByNumberClass(){
        Class<String> expected = String.class;
        String number = "9";
        var actual = phoneBook.findByNumber(number);
        Assertions.assertInstanceOf(expected, actual);
    }

}
