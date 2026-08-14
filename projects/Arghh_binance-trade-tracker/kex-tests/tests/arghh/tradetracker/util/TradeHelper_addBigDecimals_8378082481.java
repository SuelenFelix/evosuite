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
import java.util.LinkedList;
import java.lang.Object;

public class TradeHelper_addBigDecimals_8378082481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TradeHelper_addBigDecimals_8378082481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7 = (int[]) newIntArray(6);
        setIntField(term5, term5.getClass(), "signum", 1);
        setIntElement(term7, 0, 9058);
        setIntElement(term7, 1, 1365043541);
        setIntElement(term7, 2, 1239861896);
        setIntElement(term7, 3, -1338148297);
        setIntElement(term7, 4, -418263970);
        setIntElement(term7, 5, -265097411);
        setField(term5, term5.getClass(), "mag", term7);
        setIntField(term5, term5.getClass(), "bitCountPlusOne", 0);
        setIntField(term5, term5.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5, term5.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5, term5.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4, term4.getClass(), "intVal", term5);
        setIntField(term4, term4.getClass(), "scale", 53);
        setIntField(term4, term4.getClass(), "precision", 0);
        setField(term4, term4.getClass(), "stringCache", null);
        setLongField(term4, term4.getClass(), "intCompact", -9223372036854775808L);
        Object term22 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term23 = newInstance(Class.forName("java.math.BigInteger"));
        setIntField(term23, term23.getClass(), "signum", 1);
        setField(term23, term23.getClass(), "mag", null);
        setIntField(term23, term23.getClass(), "bitCountPlusOne", 0);
        setIntField(term23, term23.getClass(), "bitLengthPlusOne", 0);
        setIntField(term23, term23.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term23, term23.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term22, term22.getClass(), "intVal", term23);
        setIntField(term22, term22.getClass(), "scale", 52);
        setIntField(term22, term22.getClass(), "precision", 0);
        setField(term22, term22.getClass(), "stringCache", null);
        setLongField(term22, term22.getClass(), "intCompact", -9223372036854775808L);
        Object term33 = newInstance(Class.forName("java.math.BigDecimal"));
        setField(term33, term33.getClass(), "intVal", null);
        setIntField(term33, term33.getClass(), "scale", 52);
        setIntField(term33, term33.getClass(), "precision", 0);
        setField(term33, term33.getClass(), "stringCache", null);
        setLongField(term33, term33.getClass(), "intCompact", -9223372036854775808L);
        term1 = new LinkedList();
        ((LinkedList) term1).add(term4);
        ((LinkedList) term1).add(term22);
        ((LinkedList) term1).add(term33);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.util.TradeHelper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "addBigDecimals", argTypes, null, args);
    }

};


