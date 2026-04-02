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

public class BookDto_toString_59778199918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2738;

    public BookDto_toString_59778199918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2739 = new Long(-484994522244390100L);
        Long term2795 = new Long(1233889271256172047L);
        term2738 = newInstance(Class.forName("example.dto.BookDto"));
        Object term2777 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2778 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2780 = (int[]) newIntArray(6);
        Object term2794 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term2738, term2738.getClass(), "id", term2739);
        setField(term2738, term2738.getClass(), "title", "AWRooQKkdW");
        setField(term2738, term2738.getClass(), "description", "vjxIhXHxGR");
        setField(term2738, term2738.getClass(), "genre", "QXzGXbEXMu");
        setIntField(term2778, term2778.getClass(), "signum", 1);
        setIntElement(term2780, 0, 190);
        setIntElement(term2780, 1, 842222845);
        setIntElement(term2780, 2, 1366336864);
        setIntElement(term2780, 3, -295316729);
        setIntElement(term2780, 4, 1173791667);
        setIntElement(term2780, 5, -522535689);
        setField(term2778, term2778.getClass(), "mag", term2780);
        setIntField(term2778, term2778.getClass(), "bitCountPlusOne", 0);
        setIntField(term2778, term2778.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2778, term2778.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2778, term2778.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2777, term2777.getClass(), "intVal", term2778);
        setIntField(term2777, term2777.getClass(), "scale", 51);
        setIntField(term2777, term2777.getClass(), "precision", 0);
        setField(term2777, term2777.getClass(), "stringCache", null);
        setLongField(term2777, term2777.getClass(), "intCompact", -9223372036854775808L);
        setField(term2738, term2738.getClass(), "price", term2777);
        setField(term2794, term2794.getClass(), "id", term2795);
        setField(term2794, term2794.getClass(), "firstName", "qxSDVejjiY");
        setField(term2794, term2794.getClass(), "lastName", "xBsXSDjXYK");
        setField(term2794, term2794.getClass(), "email", "sEnIVFtZuQ");
        setField(term2738, term2738.getClass(), "author", term2794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2738, args);
    }

};


