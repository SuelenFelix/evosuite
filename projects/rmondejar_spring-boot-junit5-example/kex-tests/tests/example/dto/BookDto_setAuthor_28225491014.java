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

public class BookDto_setAuthor_28225491014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2023;
     Object term2118;

    public BookDto_setAuthor_28225491014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2024 = new Long(7009926388951271268L);
        Long term2080 = new Long(-7672528020740371001L);
        term2023 = newInstance(Class.forName("example.dto.BookDto"));
        Object term2062 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2063 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2065 = (int[]) newIntArray(6);
        Object term2079 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term2023, term2023.getClass(), "id", term2024);
        setField(term2023, term2023.getClass(), "title", "MAcUBcBckh");
        setField(term2023, term2023.getClass(), "description", "oVgzLbrsFr");
        setField(term2023, term2023.getClass(), "genre", "vQVyKLdtaz");
        setIntField(term2063, term2063.getClass(), "signum", 1);
        setIntElement(term2065, 0, 9405);
        setIntElement(term2065, 1, 205999050);
        setIntElement(term2065, 2, 647637684);
        setIntElement(term2065, 3, -896420066);
        setIntElement(term2065, 4, 1280002914);
        setIntElement(term2065, 5, 183404747);
        setField(term2063, term2063.getClass(), "mag", term2065);
        setIntField(term2063, term2063.getClass(), "bitCountPlusOne", 0);
        setIntField(term2063, term2063.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2063, term2063.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2063, term2063.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2062, term2062.getClass(), "intVal", term2063);
        setIntField(term2062, term2062.getClass(), "scale", 53);
        setIntField(term2062, term2062.getClass(), "precision", 0);
        setField(term2062, term2062.getClass(), "stringCache", null);
        setLongField(term2062, term2062.getClass(), "intCompact", -9223372036854775808L);
        setField(term2023, term2023.getClass(), "price", term2062);
        setField(term2079, term2079.getClass(), "id", term2080);
        setField(term2079, term2079.getClass(), "firstName", "OWKQODBLzb");
        setField(term2079, term2079.getClass(), "lastName", "wGmYcqUkgE");
        setField(term2079, term2079.getClass(), "email", "idgaQsnJpQ");
        setField(term2023, term2023.getClass(), "author", term2079);
        Long term2119 = new Long(-4502405999831680926L);
        term2118 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term2118, term2118.getClass(), "id", term2119);
        setField(term2118, term2118.getClass(), "firstName", "VgZnGoIFwQ");
        setField(term2118, term2118.getClass(), "lastName", "jUbSRrkrYZ");
        setField(term2118, term2118.getClass(), "email", "bWWfajKbEX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("example.dto.AuthorDto");
        Object[] args = new Object[1];
        args[0] = term2118;
        callMethod(klass, "setAuthor", argTypes, term2023, args);
    }

};


