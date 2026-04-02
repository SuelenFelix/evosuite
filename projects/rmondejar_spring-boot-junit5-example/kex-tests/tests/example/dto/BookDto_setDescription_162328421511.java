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

public class BookDto_setDescription_162328421511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1473;

    public BookDto_setDescription_162328421511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1474 = new Long(-4920224193275732920L);
        Long term1530 = new Long(8428634514691209827L);
        term1473 = newInstance(Class.forName("example.dto.BookDto"));
        Object term1512 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1513 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1515 = (int[]) newIntArray(6);
        Object term1529 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term1473, term1473.getClass(), "id", term1474);
        setField(term1473, term1473.getClass(), "title", "YRHGsAkhxb");
        setField(term1473, term1473.getClass(), "description", "ffYhPOzlUs");
        setField(term1473, term1473.getClass(), "genre", "MLqYREekMl");
        setIntField(term1513, term1513.getClass(), "signum", 1);
        setIntElement(term1515, 0, 2584);
        setIntElement(term1515, 1, -1946484122);
        setIntElement(term1515, 2, 1992026795);
        setIntElement(term1515, 3, 1045205752);
        setIntElement(term1515, 4, 613377469);
        setIntElement(term1515, 5, -1848020175);
        setField(term1513, term1513.getClass(), "mag", term1515);
        setIntField(term1513, term1513.getClass(), "bitCountPlusOne", 0);
        setIntField(term1513, term1513.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1513, term1513.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1513, term1513.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1512, term1512.getClass(), "intVal", term1513);
        setIntField(term1512, term1512.getClass(), "scale", 52);
        setIntField(term1512, term1512.getClass(), "precision", 0);
        setField(term1512, term1512.getClass(), "stringCache", null);
        setLongField(term1512, term1512.getClass(), "intCompact", -9223372036854775808L);
        setField(term1473, term1473.getClass(), "price", term1512);
        setField(term1529, term1529.getClass(), "id", term1530);
        setField(term1529, term1529.getClass(), "firstName", "ytSBIKXogI");
        setField(term1529, term1529.getClass(), "lastName", "nHXjMycHlU");
        setField(term1529, term1529.getClass(), "email", "ieCtQFdkii");
        setField(term1473, term1473.getClass(), "author", term1529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dEnhdmILtU";
        callMethod(klass, "setDescription", argTypes, term1473, args);
    }

};


