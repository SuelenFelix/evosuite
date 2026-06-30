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
import java.lang.Object;
import java.util.ArrayList;

public class Book_getAuthor_19335109748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5461;

    public Book_getAuthor_19335109748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5462 = new Long(-1978508496784157882L);
        Long term5517 = new Long(-7840999196900383276L);
        Long term5558 = new Long(1528628920302068646L);
        Object term5557 = newInstance(Class.forName("example.model.Book"));
        setField(term5557, term5557.getClass(), "id", term5558);
        setField(term5557, term5557.getClass(), "title", null);
        setField(term5557, term5557.getClass(), "description", null);
        setField(term5557, term5557.getClass(), "genre", null);
        setField(term5557, term5557.getClass(), "price", null);
        setField(term5557, term5557.getClass(), "author", null);
        Long term5561 = new Long(8640463098965331396L);
        Object term5560 = newInstance(Class.forName("example.model.Book"));
        setField(term5560, term5560.getClass(), "id", term5561);
        setField(term5560, term5560.getClass(), "title", null);
        setField(term5560, term5560.getClass(), "description", null);
        setField(term5560, term5560.getClass(), "genre", null);
        setField(term5560, term5560.getClass(), "price", null);
        setField(term5560, term5560.getClass(), "author", null);
        Long term5564 = new Long(-872579514000598474L);
        Object term5563 = newInstance(Class.forName("example.model.Book"));
        setField(term5563, term5563.getClass(), "id", term5564);
        setField(term5563, term5563.getClass(), "title", null);
        setField(term5563, term5563.getClass(), "description", null);
        setField(term5563, term5563.getClass(), "genre", null);
        setField(term5563, term5563.getClass(), "price", null);
        setField(term5563, term5563.getClass(), "author", null);
        Long term5567 = new Long(678465732474023847L);
        Object term5566 = newInstance(Class.forName("example.model.Book"));
        setField(term5566, term5566.getClass(), "id", term5567);
        setField(term5566, term5566.getClass(), "title", null);
        setField(term5566, term5566.getClass(), "description", null);
        setField(term5566, term5566.getClass(), "genre", null);
        setField(term5566, term5566.getClass(), "price", null);
        setField(term5566, term5566.getClass(), "author", null);
        Object term5569 = newInstance(Class.forName("example.model.Book"));
        setField(term5569, term5569.getClass(), "id", null);
        setField(term5569, term5569.getClass(), "title", null);
        setField(term5569, term5569.getClass(), "description", null);
        setField(term5569, term5569.getClass(), "genre", null);
        setField(term5569, term5569.getClass(), "price", null);
        setField(term5569, term5569.getClass(), "author", null);
        ArrayList term5555 = new ArrayList();
        ((ArrayList) term5555).add(term5557);
        ((ArrayList) term5555).add(term5560);
        ((ArrayList) term5555).add(term5563);
        ((ArrayList) term5555).add(term5566);
        ((ArrayList) term5555).add(term5569);
        term5461 = newInstance(Class.forName("example.model.Book"));
        Object term5500 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5501 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5503 = (int[]) newIntArray(5);
        Object term5516 = newInstance(Class.forName("example.model.Author"));
        setField(term5461, term5461.getClass(), "id", term5462);
        setField(term5461, term5461.getClass(), "title", "spOehuHwSl");
        setField(term5461, term5461.getClass(), "description", "cyobgydTWP");
        setField(term5461, term5461.getClass(), "genre", "moHYQFfLnp");
        setIntField(term5501, term5501.getClass(), "signum", 1);
        setIntElement(term5503, 0, 1802707185);
        setIntElement(term5503, 1, 197866239);
        setIntElement(term5503, 2, -1690213);
        setIntElement(term5503, 3, 1095366471);
        setIntElement(term5503, 4, 30674417);
        setField(term5501, term5501.getClass(), "mag", term5503);
        setIntField(term5501, term5501.getClass(), "bitCountPlusOne", 0);
        setIntField(term5501, term5501.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5501, term5501.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5501, term5501.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5500, term5500.getClass(), "intVal", term5501);
        setIntField(term5500, term5500.getClass(), "scale", 51);
        setIntField(term5500, term5500.getClass(), "precision", 0);
        setField(term5500, term5500.getClass(), "stringCache", null);
        setLongField(term5500, term5500.getClass(), "intCompact", -9223372036854775808L);
        setField(term5461, term5461.getClass(), "price", term5500);
        setField(term5516, term5516.getClass(), "id", term5517);
        setField(term5516, term5516.getClass(), "firstName", "BrPqlvIbEQ");
        setField(term5516, term5516.getClass(), "lastName", "JDTrhGRsDT");
        setField(term5516, term5516.getClass(), "email", "vHxsVQImjS");
        setField(term5516, term5516.getClass(), "books", term5555);
        setField(term5461, term5461.getClass(), "author", term5516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthor", argTypes, term5461, args);
    }

};


