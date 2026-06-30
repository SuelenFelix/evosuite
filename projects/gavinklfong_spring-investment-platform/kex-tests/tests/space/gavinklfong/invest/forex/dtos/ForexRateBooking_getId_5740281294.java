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

public class ForexRateBooking_getId_5740281294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15497;

    public ForexRateBooking_getId_5740281294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15498 = new Long(2936323121573284007L);
        Double term15527 = new Double(0.13246999699526574);
        Class<? extends Object> term15591 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term15590 = ((Class) term15591).getDeclaredField((String) "SELL");
        ((Field) term15590).setAccessible(true);
        Object enum36 = ((Field) term15590).get((Object) null);
        Long term15568 = new Long(-1154553077993834885L);
        term15497 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term15500 = newInstance(Class.forName("java.time.Instant"));
        Object term15537 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term15538 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term15540 = (int[]) newIntArray(5);
        Object term15565 = newInstance(Class.forName("java.time.Instant"));
        setField(term15497, term15497.getClass(), "id", term15498);
        setLongField(term15500, term15500.getClass(), "seconds", 1797203628L);
        setIntField(term15500, term15500.getClass(), "nanos", 25000000);
        setField(term15497, term15497.getClass(), "timestamp", term15500);
        setField(term15497, term15497.getClass(), "baseCurrency", "zcorEihhLK");
        setField(term15497, term15497.getClass(), "counterCurrency", "GrqozDKFOk");
        setField(term15497, term15497.getClass(), "rate", term15527);
        setField(term15497, term15497.getClass(), "tradeAction", enum36);
        setIntField(term15538, term15538.getClass(), "signum", 1);
        setIntElement(term15540, 0, 1551440818);
        setIntElement(term15540, 1, 344453067);
        setIntElement(term15540, 2, 133967669);
        setIntElement(term15540, 3, 381677751);
        setIntElement(term15540, 4, -305602591);
        setField(term15538, term15538.getClass(), "mag", term15540);
        setIntField(term15538, term15538.getClass(), "bitCountPlusOne", 0);
        setIntField(term15538, term15538.getClass(), "bitLengthPlusOne", 0);
        setIntField(term15538, term15538.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term15538, term15538.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term15537, term15537.getClass(), "intVal", term15538);
        setIntField(term15537, term15537.getClass(), "scale", 48);
        setIntField(term15537, term15537.getClass(), "precision", 0);
        setField(term15537, term15537.getClass(), "stringCache", null);
        setLongField(term15537, term15537.getClass(), "intCompact", -9223372036854775808L);
        setField(term15497, term15497.getClass(), "baseCurrencyAmount", term15537);
        setField(term15497, term15497.getClass(), "bookingRef", "CFyoseFGLF");
        setLongField(term15565, term15565.getClass(), "seconds", 1589457921L);
        setIntField(term15565, term15565.getClass(), "nanos", 30000000);
        setField(term15497, term15497.getClass(), "expiryTime", term15565);
        setField(term15497, term15497.getClass(), "customerId", term15568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term15497, args);
    }

};


