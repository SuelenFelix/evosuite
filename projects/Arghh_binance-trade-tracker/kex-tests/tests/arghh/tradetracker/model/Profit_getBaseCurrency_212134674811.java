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

public class Profit_getBaseCurrency_212134674811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3604;

    public Profit_getBaseCurrency_212134674811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3605 = new Long(-7672528020740371001L);
        Class<? extends Object> term3672 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term3671 = ((Class) term3672).getDeclaredField((String) "BTC");
        ((Field) term3671).setAccessible(true);
        Object enum11 = ((Field) term3671).get((Object) null);
        ArrayList term3665 = new ArrayList();
        term3604 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        Object term3614 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3615 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3617 = (int[]) newIntArray(5);
        Object term3630 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3631 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3633 = (int[]) newIntArray(6);
        Object term3647 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3648 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3650 = (int[]) newIntArray(6);
        Object term3669 = newInstance(Class.forName("java.util.Date"));
        setField(term3604, term3604.getClass(), "id", term3605);
        setField(term3604, term3604.getClass(), "baseCurrency", enum11);
        setIntField(term3615, term3615.getClass(), "signum", 1);
        setIntElement(term3617, 0, 48710373);
        setIntElement(term3617, 1, 64890798);
        setIntElement(term3617, 2, -659971698);
        setIntElement(term3617, 3, -1913216384);
        setIntElement(term3617, 4, 1839951589);
        setField(term3615, term3615.getClass(), "mag", term3617);
        setIntField(term3615, term3615.getClass(), "bitCountPlusOne", 0);
        setIntField(term3615, term3615.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3615, term3615.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3615, term3615.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3614, term3614.getClass(), "intVal", term3615);
        setIntField(term3614, term3614.getClass(), "scale", 48);
        setIntField(term3614, term3614.getClass(), "precision", 0);
        setField(term3614, term3614.getClass(), "stringCache", null);
        setLongField(term3614, term3614.getClass(), "intCompact", -9223372036854775808L);
        setField(term3604, term3604.getClass(), "profitValue", term3614);
        setIntField(term3631, term3631.getClass(), "signum", 1);
        setIntElement(term3633, 0, 36321);
        setIntElement(term3633, 1, 890586911);
        setIntElement(term3633, 2, 533461247);
        setIntElement(term3633, 3, -197479270);
        setIntElement(term3633, 4, 441193201);
        setIntElement(term3633, 5, 1818442159);
        setField(term3631, term3631.getClass(), "mag", term3633);
        setIntField(term3631, term3631.getClass(), "bitCountPlusOne", 0);
        setIntField(term3631, term3631.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3631, term3631.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3631, term3631.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3630, term3630.getClass(), "intVal", term3631);
        setIntField(term3630, term3630.getClass(), "scale", 53);
        setIntField(term3630, term3630.getClass(), "precision", 0);
        setField(term3630, term3630.getClass(), "stringCache", null);
        setLongField(term3630, term3630.getClass(), "intCompact", -9223372036854775808L);
        setField(term3604, term3604.getClass(), "quantity", term3630);
        setIntField(term3648, term3648.getClass(), "signum", 1);
        setIntElement(term3650, 0, 4);
        setIntElement(term3650, 1, -448781957);
        setIntElement(term3650, 2, 955142502);
        setIntElement(term3650, 3, -1250231940);
        setIntElement(term3650, 4, 1125474925);
        setIntElement(term3650, 5, 1350206369);
        setField(term3648, term3648.getClass(), "mag", term3650);
        setIntField(term3648, term3648.getClass(), "bitCountPlusOne", 0);
        setIntField(term3648, term3648.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3648, term3648.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3648, term3648.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3647, term3647.getClass(), "intVal", term3648);
        setIntField(term3647, term3647.getClass(), "scale", 49);
        setIntField(term3647, term3647.getClass(), "precision", 0);
        setField(term3647, term3647.getClass(), "stringCache", null);
        setLongField(term3647, term3647.getClass(), "intCompact", -9223372036854775808L);
        setField(term3604, term3604.getClass(), "priceDifference", term3647);
        setLongField(term3604, term3604.getClass(), "timeDifference", -872011222785455006L);
        setField(term3604, term3604.getClass(), "aggregatedTrade", term3665);
        setLongField(term3669, term3669.getClass(), "fastTime", 1550698994689L);
        setField(term3669, term3669.getClass(), "cdate", null);
        setField(term3604, term3604.getClass(), "sellTime", term3669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseCurrency", argTypes, term3604, args);
    }

};


