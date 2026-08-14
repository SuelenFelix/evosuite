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

public class Price_init_10521737401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46;

    public Price_init_10521737401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term47 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term49 = (int[]) newIntArray(6);
        setIntField(term47, term47.getClass(), "signum", 1);
        setIntElement(term49, 0, 2364);
        setIntElement(term49, 1, -1446584625);
        setIntElement(term49, 2, 1957600567);
        setIntElement(term49, 3, -336418707);
        setIntElement(term49, 4, -1905211145);
        setIntElement(term49, 5, 86968353);
        setField(term47, term47.getClass(), "mag", term49);
        setIntField(term47, term47.getClass(), "bitCountPlusOne", 0);
        setIntField(term47, term47.getClass(), "bitLengthPlusOne", 0);
        setIntField(term47, term47.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term47, term47.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term46, term46.getClass(), "intVal", term47);
        setIntField(term46, term46.getClass(), "scale", 52);
        setIntField(term46, term46.getClass(), "precision", 0);
        setField(term46, term46.getClass(), "stringCache", null);
        setLongField(term46, term46.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.newproducts.Price");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term46;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


