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

public class ForexRateBooking_setCounterCurrency_1287843617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20234;

    public ForexRateBooking_setCounterCurrency_1287843617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20235 = new Long(7862575738391801707L);
        Double term20264 = new Double(0.6047137830113202);
        Class<? extends Object> term20341 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term20340 = ((Class) term20341).getDeclaredField((String) "SELL");
        ((Field) term20340).setAccessible(true);
        Object enum49 = ((Field) term20340).get((Object) null);
        Long term20306 = new Long(50358265865610362L);
        term20234 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term20237 = newInstance(Class.forName("java.time.Instant"));
        Object term20274 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term20275 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term20277 = (int[]) newIntArray(6);
        Object term20303 = newInstance(Class.forName("java.time.Instant"));
        setField(term20234, term20234.getClass(), "id", term20235);
        setLongField(term20237, term20237.getClass(), "seconds", 1311560117L);
        setIntField(term20237, term20237.getClass(), "nanos", 361000000);
        setField(term20234, term20234.getClass(), "timestamp", term20237);
        setField(term20234, term20234.getClass(), "baseCurrency", "lCyLIcSuom");
        setField(term20234, term20234.getClass(), "counterCurrency", "CGOpQSZZwI");
        setField(term20234, term20234.getClass(), "rate", term20264);
        setField(term20234, term20234.getClass(), "tradeAction", enum49);
        setIntField(term20275, term20275.getClass(), "signum", 1);
        setIntElement(term20277, 0, 10891);
        setIntElement(term20277, 1, 1837684186);
        setIntElement(term20277, 2, 743301559);
        setIntElement(term20277, 3, -480066104);
        setIntElement(term20277, 4, -1949519473);
        setIntElement(term20277, 5, 454532489);
        setField(term20275, term20275.getClass(), "mag", term20277);
        setIntField(term20275, term20275.getClass(), "bitCountPlusOne", 0);
        setIntField(term20275, term20275.getClass(), "bitLengthPlusOne", 0);
        setIntField(term20275, term20275.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term20275, term20275.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term20274, term20274.getClass(), "intVal", term20275);
        setIntField(term20274, term20274.getClass(), "scale", 53);
        setIntField(term20274, term20274.getClass(), "precision", 0);
        setField(term20274, term20274.getClass(), "stringCache", null);
        setLongField(term20274, term20274.getClass(), "intCompact", -9223372036854775808L);
        setField(term20234, term20234.getClass(), "baseCurrencyAmount", term20274);
        setField(term20234, term20234.getClass(), "bookingRef", "ypEdrstygY");
        setLongField(term20303, term20303.getClass(), "seconds", 1595517583L);
        setIntField(term20303, term20303.getClass(), "nanos", 842000000);
        setField(term20234, term20234.getClass(), "expiryTime", term20303);
        setField(term20234, term20234.getClass(), "customerId", term20306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sNQFlATEeQ";
        callMethod(klass, "setCounterCurrency", argTypes, term20234, args);
    }

};


