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

public class ForexRateBooking_getTimestamp_3067110925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15859;

    public ForexRateBooking_getTimestamp_3067110925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15860 = new Long(-2850532706972744550L);
        Double term15889 = new Double(0.9126850255993704);
        Class<? extends Object> term15954 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term15953 = ((Class) term15954).getDeclaredField((String) "SELL");
        ((Field) term15953).setAccessible(true);
        Object enum37 = ((Field) term15953).get((Object) null);
        Long term15931 = new Long(-2644215923136513282L);
        term15859 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        Object term15862 = newInstance(Class.forName("java.time.Instant"));
        Object term15899 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term15900 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term15902 = (int[]) newIntArray(6);
        Object term15928 = newInstance(Class.forName("java.time.Instant"));
        setField(term15859, term15859.getClass(), "id", term15860);
        setLongField(term15862, term15862.getClass(), "seconds", 1745462962L);
        setIntField(term15862, term15862.getClass(), "nanos", 80000000);
        setField(term15859, term15859.getClass(), "timestamp", term15862);
        setField(term15859, term15859.getClass(), "baseCurrency", "SFqCrhEWLm");
        setField(term15859, term15859.getClass(), "counterCurrency", "GZdcJyZntS");
        setField(term15859, term15859.getClass(), "rate", term15889);
        setField(term15859, term15859.getClass(), "tradeAction", enum37);
        setIntField(term15900, term15900.getClass(), "signum", 1);
        setIntElement(term15902, 0, 21910);
        setIntElement(term15902, 1, 1232338756);
        setIntElement(term15902, 2, -1082493650);
        setIntElement(term15902, 3, 2096909910);
        setIntElement(term15902, 4, -386707863);
        setIntElement(term15902, 5, -1583619851);
        setField(term15900, term15900.getClass(), "mag", term15902);
        setIntField(term15900, term15900.getClass(), "bitCountPlusOne", 0);
        setIntField(term15900, term15900.getClass(), "bitLengthPlusOne", 0);
        setIntField(term15900, term15900.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term15900, term15900.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term15899, term15899.getClass(), "intVal", term15900);
        setIntField(term15899, term15899.getClass(), "scale", 53);
        setIntField(term15899, term15899.getClass(), "precision", 0);
        setField(term15899, term15899.getClass(), "stringCache", null);
        setLongField(term15899, term15899.getClass(), "intCompact", -9223372036854775808L);
        setField(term15859, term15859.getClass(), "baseCurrencyAmount", term15899);
        setField(term15859, term15859.getClass(), "bookingRef", "OIHoJeysUi");
        setLongField(term15928, term15928.getClass(), "seconds", 1349069753L);
        setIntField(term15928, term15928.getClass(), "nanos", 960000000);
        setField(term15859, term15859.getClass(), "expiryTime", term15928);
        setField(term15859, term15859.getClass(), "customerId", term15931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimestamp", argTypes, term15859, args);
    }

};


