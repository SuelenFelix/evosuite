package example.model;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static example.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class Author_getEmail_8899877006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1453;

    public Author_getEmail_8899877006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1454 = new Long(9205327385733285058L);
        Long term1495 = new Long(4199886998224701110L);
        Long term1505 = new Long(8540994973773607992L);
        Object term1494 = newInstance(Class.forName("example.model.Book"));
        Object term1500 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1504 = newInstance(Class.forName("example.model.Author"));
        setField(term1494, term1494.getClass(), "id", term1495);
        setField(term1494, term1494.getClass(), "title", "");
        setField(term1494, term1494.getClass(), "description", "");
        setField(term1494, term1494.getClass(), "genre", "");
        setField(term1500, term1500.getClass(), "intVal", null);
        setIntField(term1500, term1500.getClass(), "scale", 52);
        setIntField(term1500, term1500.getClass(), "precision", 0);
        setField(term1500, term1500.getClass(), "stringCache", null);
        setLongField(term1500, term1500.getClass(), "intCompact", -9223372036854775808L);
        setField(term1494, term1494.getClass(), "price", term1500);
        setField(term1504, term1504.getClass(), "id", term1505);
        setField(term1504, term1504.getClass(), "firstName", null);
        setField(term1504, term1504.getClass(), "lastName", null);
        setField(term1504, term1504.getClass(), "email", null);
        setField(term1504, term1504.getClass(), "books", null);
        setField(term1494, term1494.getClass(), "author", term1504);
        Long term1508 = new Long(-2338103433822116635L);
        Long term1518 = new Long(-1885698929232124806L);
        Object term1507 = newInstance(Class.forName("example.model.Book"));
        Object term1513 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1517 = newInstance(Class.forName("example.model.Author"));
        setField(term1507, term1507.getClass(), "id", term1508);
        setField(term1507, term1507.getClass(), "title", "");
        setField(term1507, term1507.getClass(), "description", "");
        setField(term1507, term1507.getClass(), "genre", "");
        setField(term1513, term1513.getClass(), "intVal", null);
        setIntField(term1513, term1513.getClass(), "scale", 53);
        setIntField(term1513, term1513.getClass(), "precision", 0);
        setField(term1513, term1513.getClass(), "stringCache", null);
        setLongField(term1513, term1513.getClass(), "intCompact", -9223372036854775808L);
        setField(term1507, term1507.getClass(), "price", term1513);
        setField(term1517, term1517.getClass(), "id", term1518);
        setField(term1517, term1517.getClass(), "firstName", null);
        setField(term1517, term1517.getClass(), "lastName", null);
        setField(term1517, term1517.getClass(), "email", null);
        setField(term1517, term1517.getClass(), "books", null);
        setField(term1507, term1507.getClass(), "author", term1517);
        Long term1521 = new Long(-8338004844694486146L);
        Object term1520 = newInstance(Class.forName("example.model.Book"));
        Object term1526 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1530 = newInstance(Class.forName("example.model.Author"));
        setField(term1520, term1520.getClass(), "id", term1521);
        setField(term1520, term1520.getClass(), "title", "");
        setField(term1520, term1520.getClass(), "description", "");
        setField(term1520, term1520.getClass(), "genre", "");
        setField(term1526, term1526.getClass(), "intVal", null);
        setIntField(term1526, term1526.getClass(), "scale", 52);
        setIntField(term1526, term1526.getClass(), "precision", 0);
        setField(term1526, term1526.getClass(), "stringCache", null);
        setLongField(term1526, term1526.getClass(), "intCompact", -9223372036854775808L);
        setField(term1520, term1520.getClass(), "price", term1526);
        setField(term1530, term1530.getClass(), "id", null);
        setField(term1530, term1530.getClass(), "firstName", null);
        setField(term1530, term1530.getClass(), "lastName", null);
        setField(term1530, term1530.getClass(), "email", null);
        setField(term1530, term1530.getClass(), "books", null);
        setField(term1520, term1520.getClass(), "author", term1530);
        Long term1532 = new Long(185793058502220865L);
        Object term1531 = newInstance(Class.forName("example.model.Book"));
        Object term1537 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1541 = newInstance(Class.forName("example.model.Author"));
        setField(term1531, term1531.getClass(), "id", term1532);
        setField(term1531, term1531.getClass(), "title", "");
        setField(term1531, term1531.getClass(), "description", "");
        setField(term1531, term1531.getClass(), "genre", "");
        setField(term1537, term1537.getClass(), "intVal", null);
        setIntField(term1537, term1537.getClass(), "scale", 53);
        setIntField(term1537, term1537.getClass(), "precision", 0);
        setField(term1537, term1537.getClass(), "stringCache", null);
        setLongField(term1537, term1537.getClass(), "intCompact", -9223372036854775808L);
        setField(term1531, term1531.getClass(), "price", term1537);
        setField(term1541, term1541.getClass(), "id", null);
        setField(term1541, term1541.getClass(), "firstName", null);
        setField(term1541, term1541.getClass(), "lastName", null);
        setField(term1541, term1541.getClass(), "email", null);
        setField(term1541, term1541.getClass(), "books", null);
        setField(term1531, term1531.getClass(), "author", term1541);
        Long term1543 = new Long(-7698746988132548371L);
        Object term1542 = newInstance(Class.forName("example.model.Book"));
        Object term1548 = newInstance(Class.forName("java.math.BigDecimal"));
        setField(term1542, term1542.getClass(), "id", term1543);
        setField(term1542, term1542.getClass(), "title", "");
        setField(term1542, term1542.getClass(), "description", "");
        setField(term1542, term1542.getClass(), "genre", "");
        setField(term1548, term1548.getClass(), "intVal", null);
        setIntField(term1548, term1548.getClass(), "scale", 52);
        setIntField(term1548, term1548.getClass(), "precision", 0);
        setField(term1548, term1548.getClass(), "stringCache", null);
        setLongField(term1548, term1548.getClass(), "intCompact", -9223372036854775808L);
        setField(term1542, term1542.getClass(), "price", term1548);
        setField(term1542, term1542.getClass(), "author", term1530);
        ArrayList term1492 = new ArrayList();
        ((ArrayList) term1492).add(term1494);
        ((ArrayList) term1492).add(term1507);
        ((ArrayList) term1492).add(term1507);
        ((ArrayList) term1492).add(term1520);
        ((ArrayList) term1492).add(term1520);
        ((ArrayList) term1492).add(term1531);
        ((ArrayList) term1492).add(term1542);
        term1453 = newInstance(Class.forName("example.model.Author"));
        setField(term1453, term1453.getClass(), "id", term1454);
        setField(term1453, term1453.getClass(), "firstName", "vgdwrCZczl");
        setField(term1453, term1453.getClass(), "lastName", "gKMNrpKBpu");
        setField(term1453, term1453.getClass(), "email", "ZbHJVEqcoa");
        setField(term1453, term1453.getClass(), "books", term1492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term1453, args);
    }

};


