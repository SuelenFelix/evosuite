package legacyfighter.dietary.newproducts;

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
import static legacyfighter.dietary.newproducts.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Price_of_17533828030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public Price_of_17533828030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term24 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term26 = (int[]) newIntArray(6);
        setIntField(term24, term24.getClass(), "signum", 1);
        setIntElement(term26, 0, 9058);
        setIntElement(term26, 1, 1365043541);
        setIntElement(term26, 2, 1239861896);
        setIntElement(term26, 3, -1338148297);
        setIntElement(term26, 4, -418263970);
        setIntElement(term26, 5, -265097411);
        setField(term24, term24.getClass(), "mag", term26);
        setIntField(term24, term24.getClass(), "bitCountPlusOne", 0);
        setIntField(term24, term24.getClass(), "bitLengthPlusOne", 0);
        setIntField(term24, term24.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term24, term24.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term23, term23.getClass(), "intVal", term24);
        setIntField(term23, term23.getClass(), "scale", 53);
        setIntField(term23, term23.getClass(), "precision", 0);
        setField(term23, term23.getClass(), "stringCache", null);
        setLongField(term23, term23.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.newproducts.Price");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term23;
        callMethod(klass, "of", argTypes, null, args);
    }

};


