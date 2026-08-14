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
import java.lang.String;

public class TradeHelper_addBaseCurrencyProfit_20469329627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184;
     Object enum0;

    public TradeHelper_addBaseCurrencyProfit_20469329627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term185 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term187 = (int[]) newIntArray(6);
        setIntField(term185, term185.getClass(), "signum", 1);
        setIntElement(term187, 0, 4157);
        setIntElement(term187, 1, -1258399411);
        setIntElement(term187, 2, -1445096589);
        setIntElement(term187, 3, 1602721280);
        setIntElement(term187, 4, 1738795194);
        setIntElement(term187, 5, -481877419);
        setField(term185, term185.getClass(), "mag", term187);
        setIntField(term185, term185.getClass(), "bitCountPlusOne", 0);
        setIntField(term185, term185.getClass(), "bitLengthPlusOne", 0);
        setIntField(term185, term185.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term185, term185.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term184, term184.getClass(), "intVal", term185);
        setIntField(term184, term184.getClass(), "scale", 52);
        setIntField(term184, term184.getClass(), "precision", 0);
        setField(term184, term184.getClass(), "stringCache", null);
        setLongField(term184, term184.getClass(), "intCompact", -9223372036854775808L);
        Class<? extends Object> term244 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term243 = ((Class) term244).getDeclaredField((String) "BTC");
        ((Field) term243).setAccessible(true);
        enum0 = ((Field) term243).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.util.TradeHelper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        argTypes[1] = Class.forName("arghh.tradetracker.services.BaseCurrency");
        Object[] args = new Object[2];
        args[0] = term184;
        args[1] = enum0;
        callMethod(klass, "addBaseCurrencyProfit", argTypes, null, args);
    }

};


