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

public class BookDto_init_12220496692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term39;
     Object term56;

    public BookDto_init_12220496692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Long(2442117782898005296L);
        term39 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term40 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term42 = (int[]) newIntArray(6);
        setIntField(term40, term40.getClass(), "signum", 1);
        setIntElement(term42, 0, 9058);
        setIntElement(term42, 1, 1365043541);
        setIntElement(term42, 2, 1239861896);
        setIntElement(term42, 3, -1338148297);
        setIntElement(term42, 4, -418263970);
        setIntElement(term42, 5, -265097411);
        setField(term40, term40.getClass(), "mag", term42);
        setIntField(term40, term40.getClass(), "bitCountPlusOne", 0);
        setIntField(term40, term40.getClass(), "bitLengthPlusOne", 0);
        setIntField(term40, term40.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term40, term40.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term39, term39.getClass(), "intVal", term40);
        setIntField(term39, term39.getClass(), "scale", 53);
        setIntField(term39, term39.getClass(), "precision", 0);
        setField(term39, term39.getClass(), "stringCache", null);
        setLongField(term39, term39.getClass(), "intCompact", -9223372036854775808L);
        Long term57 = new Long(6375119433582206027L);
        term56 = newInstance(Class.forName("example.dto.AuthorDto"));
        setField(term56, term56.getClass(), "id", term57);
        setField(term56, term56.getClass(), "firstName", "xxtlPwDYFs");
        setField(term56, term56.getClass(), "lastName", "jJCZpVmanW");
        setField(term56, term56.getClass(), "email", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.dto.BookDto");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.math.BigDecimal");
        argTypes[5] = Class.forName("example.dto.AuthorDto");
        Object[] args = new Object[6];
        args[0] = term1;
        args[1] = "PAEBtnZtTD";
        args[2] = "sjlJAEtRrb";
        args[3] = "MuLcgQHgqz";
        args[4] = term39;
        args[5] = term56;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


