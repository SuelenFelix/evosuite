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

public class ForexRateBooking_getBaseCurrency_8641511396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16223;

    public ForexRateBooking_getBaseCurrency_8641511396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16224 = new Long(-1468719814009985452L);
        Double term16253 = new Double(0.11179067076100713);
        Class<? extends Object> term16318 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term16317 = ((Class) term16318).getDeclaredField((String) "SELL");
        ((Field) term16317).setAccessible(true);
        Object enum38 = ((Field) term16317).get((Object) null);
        Long term16295 = new Long(-7738503207562305297L);
        term16223 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term16226 = newInstance(Class.forName("java.time.Instant"));
        Object term16263 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term16264 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term16266 = (int[]) newIntArray(6);
        Object term16292 = newInstance(Class.forName("java.time.Instant"));
        setField(term16223, term16223.getClass(), "id", term16224);
        setLongField(term16226, term16226.getClass(), "seconds", 1706078172L);
        setIntField(term16226, term16226.getClass(), "nanos", 457000000);
        setField(term16223, term16223.getClass(), "timestamp", term16226);
        setField(term16223, term16223.getClass(), "baseCurrency", "WXMWFDGcLB");
        setField(term16223, term16223.getClass(), "counterCurrency", "wKWbJssZuG");
        setField(term16223, term16223.getClass(), "rate", term16253);
        setField(term16223, term16223.getClass(), "tradeAction", enum38);
        setIntField(term16264, term16264.getClass(), "signum", 1);
        setIntElement(term16266, 0, 15498);
        setIntElement(term16266, 1, -1390712929);
        setIntElement(term16266, 2, 1617799219);
        setIntElement(term16266, 3, -903553597);
        setIntElement(term16266, 4, -1997977581);
        setIntElement(term16266, 5, -2052139129);
        setField(term16264, term16264.getClass(), "mag", term16266);
        setIntField(term16264, term16264.getClass(), "bitCountPlusOne", 0);
        setIntField(term16264, term16264.getClass(), "bitLengthPlusOne", 0);
        setIntField(term16264, term16264.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term16264, term16264.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term16263, term16263.getClass(), "intVal", term16264);
        setIntField(term16263, term16263.getClass(), "scale", 53);
        setIntField(term16263, term16263.getClass(), "precision", 0);
        setField(term16263, term16263.getClass(), "stringCache", null);
        setLongField(term16263, term16263.getClass(), "intCompact", -9223372036854775808L);
        setField(term16223, term16223.getClass(), "baseCurrencyAmount", term16263);
        setField(term16223, term16223.getClass(), "bookingRef", "NzBMMhkhpT");
        setLongField(term16292, term16292.getClass(), "seconds", 1863631094L);
        setIntField(term16292, term16292.getClass(), "nanos", 992000000);
        setField(term16223, term16223.getClass(), "expiryTime", term16292);
        setField(term16223, term16223.getClass(), "customerId", term16295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseCurrency", argTypes, term16223, args);
    }

};


