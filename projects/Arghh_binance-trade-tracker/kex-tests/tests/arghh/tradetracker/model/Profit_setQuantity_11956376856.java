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

public class Profit_setQuantity_11956376856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1565;
     Object term1634;

    public Profit_setQuantity_11956376856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1566 = new Long(4872422362414183754L);
        Class<? extends Object> term1652 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term1651 = ((Class) term1652).getDeclaredField((String) "USDT");
        ((Field) term1651).setAccessible(true);
        Object enum5 = ((Field) term1651).get((Object) null);
        ArrayList term1628 = new ArrayList();
        term1565 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        Object term1576 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1577 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1579 = (int[]) newIntArray(6);
        Object term1593 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1594 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1596 = (int[]) newIntArray(6);
        Object term1610 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1611 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1613 = (int[]) newIntArray(6);
        Object term1632 = newInstance(Class.forName("java.util.Date"));
        setField(term1565, term1565.getClass(), "id", term1566);
        setField(term1565, term1565.getClass(), "baseCurrency", enum5);
        setIntField(term1577, term1577.getClass(), "signum", 1);
        setIntElement(term1579, 0, 6724);
        setIntElement(term1579, 1, -459858691);
        setIntElement(term1579, 2, -950374219);
        setIntElement(term1579, 3, -1430160029);
        setIntElement(term1579, 4, 1532735250);
        setIntElement(term1579, 5, 890914777);
        setField(term1577, term1577.getClass(), "mag", term1579);
        setIntField(term1577, term1577.getClass(), "bitCountPlusOne", 0);
        setIntField(term1577, term1577.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1577, term1577.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1577, term1577.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1576, term1576.getClass(), "intVal", term1577);
        setIntField(term1576, term1576.getClass(), "scale", 52);
        setIntField(term1576, term1576.getClass(), "precision", 0);
        setField(term1576, term1576.getClass(), "stringCache", null);
        setLongField(term1576, term1576.getClass(), "intCompact", -9223372036854775808L);
        setField(term1565, term1565.getClass(), "profitValue", term1576);
        setIntField(term1594, term1594.getClass(), "signum", 1);
        setIntElement(term1596, 0, 190);
        setIntElement(term1596, 1, 842222845);
        setIntElement(term1596, 2, 1366336864);
        setIntElement(term1596, 3, -295316729);
        setIntElement(term1596, 4, 1173791667);
        setIntElement(term1596, 5, -522535689);
        setField(term1594, term1594.getClass(), "mag", term1596);
        setIntField(term1594, term1594.getClass(), "bitCountPlusOne", 0);
        setIntField(term1594, term1594.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1594, term1594.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1594, term1594.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1593, term1593.getClass(), "intVal", term1594);
        setIntField(term1593, term1593.getClass(), "scale", 51);
        setIntField(term1593, term1593.getClass(), "precision", 0);
        setField(term1593, term1593.getClass(), "stringCache", null);
        setLongField(term1593, term1593.getClass(), "intCompact", -9223372036854775808L);
        setField(term1565, term1565.getClass(), "quantity", term1593);
        setIntField(term1611, term1611.getClass(), "signum", 1);
        setIntElement(term1613, 0, 4404);
        setIntElement(term1613, 1, 763521092);
        setIntElement(term1613, 2, 665076742);
        setIntElement(term1613, 3, 66292673);
        setIntElement(term1613, 4, 275037375);
        setIntElement(term1613, 5, 1545486489);
        setField(term1611, term1611.getClass(), "mag", term1613);
        setIntField(term1611, term1611.getClass(), "bitCountPlusOne", 0);
        setIntField(term1611, term1611.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1611, term1611.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1611, term1611.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1610, term1610.getClass(), "intVal", term1611);
        setIntField(term1610, term1610.getClass(), "scale", 52);
        setIntField(term1610, term1610.getClass(), "precision", 0);
        setField(term1610, term1610.getClass(), "stringCache", null);
        setLongField(term1610, term1610.getClass(), "intCompact", -9223372036854775808L);
        setField(term1565, term1565.getClass(), "priceDifference", term1610);
        setLongField(term1565, term1565.getClass(), "timeDifference", 7411271909051562686L);
        setField(term1565, term1565.getClass(), "aggregatedTrade", term1628);
        setLongField(term1632, term1632.getClass(), "fastTime", 1515890130018L);
        setField(term1632, term1632.getClass(), "cdate", null);
        setField(term1565, term1565.getClass(), "sellTime", term1632);
        term1634 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1635 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1637 = (int[]) newIntArray(6);
        setIntField(term1635, term1635.getClass(), "signum", 1);
        setIntElement(term1637, 0, 5017);
        setIntElement(term1637, 1, 1138264108);
        setIntElement(term1637, 2, 138609451);
        setIntElement(term1637, 3, -559929925);
        setIntElement(term1637, 4, -1000035065);
        setIntElement(term1637, 5, 1199074337);
        setField(term1635, term1635.getClass(), "mag", term1637);
        setIntField(term1635, term1635.getClass(), "bitCountPlusOne", 0);
        setIntField(term1635, term1635.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1635, term1635.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1635, term1635.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1634, term1634.getClass(), "intVal", term1635);
        setIntField(term1634, term1634.getClass(), "scale", 52);
        setIntField(term1634, term1634.getClass(), "precision", 0);
        setField(term1634, term1634.getClass(), "stringCache", null);
        setLongField(term1634, term1634.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term1634;
        callMethod(klass, "setQuantity", argTypes, term1565, args);
    }

};


