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
import java.lang.Integer;

public class OldProduct_init_13349911710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264;
     Object term305;

    public OldProduct_init_13349911710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term265 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term267 = (int[]) newIntArray(6);
        setIntField(term265, term265.getClass(), "signum", 1);
        setIntElement(term267, 0, 1954);
        setIntElement(term267, 1, -476668863);
        setIntElement(term267, 2, 661030673);
        setIntElement(term267, 3, 328061253);
        setIntElement(term267, 4, -431156338);
        setIntElement(term267, 5, 791621529);
        setField(term265, term265.getClass(), "mag", term267);
        setIntField(term265, term265.getClass(), "bitCountPlusOne", 0);
        setIntField(term265, term265.getClass(), "bitLengthPlusOne", 0);
        setIntField(term265, term265.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term265, term265.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term264, term264.getClass(), "intVal", term265);
        setIntField(term264, term264.getClass(), "scale", 52);
        setIntField(term264, term264.getClass(), "precision", 0);
        setField(term264, term264.getClass(), "stringCache", null);
        setLongField(term264, term264.getClass(), "intCompact", -9223372036854775808L);
        term305 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.newproducts.OldProduct");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.Integer");
        Object[] args = new Object[4];
        args[0] = term264;
        args[1] = "SzjVpOQTyS";
        args[2] = "MjGYSRKTNF";
        args[3] = term305;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


