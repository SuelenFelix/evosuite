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

public class BookDto_setPrice_13589928013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1839;
     Object term1934;

    public BookDto_setPrice_13589928013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1840 = new Long(-4365849114644724155L);
        Long term1896 = new Long(2486810210675247493L);
        term1839 = newInstance(Class.forName("example.dto.BookDto"));
        Object term1878 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1879 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1881 = (int[]) newIntArray(6);
        Object term1895 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term1839, term1839.getClass(), "id", term1840);
        setField(term1839, term1839.getClass(), "title", "bLPjGVBhlX");
        setField(term1839, term1839.getClass(), "description", "whBvTVIIlC");
        setField(term1839, term1839.getClass(), "genre", "IgRJUzaCwW");
        setIntField(term1879, term1879.getClass(), "signum", 1);
        setIntElement(term1881, 0, 35465);
        setIntElement(term1881, 1, 1599162976);
        setIntElement(term1881, 2, -1427811280);
        setIntElement(term1881, 3, -224241601);
        setIntElement(term1881, 4, -1115150417);
        setIntElement(term1881, 5, 212641299);
        setField(term1879, term1879.getClass(), "mag", term1881);
        setIntField(term1879, term1879.getClass(), "bitCountPlusOne", 0);
        setIntField(term1879, term1879.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1879, term1879.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1879, term1879.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1878, term1878.getClass(), "intVal", term1879);
        setIntField(term1878, term1878.getClass(), "scale", 53);
        setIntField(term1878, term1878.getClass(), "precision", 0);
        setField(term1878, term1878.getClass(), "stringCache", null);
        setLongField(term1878, term1878.getClass(), "intCompact", -9223372036854775808L);
        setField(term1839, term1839.getClass(), "price", term1878);
        setField(term1895, term1895.getClass(), "id", term1896);
        setField(term1895, term1895.getClass(), "firstName", "JUmudUmaaV");
        setField(term1895, term1895.getClass(), "lastName", "KoyGrUJeJW");
        setField(term1895, term1895.getClass(), "email", "HqBOwkVqjD");
        setField(term1839, term1839.getClass(), "author", term1895);
        term1934 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1935 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1937 = (int[]) newIntArray(6);
        setIntField(term1935, term1935.getClass(), "signum", 1);
        setIntElement(term1937, 0, 523);
        setIntElement(term1937, 1, -954467915);
        setIntElement(term1937, 2, 1892307494);
        setIntElement(term1937, 3, -1066736592);
        setIntElement(term1937, 4, 433326655);
        setIntElement(term1937, 5, -242716133);
        setField(term1935, term1935.getClass(), "mag", term1937);
        setIntField(term1935, term1935.getClass(), "bitCountPlusOne", 0);
        setIntField(term1935, term1935.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1935, term1935.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1935, term1935.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1934, term1934.getClass(), "intVal", term1935);
        setIntField(term1934, term1934.getClass(), "scale", 51);
        setIntField(term1934, term1934.getClass(), "precision", 0);
        setField(term1934, term1934.getClass(), "stringCache", null);
        setLongField(term1934, term1934.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term1934;
        callMethod(klass, "setPrice", argTypes, term1839, args);
    }

};


