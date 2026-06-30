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
import java.lang.Object;
import java.lang.String;
import java.lang.Long;

public class ForexRateBookingReq_equals_141645937811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4922;
     Object term4974;

    public ForexRateBookingReq_equals_141645937811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5002 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term5001 = ((Class) term5002).getDeclaredField((String) "SELL");
        ((Field) term5001).setAccessible(true);
        Object enum13 = ((Field) term5001).get((Object) null);
        Long term4972 = new Long(-8885298608300233488L);
        term4922 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq"));
        Object term4947 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4948 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4950 = (int[]) newIntArray(6);
        setField(term4922, term4922.getClass(), "baseCurrency", "JDswTTCZHV");
        setField(term4922, term4922.getClass(), "counterCurrency", "onpbIeEKoi");
        setIntField(term4948, term4948.getClass(), "signum", 1);
        setIntElement(term4950, 0, 35465);
        setIntElement(term4950, 1, 1599162976);
        setIntElement(term4950, 2, -1427811280);
        setIntElement(term4950, 3, -224241601);
        setIntElement(term4950, 4, -1115150417);
        setIntElement(term4950, 5, 212641299);
        setField(term4948, term4948.getClass(), "mag", term4950);
        setIntField(term4948, term4948.getClass(), "bitCountPlusOne", 0);
        setIntField(term4948, term4948.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4948, term4948.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4948, term4948.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4947, term4947.getClass(), "intVal", term4948);
        setIntField(term4947, term4947.getClass(), "scale", 53);
        setIntField(term4947, term4947.getClass(), "precision", 0);
        setField(term4947, term4947.getClass(), "stringCache", null);
        setLongField(term4947, term4947.getClass(), "intCompact", -9223372036854775808L);
        setField(term4922, term4922.getClass(), "baseCurrencyAmount", term4947);
        setField(term4922, term4922.getClass(), "tradeAction", enum13);
        setField(term4922, term4922.getClass(), "customerId", term4972);
        term4974 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4974;
        callMethod(klass, "equals", argTypes, term4922, args);
    }

};


