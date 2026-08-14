package tudelft.smells.readability;

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
import static tudelft.smells.readability.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Invoice_init_3815698520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object enum0;

    public Invoice_init_3815698520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4 = (int[]) newIntArray(6);
        setIntField(term2, term2.getClass(), "signum", 1);
        setIntElement(term4, 0, 9058);
        setIntElement(term4, 1, 1365043541);
        setIntElement(term4, 2, 1239861896);
        setIntElement(term4, 3, -1338148297);
        setIntElement(term4, 4, -418263970);
        setIntElement(term4, 5, -265097411);
        setField(term2, term2.getClass(), "mag", term4);
        setIntField(term2, term2.getClass(), "bitCountPlusOne", 0);
        setIntField(term2, term2.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2, term2.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2, term2.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1, term1.getClass(), "intVal", term2);
        setIntField(term1, term1.getClass(), "scale", 53);
        setIntField(term1, term1.getClass(), "precision", 0);
        setField(term1, term1.getClass(), "stringCache", null);
        setLongField(term1, term1.getClass(), "intCompact", -9223372036854775808L);
        Class<? extends Object> term79 = Class.forName((String) "tudelft.smells.readability.CustomerType");
        Field term78 = ((Class) term79).getDeclaredField((String) "COMPANY");
        ((Field) term78).setAccessible(true);
        enum0 = ((Field) term78).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.smells.readability.Invoice");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("tudelft.smells.readability.CustomerType");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = "PAEBtnZtTD";
        args[2] = enum0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


