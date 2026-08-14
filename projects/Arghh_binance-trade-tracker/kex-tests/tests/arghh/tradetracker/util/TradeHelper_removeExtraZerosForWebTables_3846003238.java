package arghh.tradetracker.util;

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
import static arghh.tradetracker.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TradeHelper_removeExtraZerosForWebTables_3846003238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term459;

    public TradeHelper_removeExtraZerosForWebTables_3846003238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term459 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term460 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term462 = (int[]) newIntArray(6);
        setIntField(term460, term460.getClass(), "signum", 1);
        setIntElement(term462, 0, 2584);
        setIntElement(term462, 1, -1946484122);
        setIntElement(term462, 2, 1992026795);
        setIntElement(term462, 3, 1045205752);
        setIntElement(term462, 4, 613377469);
        setIntElement(term462, 5, -1848020175);
        setField(term460, term460.getClass(), "mag", term462);
        setIntField(term460, term460.getClass(), "bitCountPlusOne", 0);
        setIntField(term460, term460.getClass(), "bitLengthPlusOne", 0);
        setIntField(term460, term460.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term460, term460.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term459, term459.getClass(), "intVal", term460);
        setIntField(term459, term459.getClass(), "scale", 52);
        setIntField(term459, term459.getClass(), "precision", 0);
        setField(term459, term459.getClass(), "stringCache", null);
        setLongField(term459, term459.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.util.TradeHelper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term459;
        callMethod(klass, "removeExtraZerosForWebTables", argTypes, null, args);
    }

};


