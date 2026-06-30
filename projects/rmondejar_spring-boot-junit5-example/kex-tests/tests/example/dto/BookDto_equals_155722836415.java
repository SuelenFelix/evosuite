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

public class BookDto_equals_155722836415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2253;
     Object term2348;

    public BookDto_equals_155722836415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2254 = new Long(1967728129628047933L);
        Long term2310 = new Long(2120084523938730454L);
        term2253 = newInstance(Class.forName("example.dto.BookDto"));
        Object term2292 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2293 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2295 = (int[]) newIntArray(6);
        Object term2309 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term2253, term2253.getClass(), "id", term2254);
        setField(term2253, term2253.getClass(), "title", "cAPeiZHKGJ");
        setField(term2253, term2253.getClass(), "description", "LvJFtLBaxj");
        setField(term2253, term2253.getClass(), "genre", "PHvxnGHptP");
        setIntField(term2293, term2293.getClass(), "signum", 1);
        setIntElement(term2295, 0, 48108);
        setIntElement(term2295, 1, 419671270);
        setIntElement(term2295, 2, 909082732);
        setIntElement(term2295, 3, 2078883588);
        setIntElement(term2295, 4, 1670017529);
        setIntElement(term2295, 5, -2116499193);
        setField(term2293, term2293.getClass(), "mag", term2295);
        setIntField(term2293, term2293.getClass(), "bitCountPlusOne", 0);
        setIntField(term2293, term2293.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2293, term2293.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2293, term2293.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2292, term2292.getClass(), "intVal", term2293);
        setIntField(term2292, term2292.getClass(), "scale", 53);
        setIntField(term2292, term2292.getClass(), "precision", 0);
        setField(term2292, term2292.getClass(), "stringCache", null);
        setLongField(term2292, term2292.getClass(), "intCompact", -9223372036854775808L);
        setField(term2253, term2253.getClass(), "price", term2292);
        setField(term2309, term2309.getClass(), "id", term2310);
        setField(term2309, term2309.getClass(), "firstName", "TimdotUuNC");
        setField(term2309, term2309.getClass(), "lastName", "PkWMRdJcBb");
        setField(term2309, term2309.getClass(), "email", "jSpAteRute");
        setField(term2253, term2253.getClass(), "author", term2309);
        term2348 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2348;
        callMethod(klass, "equals", argTypes, term2253, args);
    }

};


