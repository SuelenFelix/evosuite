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

public class BookDto_getId_10337128313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161;

    public BookDto_getId_10337128313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term162 = new Long(-8257434502486459194L);
        Long term218 = new Long(-8400487765614892086L);
        term161 = newInstance(Class.forName("example.dto.BookDto"));
        Object term200 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term201 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term203 = (int[]) newIntArray(6);
        Object term217 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term161, term161.getClass(), "id", term162);
        setField(term161, term161.getClass(), "title", "SzjVpOQTyS");
        setField(term161, term161.getClass(), "description", "MjGYSRKTNF");
        setField(term161, term161.getClass(), "genre", "hRNSzYYIrc");
        setIntField(term201, term201.getClass(), "signum", 1);
        setIntElement(term203, 0, 2364);
        setIntElement(term203, 1, -1446584625);
        setIntElement(term203, 2, 1957600567);
        setIntElement(term203, 3, -336418707);
        setIntElement(term203, 4, -1905211145);
        setIntElement(term203, 5, 86968353);
        setField(term201, term201.getClass(), "mag", term203);
        setIntField(term201, term201.getClass(), "bitCountPlusOne", 0);
        setIntField(term201, term201.getClass(), "bitLengthPlusOne", 0);
        setIntField(term201, term201.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term201, term201.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term200, term200.getClass(), "intVal", term201);
        setIntField(term200, term200.getClass(), "scale", 52);
        setIntField(term200, term200.getClass(), "precision", 0);
        setField(term200, term200.getClass(), "stringCache", null);
        setLongField(term200, term200.getClass(), "intCompact", -9223372036854775808L);
        setField(term161, term161.getClass(), "price", term200);
        setField(term217, term217.getClass(), "id", term218);
        setField(term217, term217.getClass(), "firstName", "RMFIsYGgne");
        setField(term217, term217.getClass(), "lastName", "NRdvgJlhkX");
        setField(term217, term217.getClass(), "email", "uuaPigETmJ");
        setField(term161, term161.getClass(), "author", term217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term161, args);
    }

};


