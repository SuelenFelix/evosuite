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

public class Price_isNotZero_15887490322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;

    public Price_isNotZero_15887490322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69 = newInstance(Class.forName("legacyfighter.dietary.newproducts.Price"));
        Object term70 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term71 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term73 = (int[]) newIntArray(6);
        setIntField(term71, term71.getClass(), "signum", 1);
        setIntElement(term73, 0, 3779);
        setIntElement(term73, 1, 1825499203);
        setIntElement(term73, 2, 189827582);
        setIntElement(term73, 3, 731025545);
        setIntElement(term73, 4, -475097163);
        setIntElement(term73, 5, 890127363);
        setField(term71, term71.getClass(), "mag", term73);
        setIntField(term71, term71.getClass(), "bitCountPlusOne", 0);
        setIntField(term71, term71.getClass(), "bitLengthPlusOne", 0);
        setIntField(term71, term71.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term71, term71.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term70, term70.getClass(), "intVal", term71);
        setIntField(term70, term70.getClass(), "scale", 52);
        setIntField(term70, term70.getClass(), "precision", 0);
        setField(term70, term70.getClass(), "stringCache", null);
        setLongField(term70, term70.getClass(), "intCompact", -9223372036854775808L);
        setField(term69, term69.getClass(), "price", term70);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.newproducts.Price");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNotZero", argTypes, term69, args);
    }

};


