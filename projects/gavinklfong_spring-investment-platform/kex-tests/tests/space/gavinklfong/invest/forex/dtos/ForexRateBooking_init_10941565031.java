package space.gavinklfong.invest.forex.dtos;

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
import static space.gavinklfong.invest.forex.dtos.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;
import java.lang.Object;

public class ForexRateBooking_init_10941565031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15363;
     Object term15365;

    public ForexRateBooking_init_10941565031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15363 = new Double(0.43337207054070237);
        term15365 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term15366 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term15368 = (int[]) newIntArray(6);
        setIntField(term15366, term15366.getClass(), "signum", 1);
        setIntElement(term15368, 0, 2454);
        setIntElement(term15368, 1, -2113177110);
        setIntElement(term15368, 2, 1797955482);
        setIntElement(term15368, 3, 2062976789);
        setIntElement(term15368, 4, -1123752995);
        setIntElement(term15368, 5, 1177879883);
        setField(term15366, term15366.getClass(), "mag", term15368);
        setIntField(term15366, term15366.getClass(), "bitCountPlusOne", 0);
        setIntField(term15366, term15366.getClass(), "bitLengthPlusOne", 0);
        setIntField(term15366, term15366.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term15366, term15366.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term15365, term15365.getClass(), "intVal", term15366);
        setIntField(term15365, term15365.getClass(), "scale", 52);
        setIntField(term15365, term15365.getClass(), "precision", 0);
        setField(term15365, term15365.getClass(), "stringCache", null);
        setLongField(term15365, term15365.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Double");
        argTypes[3] = Class.forName("java.math.BigDecimal");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = "QduALnDSVo";
        args[1] = "izPpKDErnQ";
        args[2] = term15363;
        args[3] = term15365;
        args[4] = "NnpwZBUTvx";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


