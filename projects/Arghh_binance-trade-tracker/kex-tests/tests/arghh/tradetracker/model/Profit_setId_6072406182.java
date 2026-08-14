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

public class Profit_setId_6072406182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332;
     Object term400;

    public Profit_setId_6072406182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term333 = new Long(6375119433582206027L);
        Class<? extends Object> term403 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term402 = ((Class) term403).getDeclaredField((String) "ETH");
        ((Field) term402).setAccessible(true);
        Object enum1 = ((Field) term402).get((Object) null);
        ArrayList term394 = new ArrayList();
        term332 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        Object term342 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term343 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term345 = (int[]) newIntArray(6);
        Object term359 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term360 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term362 = (int[]) newIntArray(6);
        Object term376 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term377 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term379 = (int[]) newIntArray(6);
        Object term398 = newInstance(Class.forName("java.util.Date"));
        setField(term332, term332.getClass(), "id", term333);
        setField(term332, term332.getClass(), "baseCurrency", enum1);
        setIntField(term343, term343.getClass(), "signum", 1);
        setIntElement(term345, 0, 3726);
        setIntElement(term345, 1, 1561510548);
        setIntElement(term345, 2, 756973629);
        setIntElement(term345, 3, -1169068666);
        setIntElement(term345, 4, -1772498162);
        setIntElement(term345, 5, -1207241473);
        setField(term343, term343.getClass(), "mag", term345);
        setIntField(term343, term343.getClass(), "bitCountPlusOne", 0);
        setIntField(term343, term343.getClass(), "bitLengthPlusOne", 0);
        setIntField(term343, term343.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term343, term343.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term342, term342.getClass(), "intVal", term343);
        setIntField(term342, term342.getClass(), "scale", 52);
        setIntField(term342, term342.getClass(), "precision", 0);
        setField(term342, term342.getClass(), "stringCache", null);
        setLongField(term342, term342.getClass(), "intCompact", -9223372036854775808L);
        setField(term332, term332.getClass(), "profitValue", term342);
        setIntField(term360, term360.getClass(), "signum", 1);
        setIntElement(term362, 0, 1954);
        setIntElement(term362, 1, -476668863);
        setIntElement(term362, 2, 661030673);
        setIntElement(term362, 3, 328061253);
        setIntElement(term362, 4, -431156338);
        setIntElement(term362, 5, 791621529);
        setField(term360, term360.getClass(), "mag", term362);
        setIntField(term360, term360.getClass(), "bitCountPlusOne", 0);
        setIntField(term360, term360.getClass(), "bitLengthPlusOne", 0);
        setIntField(term360, term360.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term360, term360.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term359, term359.getClass(), "intVal", term360);
        setIntField(term359, term359.getClass(), "scale", 52);
        setIntField(term359, term359.getClass(), "precision", 0);
        setField(term359, term359.getClass(), "stringCache", null);
        setLongField(term359, term359.getClass(), "intCompact", -9223372036854775808L);
        setField(term332, term332.getClass(), "quantity", term359);
        setIntField(term377, term377.getClass(), "signum", 1);
        setIntElement(term379, 0, 27489);
        setIntElement(term379, 1, -274433180);
        setIntElement(term379, 2, 698548608);
        setIntElement(term379, 3, -1143703655);
        setIntElement(term379, 4, 1619765041);
        setIntElement(term379, 5, -418227111);
        setField(term377, term377.getClass(), "mag", term379);
        setIntField(term377, term377.getClass(), "bitCountPlusOne", 0);
        setIntField(term377, term377.getClass(), "bitLengthPlusOne", 0);
        setIntField(term377, term377.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term377, term377.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term376, term376.getClass(), "intVal", term377);
        setIntField(term376, term376.getClass(), "scale", 53);
        setIntField(term376, term376.getClass(), "precision", 0);
        setField(term376, term376.getClass(), "stringCache", null);
        setLongField(term376, term376.getClass(), "intCompact", -9223372036854775808L);
        setField(term332, term332.getClass(), "priceDifference", term376);
        setLongField(term332, term332.getClass(), "timeDifference", 6375119433582206027L);
        setField(term332, term332.getClass(), "aggregatedTrade", term394);
        setLongField(term398, term398.getClass(), "fastTime", 1480438351369L);
        setField(term398, term398.getClass(), "cdate", null);
        setField(term332, term332.getClass(), "sellTime", term398);
        term400 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term400;
        callMethod(klass, "setId", argTypes, term332, args);
    }

};


