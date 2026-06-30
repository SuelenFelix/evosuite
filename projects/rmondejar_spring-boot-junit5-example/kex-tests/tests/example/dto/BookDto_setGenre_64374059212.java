package example.dto;

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
import static example.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class BookDto_setGenre_64374059212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1656;

    public BookDto_setGenre_64374059212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1657 = new Long(-2585684163342970173L);
        Long term1713 = new Long(8059786003080744426L);
        term1656 = newInstance(Class.forName("example.dto.BookDto"));
        Object term1695 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1696 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1698 = (int[]) newIntArray(6);
        Object term1712 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term1656, term1656.getClass(), "id", term1657);
        setField(term1656, term1656.getClass(), "title", "hoicvmsovO");
        setField(term1656, term1656.getClass(), "description", "eqJfYWRaEL");
        setField(term1656, term1656.getClass(), "genre", "fhkbdRViHi");
        setIntField(term1696, term1696.getClass(), "signum", 1);
        setIntElement(term1698, 0, 579);
        setIntElement(term1698, 1, -560540333);
        setIntElement(term1698, 2, 1014435409);
        setIntElement(term1698, 3, -1248929007);
        setIntElement(term1698, 4, -42206956);
        setIntElement(term1698, 5, 1817231305);
        setField(term1696, term1696.getClass(), "mag", term1698);
        setIntField(term1696, term1696.getClass(), "bitCountPlusOne", 0);
        setIntField(term1696, term1696.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1696, term1696.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1696, term1696.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1695, term1695.getClass(), "intVal", term1696);
        setIntField(term1695, term1695.getClass(), "scale", 51);
        setIntField(term1695, term1695.getClass(), "precision", 0);
        setField(term1695, term1695.getClass(), "stringCache", null);
        setLongField(term1695, term1695.getClass(), "intCompact", -9223372036854775808L);
        setField(term1656, term1656.getClass(), "price", term1695);
        setField(term1712, term1712.getClass(), "id", term1713);
        setField(term1712, term1712.getClass(), "firstName", "uWHnvSvaPl");
        setField(term1712, term1712.getClass(), "lastName", "kBdSllIBVz");
        setField(term1712, term1712.getClass(), "email", "TJmVBGfTML");
        setField(term1656, term1656.getClass(), "author", term1712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tPlsykYBqO";
        callMethod(klass, "setGenre", argTypes, term1656, args);
    }

};


