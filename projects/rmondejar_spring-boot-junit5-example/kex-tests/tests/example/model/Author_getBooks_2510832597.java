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

public class Author_getBooks_2510832597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1584;

    public Author_getBooks_2510832597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1585 = new Long(2145420811068634601L);
        Long term1626 = new Long(2191130532479601175L);
        Long term1636 = new Long(860079646007397083L);
        Object term1625 = newInstance(Class.forName("example.model.Book"));
        Object term1631 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1635 = newInstance(Class.forName("example.model.Author"));
        setField(term1625, term1625.getClass(), "id", term1626);
        setField(term1625, term1625.getClass(), "title", "");
        setField(term1625, term1625.getClass(), "description", "");
        setField(term1625, term1625.getClass(), "genre", "");
        setField(term1631, term1631.getClass(), "intVal", null);
        setIntField(term1631, term1631.getClass(), "scale", 53);
        setIntField(term1631, term1631.getClass(), "precision", 0);
        setField(term1631, term1631.getClass(), "stringCache", null);
        setLongField(term1631, term1631.getClass(), "intCompact", -9223372036854775808L);
        setField(term1625, term1625.getClass(), "price", term1631);
        setField(term1635, term1635.getClass(), "id", term1636);
        setField(term1635, term1635.getClass(), "firstName", null);
        setField(term1635, term1635.getClass(), "lastName", null);
        setField(term1635, term1635.getClass(), "email", null);
        setField(term1635, term1635.getClass(), "books", null);
        setField(term1625, term1625.getClass(), "author", term1635);
        Long term1639 = new Long(-1820639665251914495L);
        Object term1638 = newInstance(Class.forName("example.model.Book"));
        Object term1644 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1648 = newInstance(Class.forName("example.model.Author"));
        setField(term1638, term1638.getClass(), "id", term1639);
        setField(term1638, term1638.getClass(), "title", "");
        setField(term1638, term1638.getClass(), "description", "");
        setField(term1638, term1638.getClass(), "genre", "");
        setField(term1644, term1644.getClass(), "intVal", null);
        setIntField(term1644, term1644.getClass(), "scale", 53);
        setIntField(term1644, term1644.getClass(), "precision", 0);
        setField(term1644, term1644.getClass(), "stringCache", null);
        setLongField(term1644, term1644.getClass(), "intCompact", -9223372036854775808L);
        setField(term1638, term1638.getClass(), "price", term1644);
        setField(term1648, term1648.getClass(), "id", null);
        setField(term1648, term1648.getClass(), "firstName", null);
        setField(term1648, term1648.getClass(), "lastName", null);
        setField(term1648, term1648.getClass(), "email", null);
        setField(term1648, term1648.getClass(), "books", null);
        setField(term1638, term1638.getClass(), "author", term1648);
        ArrayList term1623 = new ArrayList();
        ((ArrayList) term1623).add(term1625);
        ((ArrayList) term1623).add(term1638);
        term1584 = newInstance(Class.forName("example.model.Author"));
        setField(term1584, term1584.getClass(), "id", term1585);
        setField(term1584, term1584.getClass(), "firstName", "fcCAsvfBbe");
        setField(term1584, term1584.getClass(), "lastName", "mUNcKUxghj");
        setField(term1584, term1584.getClass(), "email", "lnvLKbtveE");
        setField(term1584, term1584.getClass(), "books", term1623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBooks", argTypes, term1584, args);
    }

};


