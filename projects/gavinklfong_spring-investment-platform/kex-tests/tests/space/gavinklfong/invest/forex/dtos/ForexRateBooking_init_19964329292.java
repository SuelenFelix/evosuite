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
import java.lang.Object;
import java.lang.Long;

public class ForexRateBooking_init_19964329292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15454;
     Object term15470;

    public ForexRateBooking_init_19964329292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15454 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term15455 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term15457 = (int[]) newIntArray(5);
        setIntField(term15455, term15455.getClass(), "signum", 1);
        setIntElement(term15457, 0, -2002033409);
        setIntElement(term15457, 1, -1386179650);
        setIntElement(term15457, 2, -1729534613);
        setIntElement(term15457, 3, 1100074383);
        setIntElement(term15457, 4, -1610460545);
        setField(term15455, term15455.getClass(), "mag", term15457);
        setIntField(term15455, term15455.getClass(), "bitCountPlusOne", 0);
        setIntField(term15455, term15455.getClass(), "bitLengthPlusOne", 0);
        setIntField(term15455, term15455.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term15455, term15455.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term15454, term15454.getClass(), "intVal", term15455);
        setIntField(term15454, term15454.getClass(), "scale", 49);
        setIntField(term15454, term15454.getClass(), "precision", 0);
        setField(term15454, term15454.getClass(), "stringCache", null);
        setLongField(term15454, term15454.getClass(), "intCompact", -9223372036854775808L);
        term15470 = new Long(-5788180182343976541L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.math.BigDecimal");
        argTypes[3] = Class.forName("java.lang.Long");
        Object[] args = new Object[4];
        args[0] = "tlQSNgTkQX";
        args[1] = "PCipZnmBOF";
        args[2] = term15454;
        args[3] = term15470;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


