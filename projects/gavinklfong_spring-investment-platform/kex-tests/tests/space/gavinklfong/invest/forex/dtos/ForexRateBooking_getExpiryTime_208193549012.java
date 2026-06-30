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

public class ForexRateBooking_getExpiryTime_208193549012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18395;

    public ForexRateBooking_getExpiryTime_208193549012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18396 = new Long(463622836963501975L);
        Double term18425 = new Double(0.7154795600170818);
        Class<? extends Object> term18489 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term18488 = ((Class) term18489).getDeclaredField((String) "BUY");
        ((Field) term18488).setAccessible(true);
        Object enum44 = ((Field) term18488).get((Object) null);
        Long term18466 = new Long(305759998609888272L);
        term18395 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term18398 = newInstance(Class.forName("java.time.Instant"));
        Object term18434 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term18435 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term18437 = (int[]) newIntArray(6);
        Object term18463 = newInstance(Class.forName("java.time.Instant"));
        setField(term18395, term18395.getClass(), "id", term18396);
        setLongField(term18398, term18398.getClass(), "seconds", 1630952644L);
        setIntField(term18398, term18398.getClass(), "nanos", 759000000);
        setField(term18395, term18395.getClass(), "timestamp", term18398);
        setField(term18395, term18395.getClass(), "baseCurrency", "iIRsCSYqXH");
        setField(term18395, term18395.getClass(), "counterCurrency", "nghfqDXyCG");
        setField(term18395, term18395.getClass(), "rate", term18425);
        setField(term18395, term18395.getClass(), "tradeAction", enum44);
        setIntField(term18435, term18435.getClass(), "signum", 1);
        setIntElement(term18437, 0, 603);
        setIntElement(term18437, 1, -1260367601);
        setIntElement(term18437, 2, 1144972827);
        setIntElement(term18437, 3, -88001541);
        setIntElement(term18437, 4, 347574334);
        setIntElement(term18437, 5, 1686084361);
        setField(term18435, term18435.getClass(), "mag", term18437);
        setIntField(term18435, term18435.getClass(), "bitCountPlusOne", 0);
        setIntField(term18435, term18435.getClass(), "bitLengthPlusOne", 0);
        setIntField(term18435, term18435.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term18435, term18435.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term18434, term18434.getClass(), "intVal", term18435);
        setIntField(term18434, term18434.getClass(), "scale", 51);
        setIntField(term18434, term18434.getClass(), "precision", 0);
        setField(term18434, term18434.getClass(), "stringCache", null);
        setLongField(term18434, term18434.getClass(), "intCompact", -9223372036854775808L);
        setField(term18395, term18395.getClass(), "baseCurrencyAmount", term18434);
        setField(term18395, term18395.getClass(), "bookingRef", "WBAOTqErtm");
        setLongField(term18463, term18463.getClass(), "seconds", 1739417792L);
        setIntField(term18463, term18463.getClass(), "nanos", 956000000);
        setField(term18395, term18395.getClass(), "expiryTime", term18463);
        setField(term18395, term18395.getClass(), "customerId", term18466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpiryTime", argTypes, term18395, args);
    }

};


