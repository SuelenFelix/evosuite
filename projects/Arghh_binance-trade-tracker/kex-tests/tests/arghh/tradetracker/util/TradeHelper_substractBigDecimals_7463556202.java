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

public class TradeHelper_substractBigDecimals_7463556202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;
     Object term80;

    public TradeHelper_substractBigDecimals_7463556202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term64 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term66 = (int[]) newIntArray(6);
        setIntField(term64, term64.getClass(), "signum", 1);
        setIntElement(term66, 0, 27489);
        setIntElement(term66, 1, -274433180);
        setIntElement(term66, 2, 698548608);
        setIntElement(term66, 3, -1143703655);
        setIntElement(term66, 4, 1619765041);
        setIntElement(term66, 5, -418227111);
        setField(term64, term64.getClass(), "mag", term66);
        setIntField(term64, term64.getClass(), "bitCountPlusOne", 0);
        setIntField(term64, term64.getClass(), "bitLengthPlusOne", 0);
        setIntField(term64, term64.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term64, term64.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term63, term63.getClass(), "intVal", term64);
        setIntField(term63, term63.getClass(), "scale", 53);
        setIntField(term63, term63.getClass(), "precision", 0);
        setField(term63, term63.getClass(), "stringCache", null);
        setLongField(term63, term63.getClass(), "intCompact", -9223372036854775808L);
        term80 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term81 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term83 = (int[]) newIntArray(6);
        setIntField(term81, term81.getClass(), "signum", 1);
        setIntElement(term83, 0, 1807);
        setIntElement(term83, 1, 1210968587);
        setIntElement(term83, 2, -857410878);
        setIntElement(term83, 3, 520383771);
        setIntElement(term83, 4, 2106706510);
        setIntElement(term83, 5, 1731185477);
        setField(term81, term81.getClass(), "mag", term83);
        setIntField(term81, term81.getClass(), "bitCountPlusOne", 0);
        setIntField(term81, term81.getClass(), "bitLengthPlusOne", 0);
        setIntField(term81, term81.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term81, term81.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term80, term80.getClass(), "intVal", term81);
        setIntField(term80, term80.getClass(), "scale", 52);
        setIntField(term80, term80.getClass(), "precision", 0);
        setField(term80, term80.getClass(), "stringCache", null);
        setLongField(term80, term80.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.util.TradeHelper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        argTypes[1] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[2];
        args[0] = term63;
        args[1] = term80;
        callMethod(klass, "substractBigDecimals", argTypes, null, args);
    }

};


