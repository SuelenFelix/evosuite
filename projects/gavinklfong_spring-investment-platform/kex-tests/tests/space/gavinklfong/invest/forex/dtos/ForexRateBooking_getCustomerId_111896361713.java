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

public class ForexRateBooking_getCustomerId_111896361713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18755;

    public ForexRateBooking_getCustomerId_111896361713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18756 = new Long(-8654565919063661957L);
        Double term18785 = new Double(0.6355029654528058);
        Class<? extends Object> term18850 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term18849 = ((Class) term18850).getDeclaredField((String) "SELL");
        ((Field) term18849).setAccessible(true);
        Object enum45 = ((Field) term18849).get((Object) null);
        Long term18827 = new Long(-5248475803419977214L);
        term18755 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term18758 = newInstance(Class.forName("java.time.Instant"));
        Object term18795 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term18796 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term18798 = (int[]) newIntArray(6);
        Object term18824 = newInstance(Class.forName("java.time.Instant"));
        setField(term18755, term18755.getClass(), "id", term18756);
        setLongField(term18758, term18758.getClass(), "seconds", 1329640267L);
        setIntField(term18758, term18758.getClass(), "nanos", 573000000);
        setField(term18755, term18755.getClass(), "timestamp", term18758);
        setField(term18755, term18755.getClass(), "baseCurrency", "PqtVXXZMqK");
        setField(term18755, term18755.getClass(), "counterCurrency", "rYbtIDVdnd");
        setField(term18755, term18755.getClass(), "rate", term18785);
        setField(term18755, term18755.getClass(), "tradeAction", enum45);
        setIntField(term18796, term18796.getClass(), "signum", 1);
        setIntElement(term18798, 0, 1500);
        setIntElement(term18798, 1, 583251543);
        setIntElement(term18798, 2, 1353928515);
        setIntElement(term18798, 3, -1884531673);
        setIntElement(term18798, 4, 1102760999);
        setIntElement(term18798, 5, 468388505);
        setField(term18796, term18796.getClass(), "mag", term18798);
        setIntField(term18796, term18796.getClass(), "bitCountPlusOne", 0);
        setIntField(term18796, term18796.getClass(), "bitLengthPlusOne", 0);
        setIntField(term18796, term18796.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term18796, term18796.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term18795, term18795.getClass(), "intVal", term18796);
        setIntField(term18795, term18795.getClass(), "scale", 52);
        setIntField(term18795, term18795.getClass(), "precision", 0);
        setField(term18795, term18795.getClass(), "stringCache", null);
        setLongField(term18795, term18795.getClass(), "intCompact", -9223372036854775808L);
        setField(term18755, term18755.getClass(), "baseCurrencyAmount", term18795);
        setField(term18755, term18755.getClass(), "bookingRef", "UKAReurpHG");
        setLongField(term18824, term18824.getClass(), "seconds", 1334853104L);
        setIntField(term18824, term18824.getClass(), "nanos", 718000000);
        setField(term18755, term18755.getClass(), "expiryTime", term18824);
        setField(term18755, term18755.getClass(), "customerId", term18827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomerId", argTypes, term18755, args);
    }

};


