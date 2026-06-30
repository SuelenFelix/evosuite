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

public class ForexRateBookingReq_getBaseCurrencyAmount_7924296913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1951;

    public ForexRateBookingReq_getBaseCurrencyAmount_7924296913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2029 = Class.forName((String) "space.gavinklfong.invest.forex.dtos.TradeAction");
        Field term2028 = ((Class) term2029).getDeclaredField((String) "BUY");
        ((Field) term2028).setAccessible(true);
        Object enum4 = ((Field) term2028).get((Object) null);
        Long term2000 = new Long(-8257434502486459194L);
        term1951 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq"));
        Object term1976 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1977 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1979 = (int[]) newIntArray(6);
        setField(term1951, term1951.getClass(), "baseCurrency", "Ghbwtircqb");
        setField(term1951, term1951.getClass(), "counterCurrency", "xrwlQZdwCp");
        setIntField(term1977, term1977.getClass(), "signum", 1);
        setIntElement(term1979, 0, 3779);
        setIntElement(term1979, 1, 1825499203);
        setIntElement(term1979, 2, 189827582);
        setIntElement(term1979, 3, 731025545);
        setIntElement(term1979, 4, -475097163);
        setIntElement(term1979, 5, 890127363);
        setField(term1977, term1977.getClass(), "mag", term1979);
        setIntField(term1977, term1977.getClass(), "bitCountPlusOne", 0);
        setIntField(term1977, term1977.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1977, term1977.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1977, term1977.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1976, term1976.getClass(), "intVal", term1977);
        setIntField(term1976, term1976.getClass(), "scale", 52);
        setIntField(term1976, term1976.getClass(), "precision", 0);
        setField(term1976, term1976.getClass(), "stringCache", null);
        setLongField(term1976, term1976.getClass(), "intCompact", -9223372036854775808L);
        setField(term1951, term1951.getClass(), "baseCurrencyAmount", term1976);
        setField(term1951, term1951.getClass(), "tradeAction", enum4);
        setField(term1951, term1951.getClass(), "customerId", term2000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseCurrencyAmount", argTypes, term1951, args);
    }

};


