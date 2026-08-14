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

public class TradeHelper_addStringToBigDecimal_2302921596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;

    public TradeHelper_addStringToBigDecimal_2302921596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term140 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term142 = (int[]) newIntArray(6);
        setIntField(term140, term140.getClass(), "signum", 1);
        setIntElement(term142, 0, 25264);
        setIntElement(term142, 1, 13306318);
        setIntElement(term142, 2, 145344007);
        setIntElement(term142, 3, -1015263393);
        setIntElement(term142, 4, -1366378930);
        setIntElement(term142, 5, 983206517);
        setField(term140, term140.getClass(), "mag", term142);
        setIntField(term140, term140.getClass(), "bitCountPlusOne", 0);
        setIntField(term140, term140.getClass(), "bitLengthPlusOne", 0);
        setIntField(term140, term140.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term140, term140.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term139, term139.getClass(), "intVal", term140);
        setIntField(term139, term139.getClass(), "scale", 53);
        setIntField(term139, term139.getClass(), "precision", 0);
        setField(term139, term139.getClass(), "stringCache", null);
        setLongField(term139, term139.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.util.TradeHelper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term139;
        args[1] = "sjlJAEtRrb";
        callMethod(klass, "addStringToBigDecimal", argTypes, null, args);
    }

};


