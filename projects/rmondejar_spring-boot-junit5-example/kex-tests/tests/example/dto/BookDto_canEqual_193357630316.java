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

public class BookDto_canEqual_193357630316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2415;
     Object term2510;

    public BookDto_canEqual_193357630316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2416 = new Long(6855071767938501807L);
        Long term2472 = new Long(-5892135042702373494L);
        term2415 = newInstance(Class.forName("example.dto.BookDto"));
        Object term2454 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2455 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2457 = (int[]) newIntArray(6);
        Object term2471 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term2415, term2415.getClass(), "id", term2416);
        setField(term2415, term2415.getClass(), "title", "swZVeJAxjt");
        setField(term2415, term2415.getClass(), "description", "xOcJIiQQDu");
        setField(term2415, term2415.getClass(), "genre", "GVizqqzXpy");
        setIntField(term2455, term2455.getClass(), "signum", 1);
        setIntElement(term2457, 0, 65188);
        setIntElement(term2457, 1, 1319681440);
        setIntElement(term2457, 2, -739534113);
        setIntElement(term2457, 3, -1337808284);
        setIntElement(term2457, 4, 786647436);
        setIntElement(term2457, 5, -1827169985);
        setField(term2455, term2455.getClass(), "mag", term2457);
        setIntField(term2455, term2455.getClass(), "bitCountPlusOne", 0);
        setIntField(term2455, term2455.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2455, term2455.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2455, term2455.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2454, term2454.getClass(), "intVal", term2455);
        setIntField(term2454, term2454.getClass(), "scale", 53);
        setIntField(term2454, term2454.getClass(), "precision", 0);
        setField(term2454, term2454.getClass(), "stringCache", null);
        setLongField(term2454, term2454.getClass(), "intCompact", -9223372036854775808L);
        setField(term2415, term2415.getClass(), "price", term2454);
        setField(term2471, term2471.getClass(), "id", term2472);
        setField(term2471, term2471.getClass(), "firstName", "JqXGgAhZPl");
        setField(term2471, term2471.getClass(), "lastName", "jiKYgYHqIS");
        setField(term2471, term2471.getClass(), "email", "DfISiziTgG");
        setField(term2415, term2415.getClass(), "author", term2471);
        term2510 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2510;
        callMethod(klass, "canEqual", argTypes, term2415, args);
    }

};


