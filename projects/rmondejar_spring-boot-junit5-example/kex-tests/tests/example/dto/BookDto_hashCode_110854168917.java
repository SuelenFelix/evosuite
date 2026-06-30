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

public class BookDto_hashCode_110854168917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2577;

    public BookDto_hashCode_110854168917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2578 = new Long(5262507301787091109L);
        Long term2634 = new Long(-6823727938421990489L);
        term2577 = newInstance(Class.forName("example.dto.BookDto"));
        Object term2616 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2617 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2619 = (int[]) newIntArray(6);
        Object term2633 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term2577, term2577.getClass(), "id", term2578);
        setField(term2577, term2577.getClass(), "title", "XqgfKFvPSD");
        setField(term2577, term2577.getClass(), "description", "JiVRgTZvKc");
        setField(term2577, term2577.getClass(), "genre", "XPKmummaqg");
        setIntField(term2617, term2617.getClass(), "signum", 1);
        setIntElement(term2619, 0, 6724);
        setIntElement(term2619, 1, -459858691);
        setIntElement(term2619, 2, -950374219);
        setIntElement(term2619, 3, -1430160029);
        setIntElement(term2619, 4, 1532735250);
        setIntElement(term2619, 5, 890914777);
        setField(term2617, term2617.getClass(), "mag", term2619);
        setIntField(term2617, term2617.getClass(), "bitCountPlusOne", 0);
        setIntField(term2617, term2617.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2617, term2617.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2617, term2617.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2616, term2616.getClass(), "intVal", term2617);
        setIntField(term2616, term2616.getClass(), "scale", 52);
        setIntField(term2616, term2616.getClass(), "precision", 0);
        setField(term2616, term2616.getClass(), "stringCache", null);
        setLongField(term2616, term2616.getClass(), "intCompact", -9223372036854775808L);
        setField(term2577, term2577.getClass(), "price", term2616);
        setField(term2633, term2633.getClass(), "id", term2634);
        setField(term2633, term2633.getClass(), "firstName", "BKLfkLiZTH");
        setField(term2633, term2633.getClass(), "lastName", "SPpkrGcPRr");
        setField(term2633, term2633.getClass(), "email", "sEccwbJKYE");
        setField(term2577, term2577.getClass(), "author", term2633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2577, args);
    }

};


