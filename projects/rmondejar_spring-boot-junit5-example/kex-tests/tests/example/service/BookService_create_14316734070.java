package example.service;

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
import static example.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class BookService_create_14316734070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74;

    public BookService_create_14316734070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term75 = new Long(-8257434502486459194L);
        Long term131 = new Long(-8400487765614892086L);
        term74 = newInstance(Class.forName("example.dto.BookDto"));
        Object term113 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term114 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term116 = (int[]) newIntArray(6);
        Object term130 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term74, term74.getClass(), "id", term75);
        setField(term74, term74.getClass(), "title", "xxtlPwDYFs");
        setField(term74, term74.getClass(), "description", "jJCZpVmanW");
        setField(term74, term74.getClass(), "genre", "EGtDIRbSSb");
        setIntField(term114, term114.getClass(), "signum", 1);
        setIntElement(term116, 0, 9058);
        setIntElement(term116, 1, 1365043541);
        setIntElement(term116, 2, 1239861896);
        setIntElement(term116, 3, -1338148297);
        setIntElement(term116, 4, -418263970);
        setIntElement(term116, 5, -265097411);
        setField(term114, term114.getClass(), "mag", term116);
        setIntField(term114, term114.getClass(), "bitCountPlusOne", 0);
        setIntField(term114, term114.getClass(), "bitLengthPlusOne", 0);
        setIntField(term114, term114.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term114, term114.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term113, term113.getClass(), "intVal", term114);
        setIntField(term113, term113.getClass(), "scale", 53);
        setIntField(term113, term113.getClass(), "precision", 0);
        setField(term113, term113.getClass(), "stringCache", null);
        setLongField(term113, term113.getClass(), "intCompact", -9223372036854775808L);
        setField(term74, term74.getClass(), "price", term113);
        setField(term130, term130.getClass(), "id", term131);
        setField(term130, term130.getClass(), "firstName", "SzjVpOQTyS");
        setField(term130, term130.getClass(), "lastName", "MjGYSRKTNF");
        setField(term130, term130.getClass(), "email", "hRNSzYYIrc");
        setField(term74, term74.getClass(), "author", term130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.service.BookService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("example.dto.BookDto");
        Object[] args = new Object[1];
        args[0] = term74;
        callMethod(klass, "create", argTypes, null, args);
    }

};


