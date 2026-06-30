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

public class NumberUtil_bigDecimalToString_84141199016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386;

    public NumberUtil_bigDecimalToString_84141199016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term387 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term389 = (int[]) newIntArray(6);
        setIntField(term387, term387.getClass(), "signum", 1);
        setIntElement(term389, 0, 9058);
        setIntElement(term389, 1, 1365043541);
        setIntElement(term389, 2, 1239861896);
        setIntElement(term389, 3, -1338148297);
        setIntElement(term389, 4, -418263970);
        setIntElement(term389, 5, -265097411);
        setField(term387, term387.getClass(), "mag", term389);
        setIntField(term387, term387.getClass(), "bitCountPlusOne", 0);
        setIntField(term387, term387.getClass(), "bitLengthPlusOne", 0);
        setIntField(term387, term387.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term387, term387.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term386, term386.getClass(), "intVal", term387);
        setIntField(term386, term386.getClass(), "scale", 53);
        setIntField(term386, term386.getClass(), "precision", 0);
        setField(term386, term386.getClass(), "stringCache", null);
        setLongField(term386, term386.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.util.NumberUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term386;
        callMethod(klass, "bigDecimalToString", argTypes, null, args);
    }

};


