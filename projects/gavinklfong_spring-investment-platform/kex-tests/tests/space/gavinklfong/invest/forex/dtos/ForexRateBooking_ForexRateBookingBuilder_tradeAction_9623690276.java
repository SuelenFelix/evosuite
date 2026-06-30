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

public class ForexRateBooking_ForexRateBookingBuilder_tradeAction_9623690276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36336;
     Object enum90;

    public ForexRateBooking_ForexRateBookingBuilder_tradeAction_9623690276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term36337 = new Long(4266570509071948633L);
        Double term36366 = new Double(0.9165240441138934);
        Class<? extends Object> term36431 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term36430 = ((Class) term36431).getDeclaredField((String) "SELL");
        ((Field) term36430).setAccessible(true);
        enum90 = ((Field) term36430).get((Object) null);
        Long term36408 = new Long(-7291742736502427077L);
        term36336 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder"));
        Object term36339 = newInstance(Class.forName("java.time.Instant"));
        Object term36376 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term36377 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term36379 = (int[]) newIntArray(6);
        Object term36405 = newInstance(Class.forName("java.time.Instant"));
        setField(term36336, term36336.getClass(), "id", term36337);
        setLongField(term36339, term36339.getClass(), "seconds", 1818968525L);
        setIntField(term36339, term36339.getClass(), "nanos", 805000000);
        setField(term36336, term36336.getClass(), "timestamp", term36339);
        setField(term36336, term36336.getClass(), "baseCurrency", "SScVQYSvWH");
        setField(term36336, term36336.getClass(), "counterCurrency", "MnovcqFhCl");
        setField(term36336, term36336.getClass(), "rate", term36366);
        setField(term36336, term36336.getClass(), "tradeAction", enum90);
        setIntField(term36377, term36377.getClass(), "signum", 1);
        setIntElement(term36379, 0, 37031);
        setIntElement(term36379, 1, -1477309780);
        setIntElement(term36379, 2, -1859636829);
        setIntElement(term36379, 3, 844731048);
        setIntElement(term36379, 4, -1562971959);
        setIntElement(term36379, 5, -2095839705);
        setField(term36377, term36377.getClass(), "mag", term36379);
        setIntField(term36377, term36377.getClass(), "bitCountPlusOne", 0);
        setIntField(term36377, term36377.getClass(), "bitLengthPlusOne", 0);
        setIntField(term36377, term36377.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term36377, term36377.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term36376, term36376.getClass(), "intVal", term36377);
        setIntField(term36376, term36376.getClass(), "scale", 53);
        setIntField(term36376, term36376.getClass(), "precision", 0);
        setField(term36376, term36376.getClass(), "stringCache", null);
        setLongField(term36376, term36376.getClass(), "intCompact", -9223372036854775808L);
        setField(term36336, term36336.getClass(), "baseCurrencyAmount", term36376);
        setField(term36336, term36336.getClass(), "bookingRef", "qYtAeLzOhW");
        setLongField(term36405, term36405.getClass(), "seconds", 1603905786L);
        setIntField(term36405, term36405.getClass(), "nanos", 801000000);
        setField(term36336, term36336.getClass(), "expiryTime", term36405);
        setField(term36336, term36336.getClass(), "customerId", term36408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("space.gavinklfong.invest.forex.dtos.TradeAction");
        Object[] args = new Object[1];
        args[0] = enum90;
        callMethod(klass, "tradeAction", argTypes, term36336, args);
    }

};


