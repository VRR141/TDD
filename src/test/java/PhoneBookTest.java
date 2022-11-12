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
        int range = 2; //less then contactSize

        String expected = String.valueOf(contactSize - range);

        for (int i = 0; i < contactSize; i++){
            phoneBook.add(String.valueOf(i), String.valueOf(i));
        }

        String actual = phoneBook.findByNumber(String.valueOf(contactSize - range));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindByNumberClass(){
        Class<String> expected = String.class;
        String number = "9";
        var actual = phoneBook.findByNumber(number);
        Assertions.assertInstanceOf(expected, actual);
    }

    @Test
    public void testFindByNameResult(){
        int contactSize = 10;
        int range = 5; //less then contactSize

        String expected = String.valueOf(contactSize - range);

        for (int i = 0; i < contactSize; i++){
            phoneBook.add(String.valueOf(i), String.valueOf(i));
        }

        String actual = phoneBook.findByName(String.valueOf(contactSize - range));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindByNameClass(){
        Class<String> expected = String.class;
        String number = "9";
        var actual = phoneBook.findByName(number);
        Assertions.assertInstanceOf(expected, actual);
    }

    @Test
    public void testPrintAllNamesResult(){
        int contactSize = 10;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < contactSize; i++){
            sb.append("Name: ").append(i).append(" Number: ").append(i).append("\n");
        }

        for (int i = 0; i < contactSize; i++){
            phoneBook.add(String.valueOf(i), String.valueOf(i));
        }

        String expected = sb.toString();
        String actual = phoneBook.printAllNames();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrintAllNamesClass(){
        Class<String> expected = String.class;
        var actual = phoneBook.printAllNames();
        Assertions.assertInstanceOf(expected, actual);
    }

}
