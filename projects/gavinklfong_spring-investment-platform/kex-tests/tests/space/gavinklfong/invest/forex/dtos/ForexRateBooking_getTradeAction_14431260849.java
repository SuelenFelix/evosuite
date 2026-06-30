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
import java.lang.Long;
import java.lang.Object;
import java.lang.Double;
import java.lang.String;

public class ForexRateBooking_getTradeAction_14431260849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17307;

    public ForexRateBooking_getTradeAction_14431260849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17308 = new Long(7994303628307559416L);
        Double term17337 = new Double(0.025133051616627267);
        Class<? extends Object> term17401 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term17400 = ((Class) term17401).getDeclaredField((String) "BUY");
        ((Field) term17400).setAccessible(true);
        Object enum41 = ((Field) term17400).get((Object) null);
        Long term17378 = new Long(2443640364875054177L);
        term17307 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term17310 = newInstance(Class.forName("java.time.Instant"));
        Object term17346 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term17347 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term17349 = (int[]) newIntArray(6);
        Object term17375 = newInstance(Class.forName("java.time.Instant"));
        setField(term17307, term17307.getClass(), "id", term17308);
        setLongField(term17310, term17310.getClass(), "seconds", 1550698994L);
        setIntField(term17310, term17310.getClass(), "nanos", 689000000);
        setField(term17307, term17307.getClass(), "timestamp", term17310);
        setField(term17307, term17307.getClass(), "baseCurrency", "xvkbvaEGYd");
        setField(term17307, term17307.getClass(), "counterCurrency", "HBGNxdNURv");
        setField(term17307, term17307.getClass(), "rate", term17337);
        setField(term17307, term17307.getClass(), "tradeAction", enum41);
        setIntField(term17347, term17347.getClass(), "signum", 1);
        setIntElement(term17349, 0, 43771);
        setIntElement(term17349, 1, -2064049935);
        setIntElement(term17349, 2, 2069770836);
        setIntElement(term17349, 3, 478634100);
        setIntElement(term17349, 4, -643849105);
        setIntElement(term17349, 5, -507036065);
        setField(term17347, term17347.getClass(), "mag", term17349);
        setIntField(term17347, term17347.getClass(), "bitCountPlusOne", 0);
        setIntField(term17347, term17347.getClass(), "bitLengthPlusOne", 0);
        setIntField(term17347, term17347.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term17347, term17347.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term17346, term17346.getClass(), "intVal", term17347);
        setIntField(term17346, term17346.getClass(), "scale", 53);
        setIntField(term17346, term17346.getClass(), "precision", 0);
        setField(term17346, term17346.getClass(), "stringCache", null);
        setLongField(term17346, term17346.getClass(), "intCompact", -9223372036854775808L);
        setField(term17307, term17307.getClass(), "baseCurrencyAmount", term17346);
        setField(term17307, term17307.getClass(), "bookingRef", "mfCpTPPQQm");
        setLongField(term17375, term17375.getClass(), "seconds", 1804998087L);
        setIntField(term17375, term17375.getClass(), "nanos", 131000000);
        setField(term17307, term17307.getClass(), "expiryTime", term17375);
        setField(term17307, term17307.getClass(), "customerId", term17378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTradeAction", argTypes, term17307, args);
    }

};


