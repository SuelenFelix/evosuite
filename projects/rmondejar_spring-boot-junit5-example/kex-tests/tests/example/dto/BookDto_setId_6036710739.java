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

public class BookDto_setId_6036710739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1127;
     Object term1222;

    public BookDto_setId_6036710739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1128 = new Long(-5476826692763582090L);
        Long term1184 = new Long(-872011222785455006L);
        term1127 = newInstance(Class.forName("example.dto.BookDto"));
        Object term1166 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1167 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1169 = (int[]) newIntArray(6);
        Object term1183 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term1127, term1127.getClass(), "id", term1128);
        setField(term1127, term1127.getClass(), "title", "gGSMzuGICf");
        setField(term1127, term1127.getClass(), "description", "hxCBltsObl");
        setField(term1127, term1127.getClass(), "genre", "BndsHwAFMv");
        setIntField(term1167, term1167.getClass(), "signum", 1);
        setIntElement(term1169, 0, 25264);
        setIntElement(term1169, 1, 13306318);
        setIntElement(term1169, 2, 145344007);
        setIntElement(term1169, 3, -1015263393);
        setIntElement(term1169, 4, -1366378930);
        setIntElement(term1169, 5, 983206517);
        setField(term1167, term1167.getClass(), "mag", term1169);
        setIntField(term1167, term1167.getClass(), "bitCountPlusOne", 0);
        setIntField(term1167, term1167.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1167, term1167.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1167, term1167.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1166, term1166.getClass(), "intVal", term1167);
        setIntField(term1166, term1166.getClass(), "scale", 53);
        setIntField(term1166, term1166.getClass(), "precision", 0);
        setField(term1166, term1166.getClass(), "stringCache", null);
        setLongField(term1166, term1166.getClass(), "intCompact", -9223372036854775808L);
        setField(term1127, term1127.getClass(), "price", term1166);
        setField(term1183, term1183.getClass(), "id", term1184);
        setField(term1183, term1183.getClass(), "firstName", "GzFkzHGYFt");
        setField(term1183, term1183.getClass(), "lastName", "tShwQLRGNe");
        setField(term1183, term1183.getClass(), "email", "LvtrsXUliU");
        setField(term1127, term1127.getClass(), "author", term1183);
        term1222 = new Long(-316468845751588286L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1222;
        callMethod(klass, "setId", argTypes, term1127, args);
    }

};


