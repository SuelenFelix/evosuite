package kyungseo.poc.simple.web.appcore.util;

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
import static kyungseo.poc.simple.web.appcore.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NumberUtil_nullToZero_139920271119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433;

    public NumberUtil_nullToZero_139920271119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term433 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term434 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term436 = (int[]) newIntArray(6);
        setIntField(term434, term434.getClass(), "signum", 1);
        setIntElement(term436, 0, 2364);
        setIntElement(term436, 1, -1446584625);
        setIntElement(term436, 2, 1957600567);
        setIntElement(term436, 3, -336418707);
        setIntElement(term436, 4, -1905211145);
        setIntElement(term436, 5, 86968353);
        setField(term434, term434.getClass(), "mag", term436);
        setIntField(term434, term434.getClass(), "bitCountPlusOne", 0);
        setIntField(term434, term434.getClass(), "bitLengthPlusOne", 0);
        setIntField(term434, term434.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term434, term434.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term433, term433.getClass(), "intVal", term434);
        setIntField(term433, term433.getClass(), "scale", 52);
        setIntField(term433, term433.getClass(), "precision", 0);
        setField(term433, term433.getClass(), "stringCache", null);
        setLongField(term433, term433.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.util.NumberUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term433;
        callMethod(klass, "nullToZero", argTypes, null, args);
    }

};


