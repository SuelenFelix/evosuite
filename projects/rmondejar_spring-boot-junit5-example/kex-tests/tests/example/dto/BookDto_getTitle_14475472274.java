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

public class BookDto_getTitle_14475472274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322;

    public BookDto_getTitle_14475472274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term323 = new Long(5270370404989704783L);
        Long term379 = new Long(7411271909051562686L);
        term322 = newInstance(Class.forName("example.dto.BookDto"));
        Object term361 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term362 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term364 = (int[]) newIntArray(6);
        Object term378 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term322, term322.getClass(), "id", term323);
        setField(term322, term322.getClass(), "title", "MxlszYVzRf");
        setField(term322, term322.getClass(), "description", "LQFpaHEwXR");
        setField(term322, term322.getClass(), "genre", "oVcInYnLWB");
        setIntField(term362, term362.getClass(), "signum", 1);
        setIntElement(term364, 0, 3779);
        setIntElement(term364, 1, 1825499203);
        setIntElement(term364, 2, 189827582);
        setIntElement(term364, 3, 731025545);
        setIntElement(term364, 4, -475097163);
        setIntElement(term364, 5, 890127363);
        setField(term362, term362.getClass(), "mag", term364);
        setIntField(term362, term362.getClass(), "bitCountPlusOne", 0);
        setIntField(term362, term362.getClass(), "bitLengthPlusOne", 0);
        setIntField(term362, term362.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term362, term362.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term361, term361.getClass(), "intVal", term362);
        setIntField(term361, term361.getClass(), "scale", 52);
        setIntField(term361, term361.getClass(), "precision", 0);
        setField(term361, term361.getClass(), "stringCache", null);
        setLongField(term361, term361.getClass(), "intCompact", -9223372036854775808L);
        setField(term322, term322.getClass(), "price", term361);
        setField(term378, term378.getClass(), "id", term379);
        setField(term378, term378.getClass(), "firstName", "aJlieCFVtF");
        setField(term378, term378.getClass(), "lastName", "ZiaGIbnzTs");
        setField(term378, term378.getClass(), "email", "tbcdzjIfER");
        setField(term322, term322.getClass(), "author", term378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term322, args);
    }

};


