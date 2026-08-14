package arghh.tradetracker.model;

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
import static arghh.tradetracker.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Profit_getbuySellPair_1890243979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2521;

    public Profit_getbuySellPair_1890243979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2522 = new Long(6967924379644551255L);
        Class<? extends Object> term2590 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term2589 = ((Class) term2590).getDeclaredField((String) "ETH");
        ((Field) term2589).setAccessible(true);
        Object enum8 = ((Field) term2589).get((Object) null);
        ArrayList term2583 = new ArrayList();
        term2521 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        Object term2531 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2532 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2534 = (int[]) newIntArray(6);
        Object term2548 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2549 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2551 = (int[]) newIntArray(6);
        Object term2565 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2566 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2568 = (int[]) newIntArray(6);
        Object term2587 = newInstance(Class.forName("java.util.Date"));
        setField(term2521, term2521.getClass(), "id", term2522);
        setField(term2521, term2521.getClass(), "baseCurrency", enum8);
        setIntField(term2532, term2532.getClass(), "signum", 1);
        setIntElement(term2534, 0, 51722);
        setIntElement(term2534, 1, 1822015379);
        setIntElement(term2534, 2, 1030733959);
        setIntElement(term2534, 3, 1299891196);
        setIntElement(term2534, 4, 1679751767);
        setIntElement(term2534, 5, -572989409);
        setField(term2532, term2532.getClass(), "mag", term2534);
        setIntField(term2532, term2532.getClass(), "bitCountPlusOne", 0);
        setIntField(term2532, term2532.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2532, term2532.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2532, term2532.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2531, term2531.getClass(), "intVal", term2532);
        setIntField(term2531, term2531.getClass(), "scale", 53);
        setIntField(term2531, term2531.getClass(), "precision", 0);
        setField(term2531, term2531.getClass(), "stringCache", null);
        setLongField(term2531, term2531.getClass(), "intCompact", -9223372036854775808L);
        setField(term2521, term2521.getClass(), "profitValue", term2531);
        setIntField(term2549, term2549.getClass(), "signum", 1);
        setIntElement(term2551, 0, 7298);
        setIntElement(term2551, 1, -1245459431);
        setIntElement(term2551, 2, 154872706);
        setIntElement(term2551, 3, -869635639);
        setIntElement(term2551, 4, 1023248111);
        setIntElement(term2551, 5, 1345698053);
        setField(term2549, term2549.getClass(), "mag", term2551);
        setIntField(term2549, term2549.getClass(), "bitCountPlusOne", 0);
        setIntField(term2549, term2549.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2549, term2549.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2549, term2549.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2548, term2548.getClass(), "intVal", term2549);
        setIntField(term2548, term2548.getClass(), "scale", 53);
        setIntField(term2548, term2548.getClass(), "precision", 0);
        setField(term2548, term2548.getClass(), "stringCache", null);
        setLongField(term2548, term2548.getClass(), "intCompact", -9223372036854775808L);
        setField(term2521, term2521.getClass(), "quantity", term2548);
        setIntField(term2566, term2566.getClass(), "signum", 1);
        setIntElement(term2568, 0, 786);
        setIntElement(term2568, 1, 1645098337);
        setIntElement(term2568, 2, -1661047007);
        setIntElement(term2568, 3, 638909622);
        setIntElement(term2568, 4, 5733837);
        setIntElement(term2568, 5, 1325345559);
        setField(term2566, term2566.getClass(), "mag", term2568);
        setIntField(term2566, term2566.getClass(), "bitCountPlusOne", 0);
        setIntField(term2566, term2566.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2566, term2566.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2566, term2566.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2565, term2565.getClass(), "intVal", term2566);
        setIntField(term2565, term2565.getClass(), "scale", 52);
        setIntField(term2565, term2565.getClass(), "precision", 0);
        setField(term2565, term2565.getClass(), "stringCache", null);
        setLongField(term2565, term2565.getClass(), "intCompact", -9223372036854775808L);
        setField(term2521, term2521.getClass(), "priceDifference", term2565);
        setLongField(term2521, term2521.getClass(), "timeDifference", -7237588299778557629L);
        setField(term2521, term2521.getClass(), "aggregatedTrade", term2583);
        setLongField(term2587, term2587.getClass(), "fastTime", 1645834034896L);
        setField(term2587, term2587.getClass(), "cdate", null);
        setField(term2521, term2521.getClass(), "sellTime", term2587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getbuySellPair", argTypes, term2521, args);
    }

};


